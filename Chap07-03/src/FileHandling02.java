import java.io.File;
import java.io.FileOutputStream;

public class FileHandling02 {
	public static void main(String[] args) {
		File file = new File("gugudan.txt");
//		gugudan.txt 파일 생성
		
		try {
			if(!file.exists())
				file.createNewFile();
				//구구단.txt 객체가 없으면 생성
			
			FileOutputStream fos = new FileOutputStream(file); //write 하게 되면 여기 파일에 쓴다
			//이거는 바이트 저장이 가능하므로 
		
			for(int i = 2 ; i <= 9 ; i++) {
				for(int j = 1; j <=9; j++) {
					String str = i + " x " + j + " = " + i*j + "\n";
					byte[ ] b =str.getBytes();
					//여기서 바이트로 변환
					fos.write(b);

					}	
			}
			fos.close();
			//close 없을 시 계속 용량을 먹음
			System.out.println("파일 쓰기 성공");
		} catch(Exception e){
			e.getMessage();
		}
	}
}
