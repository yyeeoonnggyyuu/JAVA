//user를 객체로 관리하고 싶어서 클래스를 따로 만들었다

public class Person {
	
	//접근 할 수 없도록 public이 아닌 private을 씀
	
	//필드값을 public으로 절대 쓰지않음
	//그래서 getter 와 setter를 씀 
	// getName() Name이라는 필드값에 대한 getter다 
	
	private String name;
	private int phone;
	private String address;
	
	public Person(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Person(String name, int phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
