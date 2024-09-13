
public class Student {
	int id;
	String name;

	
	//기본 생성자   -  기본생성자는 매개변수가 없어도 자동으로 생성됨
	Student() {
		System.out.println("기본 생성자 Student() 호출");
	}
	
	
	//일반 생성자  - 기본과 다른점은 매개변수를 내가 지정해줘야함 
	Student(int pram1, String pram2){
		System.out.println("일반 생성자 Student(...) 호출");
		id = pram1;
		name = pram2;
	}

	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;

	}

	void printInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
	}
}
