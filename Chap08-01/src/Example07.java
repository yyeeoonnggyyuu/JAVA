import java.util.TreeMap;
import java.util.Iterator;


//왜 HashMap 보다 TreeMap 을 많이 쓰는 이유 ??
//검색이라는 일처리를 반복할 때 키값의 순서에 따라 저장하므로 검색에서 빠름
public class Example07 {
	public static void main(String[] args) {
		TreeMap<Integer, String> cats = new TreeMap<Integer, String>();
		
		cats.put(7,  "페르시안");
		cats.put(3,  "러시안블루");
		System.out.println(cats);
		
		cats.put(5, "샴");
		System.out.println(cats);
		
		cats.replace(3, "래그돌");
		System.out.println(cats);
		
		cats.remove(5);
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(7));
		
		System.out.print("(Keym Value) = ");
		Iterator<Integer> keys = cats.keySet().iterator();
		
		while(keys.hasNext()) {
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
		
		
	}
}
