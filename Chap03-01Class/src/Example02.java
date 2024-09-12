
public class Example02 {

	public void myRole(int age) {
		System.out.println("나는 고양이집사입니다." + age);
	}
	public void myRole(String name) {
		System.out.println("고양이 이름은 : " + name);
	
	}
	public void myRole(int age, String name) {
		System.out.println("고양이 이름은 : "+ name + "나이는 : "+ age);
	}

	static void myRole(double weight) {
		System.out.println("고양이의 몸무게는 :" + weight);
	}
	static void myRole(String nickNema, int age) {
		System.out.println("제 별명은 : "+ nickNema+" 사용년도"+ age);
	}
	public static void main(String[] args) {
		Example02 myObj = new Example02();
		myObj.myRole(18);
		
		myObj.myRole("하닝");
		myObj.myRole(10,"빤쮸");
		
		myRole(12.0);
		myRole(13.05);
		myRole("메롱",4);
	}
}
