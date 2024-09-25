import java.util.HashMap;
import java.util.Iterator;

public class Example06 {
	public static void main(String[] args) {
		HashMap<Integer, String> cats = new HashMap<Integer, String>();
//		key값은 Integer로 쓰고 value 값은 String으로 
//		접근할때는 key값으로 
		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println(cats);
		
		cats.put(3, "러시안블루");
		System.out.println(cats);
		
		cats.put(3, "래그돌");
		System.out.println(cats);
		//put을 써도 수정까지 됨 - 장단점이 있다
		
		cats.remove(1); // 키값 1번을 지워라 (키와 밸류값 같이 지워짐
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(2)); //2번 키값을 찾아감
		
		System.out.print("(key, value) =");
		Iterator<Integer> keys = cats.keySet().iterator();
		
		while(keys.hasNext()) {
			int key = keys.next();
			System.out.print(" ("+ key + ","+cats.get(key)+")");
								//키값        캣츠의 벨류값을 겟 
		}
		
	}
}
