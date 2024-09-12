

public class Array02 {

	public static void main(String[] args) {
			double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
			double sum = 0.0;
			
			for ( int i= 0 ; i < gradeArr.length ; i++) {
				sum += gradeArr[i];
			}
			
			double average = sum / gradeArr.length;
			System.out.println("합계 : "+sum);
			System.out.format("평균 : %.2f", average);
			// format > 들어가있는 d 십진수

// JAVA , JavaScript 의 덧셈 시 소수점이 0000001 이런식으로 나오는이유
//			십진법 
//			0000000001
//			하나의 숫자가 언제 끝나나 
//			
//			컴퓨터는 이진법
//			
//			위의 합은 791.4 가 나와야하는데 
//			791.4000000000001 ㅇ ㅣ나옴 
//			이진법때문에 그럼
//			
//			왜 이런일이 발생하는가 .
//			
//			double 이나 float 은 0000001.00000 이렇게 소수점에 메모리를 할당
//이진법의 소수점은 1/2 1/4 1/8 1/16 이런식으로 되기때문에 부등소수점			
			
			
	}

}
