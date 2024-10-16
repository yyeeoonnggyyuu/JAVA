package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student; 
import ch04_pjt_01.ems.member.dao.StudentDao; 

public class StudentRegisterService {
	
	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
//		StudentDao 생성자
		this.studentDao = studentDao;
//		studentDao 매개변수
	}
	
	public void register(Student student) {
//		학생정보를 인서트해줘
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already registered");
		}
	}
	
	public boolean verify(String sNum) {
//		verify는 방금받은 학생넘버가 있는건지 없는건지 판별
//		studentDao.select(sNum); 학생정보 조회 매서드 select한거는 student에 넣어서 true인지false인지 판별해줘
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}
}


//boolean verify로 정보가 있는지 없는지 판별하고 위의 if문을 넣어서 true면 insert해주고 false면 거부해줘