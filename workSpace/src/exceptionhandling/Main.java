package exceptionhandling;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BasicExceptionHandling eh = new BasicExceptionHandling();
		System.out.println("starting");
		eh.typeOne();
		System.out.println("t1 done");
		//eh.typeOneWithout();
		eh.typeTwo();
		System.out.println("t2");
		eh.typeThree();
		System.out.println("t3 done");
		eh.getInput("workd");
		System.out.println("input done");
		eh.mayThrowExceptionRuntime(null, new int[4], 4);
		System.out.println("runtime done");
		try {
			eh.mayThrowException(null, null, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
