package com.section03;

public class Example06 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello ");
		
		sb.append("Programming");
		System.out.println(sb);
		
		sb.insert(6, "Java ");
		System.out.println(sb);
		
		sb.replace(1, 4, "Good");
		System.out.println(sb);
		sb.delete(1,5);
		System.out.println(sb);
		
		sb.insert(1,"ell");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
