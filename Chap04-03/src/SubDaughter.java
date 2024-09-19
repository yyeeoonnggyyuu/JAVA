
class SubDaughter extends SubFather{
	String famliyName = "의사";
	String houseAddress = "부산";
	
	void printDaughter() {
		System.out.println("나는 딸입니다. " );
		System.out.println("나는 어머니로부터 상속받습니다." );
		System.out.println("나의 어머니는 " + this.famliyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}


	
}
