

public class Operator03 {
	public static void main(String[] args) {
		
		int x =10;
		

		System.out.println((x <10 && x <20)); //false
		System.out.println((x <10 || x <20)); //true
		System.out.println((x <10 != x <20)); //true
		System.out.println("***********************************************************");
		
		int c =5, d =10;

		System.out.println(c > d);  //false
		System.out.println(!(c > d)); //true
		System.out.println((c == d) && ( c == 5)); //false
		System.out.println((c != d) && (c == 5)); //true
		System.out.println(!((c!= d ) && (c == 5))); //false 
	
	}
}
