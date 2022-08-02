package com.practice.constructor;

/*
 * Constructor is an Member Method.
 * Same name as Class name.
 * It will never return anything.
 * It will be used to allocate memory.
 * In Constructor all the method data types are in same return type.
 */


class B extends Const{
	
	@Override
	public void show(int nums) {
		System.out.println(nums);
	}
	
	@Override
	public void show() {
		System.out.println("This is from Constructor Class");
	}
}



public class Constructor {

	public static void main(String[] args) {
		B good = new B();
		good.show();
	}

}
