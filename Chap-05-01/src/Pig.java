
public class Pig implements Animal02 {
	public void animalSound() {
		System.out.println("꿀꿀꿀하고 소리 내다.");
	}

//Animal02 에서 메서드 선언된건 여기서 반드시 구현해줘야 함 안그럼 에러뜸 class명의 Pig에 마우스커서 올리면
//	어떤게 구현 안됐는지 뜨고 클릭하면 아래처럼 바로 생성됨
	@Override
	public void animalWalk() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷다");
	}
}
