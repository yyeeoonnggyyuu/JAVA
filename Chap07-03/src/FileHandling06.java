import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileHandling06 {
	public static void main(String[] args) {

			File file = new File("member.txt");
			try {
				if(!file.exists())
					file.createNewFile();
//첫번째 매개변수로 파일리더를 대입
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis, 8192);
				
				String str;
				
				while ((str =br.readLine()) != null) { // readLine는 읽을 것이 없으면 null을 입력해야 출력함
					System.out.println(str);
					
				}
				fis.close();
				System.out.println("\n 파일 읽기 성공");

			} catch(Exception e) {
				e.getMessage();
			}
			
	
	}
}
