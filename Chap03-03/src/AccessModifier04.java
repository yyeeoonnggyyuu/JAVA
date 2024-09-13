
public class AccessModifier04 {
	public static void main(String[] args) {
		Dog2 obj = new Dog2();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : "+ obj.breed  );
		System.out.println("강아지 색상 : "+ obj.color );
		obj.bowwow();
		
		
	
	}
}
