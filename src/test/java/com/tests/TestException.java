package com.tests;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30};
		try {
		System.out.println(a[2]);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("hello world");

	}

}
