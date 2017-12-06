package com.job.test.chiru;

import java.util.Scanner;

public class MissingNumberServiceimpl {
	// Question
	// A input string is provided which contains a series of integers separated
	// by space. There is a constant difference between
	// the consecutive terms of the given series. There is however one hitch:
	// One term from the given series is missing.
	// Write a program to find the missing term.

	// For example, if the input sample is 1 3 5 9 11
	// Then the output is 7, as the numbers in the series have a difference of
	// 2.
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter sample String");
		String sampledata = s.nextLine();

		MissingNumberService mns = new MissingNumberService(sampledata);
		mns.convertStringtoArray();
		mns.findDifferences();

		s.close();
	}

}
