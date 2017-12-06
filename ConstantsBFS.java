package com.job.test.chiru;

import java.util.Arrays;

public class ConstantsBFS {
	static int[] addElement(int[] a, int e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}
	public static int[] sampletoArray(String sampledata) {
		int[] numberOfBlocks = {};
		try {
			String[] sampledataarray = sampledata.split(" ");
			for (int i = 0; i < sampledataarray.length; i++) {
				int num = Integer.parseInt(sampledataarray[i]);
				numberOfBlocks = addElement(numberOfBlocks, num);
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Needs to enter numbers with single space gap");
		}
		return numberOfBlocks;
	}
}
