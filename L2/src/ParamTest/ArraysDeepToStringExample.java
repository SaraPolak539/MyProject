package ParamTest;

import java.util.Arrays;

/*
 * A java example source code to demonstrate
 * the use of deepToString() method of Arrays class
 */

public class ArraysDeepToStringExample {

	public static void main(String[] args) {

		// initialize a new String array
		String[] names = new String[]{
			"Alfred","Beth","Stan"	
		};
		
		
		System.out.println("******One dimensional array******");
		// get the String representation
		System.out.println(Arrays.toString(names));
		
		
		System.out.println("******Multi dimensional array******");
		
		// get String representation multi dimensional array
		
		int[][] value = new int[2][2];
		
		
		value[0][0] = 1;
		value[0][1] = 2;
		value[1][0] = 3;
		value[1][1] = 4;
		
		

		// print using toString() method
		System.out.println("Print using toString()");
		System.out.println(Arrays.toString(value));
		
		// print using deepToString() method
		System.out.println("Print using deepToString()");
		System.out.println(Arrays.deepToString(value));
		
		
	}
}