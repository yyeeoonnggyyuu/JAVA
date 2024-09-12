
public class Example01 {
//	public static void main(String[] args) {
//		Cat catObj = new Cat();
//		catObj.bread = "페르시안";
//		catObj.color = "red";
//		
//	System.out.println("품종 : " +catObj.bread );
//	System.out.println("컬러 : " +catObj.color );
//	
//	
//		Cat catObj2 = new Cat();
//		catObj2.bread = "달마시안";
//		catObj2.color = "blue";
//		
//		System.out.println("품종 : " +catObj2.bread );
//		System.out.println("컬러 : " +catObj2.color );
//		
//	}
//	
//	
//	
//	

	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	
	public static void main(String[] args) {
		myMethod1();
//		myMethod2();
		
		Example01 myObj = new Example01();
		myObj.myMethod2();
		
	}
}
