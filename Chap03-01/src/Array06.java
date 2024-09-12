

public class Array06 {

	public static void main(String[] args) {
		
		String s = " Java Programming ";
		String s1 = "Java";
		String s2 = " Programming";
		String s3 = s1.concat(s2);
		String s4 =  s.trim();
		String s5 = new String(" Java Programming ");

		
		System.out.println("s3 "+s3);
		System.out.println("s4 "+s4);
		System.out.println("s3.equals(s4)"+ s3.equals(s4));
		System.out.println("s3.equals(s4)"+ s.equals(s5));
		System.out.println("s3.equals(s4)"+ s3.equals(s5));


	}

}
