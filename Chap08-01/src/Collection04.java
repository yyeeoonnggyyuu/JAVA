
import java.util.HashSet;

public class Collection04 {
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		
		str.add("C");
		str.add("A");
		str.add("B");
		str.add("B");
		str.add("B");
		str.add("D");
		//여기서 순서를 바꿔서 넣어도 A,B,C로 나오는데 이건 순서를 보장할 수 없음  만약 똑같은 값 A,A,A로 넣을 경우 A하나만 출력됨
		System.out.println(str);
		
		
		System.out.print("HashSet 요소 : ");
		for(String elements : str)
		 System.out.print(elements + " ");
		
		String[] array = new String[str.size()];
		str.toArray(array);
		
		
		System.out.println();
		System.out.print("Array 요소 : ");
		for(int i = 0; i <array.length; i++)
		System.out.print(array[i] + " ");
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println(str.size()); // 사이즈는 3
		System.out.println(str.contains("A"));

	}
}
