
public class Constructor02 {
	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		//기본 생성자 호출
		Student stObj = new Student();
		
		stObj.insertRecord(20221004, "홍길순");
		stObj.printInfo();
		
		
		//일반 생성자 호출
		//기본 초기값을 가지고 생성가능
		Student stObj2 = new Student(20221005,"홍길동");
		stObj2.printInfo();
	}
}
