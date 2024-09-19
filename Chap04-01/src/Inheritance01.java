
class Inheritance01 extends Calculation {
	public void multiplication( int x , int y ) {
//		여기서 z는 부모클래스 Calculation 의 변수값이 설정된 걸 가져옴
		z = x * y;
		System.out.println("두 수의 곱셈: " + z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
//		타입을 설정  (새로만든 new 객체를 obj 객체에 대입해줘)
		Inheritance01 obj = new Inheritance01();
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
	}
}
