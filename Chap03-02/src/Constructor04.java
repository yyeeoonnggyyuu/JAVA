
public class Constructor04 {
	public static void main(String[] args) {
		MemberChain object = new MemberChain();
		object.printInfo();
		
		MemberChain object2 = new MemberChain("똥개1",35,"미국");
		object2.printInfo();
		
		MemberChain object3 = new MemberChain("똥개2",35);
		object3.printInfo();
		
		MemberChain object4 = new MemberChain("멍청3",55);
		object4.printInfo();
		
		MemberChain object5 = new MemberChain("똥개4",65,"스페인");
		object5.printInfo();
	}
}
