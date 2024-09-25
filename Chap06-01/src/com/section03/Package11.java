package com.section03;
import java.util.Random;
public class Package11 {
	
	public static void main(String[] args) {
		
		Random obj = new Random();
		System.out.println("obj : " + obj.nextInt());
		
		obj.setSeed(50);
		System.out.println("obj.setSeed(50): " + obj.nextInt() );
	}

}
