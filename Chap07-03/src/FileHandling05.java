import java.io.File;
import java.io.FileReader;


public class FileHandling05 {
	public static void main(String[] args) {

			File file = new File("member.txt");
			try {
				if(!file.exists())
					file.createNewFile();

				FileReader fis = new FileReader(file);
				int i = 0;
				
				while ((i=fis.read()) != -1) { // read는 읽을 것이 없으면 -1을 출력
					System.out.print((char)i);
					//char 인덱스 하나하나씩 읽어내는 것;
				}
				fis.close();
				System.out.println("\n 파일 읽기 성공");

			} catch(Exception e) {
				e.getMessage();
			}
			
	
	}
}
