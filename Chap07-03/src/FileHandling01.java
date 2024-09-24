import java.io.File;

public class FileHandling01 {
	public static void main(String[] args) {
		
		File finfo = new File("src\\Example01.java");
		
		if( finfo.exists()) {
			//exists() 함수는 주로 파일 시스템이나 데이터베이스에서 특정 파일이나 객체가 존재하는지를 확인할 때 사용
			System.out.println("파일의 이름 : " + finfo.getName());
			System.out.println("파일의 경로 : " + finfo.getAbsolutePath());
			System.out.println("파일 쓰기가 가능한가? : : " + finfo.canWrite());
		
			
			System.out.println("파일 읽기가 가능한가? : " + finfo.canRead());
			System.out.println("파일의 크기 : " + finfo.length());
		} else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
		
	}
}
