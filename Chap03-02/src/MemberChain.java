
public class MemberChain {
	String firstName;
	String country;
	int age;
	
	
	public MemberChain() {
		this("홍길순");
		
		//여기서 디스는 매개변수 홍길순을 찾아가다 보니 바로 아래 스트링 엠네임으로 감
	}
	//위에서 내려온 홍길순이 엠네임에 저장되고 20과 함께 내려감
	public MemberChain(String mName) {
		this(mName,20);
	}
	//위에서 받은 홍길순, 20에 대한민국값을 가지고 아래로감
	public MemberChain(String mName, int mAge) {
		this(mName, mAge, "대한민국");
	}

	//위에서 받은 홍길순, 20, 대한민국이 각각의 변수값에 대입되고 
	public MemberChain(String mName, int mAge, String mcountry) {
		firstName = mName;
		age = mAge;
		country = mcountry;
	}
	//위에서 받은 변수값들이 출력
	void printInfo() {
		System.out.println("이름 : " + firstName);
		System.out.println("국적 : " + country);
		System.out.println("나이 : " + age);
		System.out.println("---------------------------------");
	}
	
}
