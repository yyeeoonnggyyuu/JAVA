class Animal {
	public void Sound() {
		System.out.println("동물의 울음소리 ");
	}
	class Cat extends Animal {
		public void Sound() {
			System.out.println("고양이는 야옹야옹");
		}
	}

	class Dog extends Animal {
		public void Sound() {
			System.out.println("개는 멍멍");
		}
}
	
}

	
public static void main(String[] args) {
//	Animal catObj = new Animal();
//	catObj.Cat() = 
//	 System.out.println(catObj);
	
	System.out.println(Cat.class);
}


--------------------------------------------------
class Animal {
	public void Sound() {
		System.out.println("동물의 울음소리 ");
	}
}

class Cat extends Animal {
	public void Sound() {
		System.out.println("고양이는 야옹야옹");
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("개는 멍멍");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat(); // Cat 객체 생성
		cat.Sound(); // 고양이는 야옹야옹 출력

		Animal dog = new Dog(); // Dog 객체 생성
		dog.Sound(); // 개는 멍멍 출력
	}
	
	
	---------------------
	
	
	class Animal {
		public void Sound() {
			System.out.println("동물의 울음소리 ");
		}

		class Cat extends Animal {
			public void Sound() {
				System.out.println("고양이는 야옹야옹");
			}
		}

		class Dog extends Animal {
			public void Sound() {
				System.out.println("개는 멍멍");
			}
		}
	}

	public class Main {
		public static void main(String[] args) {
			Animal animal = new Animal();
			Animal.Cat cat = animal.new Cat(); // 이너 클래스 Cat 객체 생성
			cat.Sound(); // 고양이는 야옹야옹 출력

			Animal.Dog dog = animal.new Dog(); // 이너 클래스 Dog 객체 생성
			dog.Sound(); // 개는 멍멍 출력
		}
	}

	
	
	이코드 클래스로 더 공부해보기 
}