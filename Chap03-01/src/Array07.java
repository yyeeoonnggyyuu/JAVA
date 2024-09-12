

public class Array07 {

	public static void main(String[] args) {
	
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = s1;
		
		if(s1 == s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 같지 않다");
		
		if(s1 == s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 같지않다");
		
		if(s1.equals(s3)) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 같지않다");
		
		if(s1.equals(s2)) System.out.println("s1과 s2는 값은 같다");
		else System.out.println("s1과 s2는 값은 같지 않다");
	

		// == 을 써서 비교했을 경우 new String으로 서로 다른 주소값을 가지고 있어서 같지않다고 뜨고
		// == 이거는 메모리에 저장되어있는 값이 같냐를 물어보는 것 
		// 변수일경우는 ==을쓰고  나머지는 equals 를 쓴다
		// equals 는 주소값을 다르지만 안의 값들은 같기때분에 같다고 뜬다
		// equals 메모리값이 달라서 주소값이 달라서 등등 가지고 잇는 값이 같더라도 주소값이 다르면 false로 뜸
		// 그래서 equals를 == 보다 더 많이 쓴다 
		
		
//		참조변수는 매우 중요하다 이걸 제대로 이해하고 넘어가야한다
//		옅은복사과 깊은복사 차이 !!!
		
	}

}
