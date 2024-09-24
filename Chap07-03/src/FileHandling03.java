import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {
	public static void main(String[] args) {

		File file = new File("member.txt");

		try {
			if(!file.exists())
				file.createNewFile();


			FileWriter fw = new FileWriter(file); 
			Scanner input = new Scanner(System.in);

			boolean quit = false;
			while (!quit) {
				System.out.print("아이디 : ");
				String userId = input.next();
				fw.write("아이디 : " + userId + "  ");

				System.out.print("이름 : ");
				String userName = input.next();
				fw.write("아이디 : " + userName + "\n");

				System.out.println("계속 진행 ?  Y | N");
				input = new Scanner(System.in);
				String str = input.nextLine();

				if(str.toUpperCase().equals("N"))
					quit = true;

			}
			fw.close();
			System.out.println("파일 쓰기 성공");


		} catch(Exception e) {
			e.getMessage();
		}
	}
}
