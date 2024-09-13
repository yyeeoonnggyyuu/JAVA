
public class Dog {
	public String breed;
	public String color;
	//protected 접근제한자
	protected int age;
	//private 전급제한자 
	private String name;
	
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}
	
	//protected 접근제한자 호출
	protected void run() {
		System.out.println("달리다");
	}
	
	//private 사용
	private void sleep() {
		System.out.println("잠을 자다");
	}
}
