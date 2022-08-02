package com.practice.constructor;


class Const{
	
	public void show() {
		System.out.println("In Const");
	}
	
	// Method Overloading
	public void show(int num) {
		int value = num;
		System.out.println(value);
	}
}

/*
 * // Method Overriding class Construct extends Const{
 * 
 * @Override public void show() { System.out.println("In Construct"); } }
 */

