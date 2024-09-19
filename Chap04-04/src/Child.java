
public class Child extends Parent {
	String name ="홍길동";
	
	public void details() {
		super.details();
		System.out.println(name);
		//이아래는 위의 super.details(); 와 같은 것
		System.out.println(super.name);
		
	}
	
	public void printDetails() {
		details();
		System.out.println("부모 이름 : " +  super.name);
		System.out.println("자식 이름 : " + name);
	}
}
