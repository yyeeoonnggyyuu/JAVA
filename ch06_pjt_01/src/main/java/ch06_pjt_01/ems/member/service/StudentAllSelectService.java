package ch06_pjt_01.ems.member.service;

import java.util.Map;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDao; 

public class StudentAllSelectService {

	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {

		this.studentDao = studentDao;
	}
	
//	해쉬맵이 가지고 있는getStudentDB
	public Map<String, Student> allSelect(){
		return studentDao.getStudentDB();
	}
}
