
class Inheritance02  {
	public static void main(String[] args) {
		
		SubSon obj = new SubSon();
		obj.printDetails();
		obj.printFather();
//		obj.printGrandFather();
		
		System.out.println("----------------------------------------");
		SubDaughter obj02 = new SubDaughter();
		obj02.printDaughter();
		obj.printFather();
//		obj.printGrandFather();
	}
	
}
