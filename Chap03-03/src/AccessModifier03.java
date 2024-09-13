
public class AccessModifier03 {
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
		
		//private 접근제한자는 모든 접근을 허용하지 않기 때문에 name 오류가 뜸 
		//매개변수 name을 찾을 수 없다는 뜻
		obj.name = "다운";
		System.out.println("강아지 이름 : " + obj.name);
		obj.sleep();
	}
}
