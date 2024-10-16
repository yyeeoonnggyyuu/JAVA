package ch04_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.Student;

public class PrintStudentInformationService {

	StudentAllSelectService allSelectService;

	public PrintStudentInformationService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}


	public void printStudentsInfo() {
		Map<String, Student> allStudent = allSelectService.allSelect();
//		Map타입으로 저장된 학생정보를 다 받을거야 그 객체는 Student라는 학생객체
		Set<String> keys = allStudent.keySet();
//		Set이라는 key값만 추출 순서는 없으나 중복을 허용하지않음
		Iterator<String> iterator = keys.iterator();
		System.out.println("STUDENT LIST START --------------------");

		while (iterator.hasNext()) { /*hasNext 는 다음이 빈칸이라면 끝남*/
			String key = iterator.next();
			Student student = allStudent.get(key); /* get(key)로 받은 첫번째 학생의 정보가 다 뿌려줌*/
			System.out.println("sNUm:" + student.getsNum() + "\t");
			System.out.println("|sId" + student.getsId() + "\t");
			System.out.println("|sPw:" + student.getsPw() + "\t");
			System.out.println("|sName:" + student.getsName() + "\t");
			System.out.println("|sAge:" + student.getsAge() + "\t");
			System.out.println("|sGender:" + student.getsGender() + "\t");
			System.out.println("|sMajor:" + student.getsMajor() + "\t");
		}
		System.out.println("END --------------------");
	}
}

