package ch02_pjt_03;

public class CalDiv implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return secondNum != 0 ? (firstNum / secondNum) : 0;
				
	}
	
}
