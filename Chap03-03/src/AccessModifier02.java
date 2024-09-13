
public class AccessModifier02 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : "+ obj.breed  );
		System.out.println("강아지 색상 : "+ obj.color );
		obj.bowwow();
		
		
		//protected 접근제한자 출력
		obj.age =10;
		System.out.println("강아지 나이 : "+ obj.age);
		obj.run();
		
	}
}
