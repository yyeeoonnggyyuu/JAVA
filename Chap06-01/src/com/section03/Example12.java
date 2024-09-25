package com.section03;
import java.util.Random;
public class Example12 {
	public static void main(String[] args) {
		
		Random random1 = new Random();
		System.out.println("난수 값: " + random1.nextInt());
		
		Random random2 = new Random();
		for (int j = 0 ; j<5; j++) {
			for(int i = 0 ; i< 6; i++) {
				System.out.print(random2.nextInt(45) + " ");
			}
			System.out.println();
		}
		
		}
		
}
