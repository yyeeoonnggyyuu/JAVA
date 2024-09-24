import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Example06 {
	public static void main(String[] args) {
		
		try {
			File file = new File("파일 입출력.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str;
			
			
			while ((str = br.readLine()) != null) { 
				System.out.println(str);

			}
			fis.close();
			System.out.println("\n 파일 읽기 성공");
		
		} catch(Exception e) {
			e.getMessage();
		}
	}
}
