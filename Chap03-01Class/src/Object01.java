
public class Object01 {

	public static void main(String[] args) {
		Student stObj1 = new Student();
		//Student라는 클래스로 접근해서 새로운 그것을 stobj1에 넣었다
		//그 후에 밑에 stobj1.id .name 으로 id값과 name값을 받아서 출려메서드인 printInfo() 로 출력
//		필드에 접근하기
		stObj1.id = 20221004;
		stObj1.name = "홍길순";
//		출력하기
		stObj1.printInfo();
		
		
//		메서드를 이용해서 메서드 ?만들어보기
		
		//똑같이 스튜던트 클래스르 가져와서 stobj2로 정의하고 그 stobj2는 입력하는 메서드인 insertRecord 에 
//		int id 와 String name 을 입력한 후 출력메서드인 printInfo() 로 출력
		Student stObj2 = new Student();
		
		stObj2.insertRecord(20021005,"홍길동");
		stObj2.printInfo();
		


	}

}
