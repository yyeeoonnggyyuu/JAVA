
public class Polymorhpism02 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
//인스턴스 타입이 다름 부모로 선언했고 객체는 자식으로 함
//		이렇게 하는 이유는 ??	
//		기존에 사용하던 
//		Pig myPig = new Pig();
//		로 하면 가독성 부분이 떨어짐
		
//		여기서 타입이 3개가 선언된건지 객체가 선언된건 아님 
//		new연산자로 객체를 만듬
		
		Animal myPig = new Pig();
		Animal myDog = new Dog();
// 	자동 타입변화로 animalSound 해도 각각의 객체들이 출력됨
		myAnimal.animalSound();
		myAnimal.eat();
		myPig.animalSound();
		myDog.animalSound();
		
		
//		myDog.bark(); 
//		이건 왜 못쓰냐 ??? 이 바크를 쓰고 싶으면 인스턴스 객체인 Animal을 Dog로 바꿔줘야 쓸 수 있음
//		--참조타입의 이해 
//		--인스턴스의 이해
//		--인스턴스의 new 이해
//		
//		여기서 Animal 이라 인스턴스를 선언하면 
//		부모클래스에 있는 Animal에 있는 eat과 animalSound 와
//		자식클래스에 있는 animalSound까지만 하고 
//		bark는 들어가지 않음
	}
}
