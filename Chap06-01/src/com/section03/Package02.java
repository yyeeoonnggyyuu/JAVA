package com.section03;
import com.javamaster.mypackage.Dog;
public class Package02 {
	
	public static void main(String[] args) {
		Dog dog01 = new Dog();
		Dog dog02 = new Dog();
		System.out.println(dog01.equals(dog02));
		
		String str1 = dog01.bowwow();
		String str2 = dog02.bowwow();
		System.out.println(str1.equals(str2));
	}

}

