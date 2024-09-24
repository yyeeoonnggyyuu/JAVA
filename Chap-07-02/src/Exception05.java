
class InvalidException extends Exception {
	public InvalidException(String s ) {
		super(s);
//		예외 메시지 전달: super(s)는 부모 클래스인 Exception의 생성자를 호출하는 것입니다. 
//		이렇게 하면 예외가 발생할 때 함께 전달된 메시지를 상위 Exception 클래스에 전달할 수 있습니다. 나중에 getMessage()로 해당 메시지를 확인할 수 있게 되죠.
	}
}


public class Exception05{
	void check (int weight) throws InvalidException {
		if(weight < 100) {
			throw new InvalidException("InvalidException 클래스 호출입니다,.");
		}
	}
	
	public static void main(String[] args) {
		Exception05 obj = new Exception05();
		try {
			obj.check(60);
		}
		catch(InvalidException ex) {
			System.out.println("예외 처리입니다.");
			System.out.println(ex.getMessage());
		}
	}
}
