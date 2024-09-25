import java.util.TreeMap;
import java.util.Map.Entry;

public class Collection07 {
	public static void main(String[] args) {
		TreeMap<Integer, String> str = new TreeMap<Integer, String>();
		
		str.put(1, "5");
		str.put(5, "3");
		str.put(3, "바나나");
		str.put(7, "강아지");
		str.put(9, "Cat");
		str.put(11, "Dog");
//		순서대로 저장하는게 아닌 트리구조로 저장하기때문 <- 이유빈약 좀 더 공부
//		삭제나 삽입할때는 TreeMap 구조가 불리하고 
//		검색할때는 TreeMap구조가 훨씬 유리합니다
		System.out.println(str);
		
		System.out.print("keys : ");
		for(Integer key : str.keySet()) {
			System.out.print(key);
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.print("Values : ");
		for(String value : str.values()) {
			System.out.print(value);
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.print("Keys=Values : ");
		for(Entry<Integer, String> entry : str.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}
	}
}
