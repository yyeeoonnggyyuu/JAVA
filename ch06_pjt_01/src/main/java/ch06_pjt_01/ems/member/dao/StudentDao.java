package ch06_pjt_01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch06_pjt_01.ems.member.Student;

public class StudentDao {
	
	private Map<String, Student> studentDB = new HashMap<String, Student>();
//	학사관리시스템 예제1 18분 50초쯤 다시듣시 설명
//	CRED  CRUD ?? 
	
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
//		put . key와 value 값이 필요
//		key : student.getsNum() -> student.java 학생넘버에서 get한 값
//		velue : student
	}
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
//		sNum :학번
//		조회하는이유는 정보받을려고
		
	}
		
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
//		한학생의 정보를 받아서 
//		put key값이 존재하면 값을 바꿔줘 sNum이 put
	}
	
	
	public void delete(String sNum) {
		studentDB.remove(sNum);
//		학생번호만 받아서 리무브(삭제)해줘
	}
	
	public Map<String, Student> getStudentDB(){
		return studentDB;
//		DB를 검색하는 매서드
	}
	
	
}
