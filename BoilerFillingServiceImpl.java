package com.job.test.chiru;

import java.util.Scanner;

public class BoilerFillingServiceImpl {

	// Suppose there is a boiler which can hold “N” units of water and there are
	// two jars: one can hold 5 units of water and another can hold 4 units of
	// water. Write a program which can determine the steps to be taken to fill
	// the boiler with water using the two jars.

	// Restrictions in implementation:
	// i) The boiler should never be overloaded with water.
	// ii) If there are many ways to fill the boiler then just return only one
	// of the possible ways.
	// iii) The solution should work in a multi-threaded environment without any
	// problems.
	// iv) If there is no way to fill the given boiler then return an empty
	// List.

	// Example: Let consider that the boiler can hold 7 units of water. The
	// steps to fill up the boiler will be as follows:
	// i) Fill the boiler with 5 units of water à boiler will have 5 units
	// ii) Take away 4 units of water from the boiler àboiler will have 1 unit
	// iii) Fill boiler with 5 units of water à boiler will have 6 units
	// iv) Take away 4 units of water from the boiler à boiler will have 2 units
	// v) Fill the boiler with 5 units of water à boiler will have 7 units

	// So for a boiler of capacity 7 units the result should print [5, -4, 5,
	// -4, 5]
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Boiler Maximum capacity");
		int sampledata = Integer.parseInt(s.nextLine());

		BoilerFillingService BFS1 = new BoilerFillingService("Jar-1 = 5", sampledata);
		BFS1.start();
		s.close();
	}
}
