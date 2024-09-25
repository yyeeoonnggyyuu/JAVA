
import java.util.LinkedList;
import java.util.Collections;

public class Collection02 {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		for(int i = 10; i>= 1; i--)
			num.add(i);
		
		System.out.println(num);
		
		System.out.print("정렬 전 : ");
		for(int i = 0; i< num.size(); i++)
			System.out.print(num.get(i) + " ");
		
		Collections.sort(num);

		
		System.out.println();
		System.out.print("정렬 후 : ");
		for( int i = 0 ; i<num.size(); i++)
			System.out.print(num.get(i) + " ");
		
	    Collections.sort(num, Collections.reverseOrder());

		
		System.out.println();
		System.out.print("reverseOrder 정렬 후 : ");
		for( int i = 0 ; i<num.size(); i++)
			System.out.print(num.get(i) + " ");
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println(num.size());
		System.out.println(num.get(5));
		System.out.println(num.contains(5));
		System.out.println(num.indexOf(2));
		
	}
}
