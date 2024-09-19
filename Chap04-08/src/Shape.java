
public abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
	//이 두가지는 무조건 자식클래스에서 선언되어야만함
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() {return color;}
	
}
