import java.util.Scanner;

public class Array04Ex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("행의 수를 입력하세요 ");
		int rows = s.nextInt();
		
		System.out.print("열의 수를 입력하세요 ");
		int columns = s.nextInt();
		
	
	
		
		int[][] firstMatrix = new int[rows][columns];
		int[][] secondMatrix = new int[rows][columns];
		int[][] sum = new int[rows][columns];
		

		System.out.print("첫 번째 행렬 값을 입력하세요");
		for(int i=0; i<rows; i++) {
			for(int j =0; j<columns; j++) {
				System.out.print("firstMatrix["+i+"]["+j+"] 값을 입력하세요");
				firstMatrix[i][j] = s.nextInt();
			}
		}
		
		System.out.print("두 번째 행렬 값을 입력하세요");
		for(int i=0; i<rows; i++) {
			for(int j =0; j<columns; j++) {
				System.out.print("secondMatrix["+i+"]["+j+"] 값을 입력하세요");
				secondMatrix[i][j] = s.nextInt();
			}
		}
		
				
		for(int i =0 ; i<2; i++) {
			for(int j= 0; j<3; j++) {
				sum[i][j]= firstMatrix [i][j] + secondMatrix[i][j];
			}
		}
		
		System.out.println("두 행렬의 합: ");
		for(int i=0; i < rows; i++) {
			for(int j =0 ; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
