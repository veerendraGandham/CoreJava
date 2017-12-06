package com.job.test.chiru;

import java.util.Scanner;

public class FindWaterServiceImpl extends ConstantsBFS {

	// In the above image, some blocks are placed beside each other. The blocks
	// have different sizes. For example, the first slot doesn’t contain any
	// block. The second and third slot contains 2 blocks. The fourth slot
	// contains 3 blocks, fifth contains 2 blocks, and so on. The area beside
	// the first and last slots is empty open area.

	// Now imagine that it is raining. The gaps between the blocks will get
	// filled with water. For example, in above image, the water will be
	// accumulated only between 4th and 7th slot and the amount of “block” units
	// the water occupies is 3 (see the dotted blocks in above image). There can
	// be any number of such slots in the arrangement.

	// Given the number of blocks in each slot as a value in an integer array,
	// write a program to find the amount of “block” units the water occupies in
	// a given arrangement of blocks.

	// For example, for above image, the input array will be {0,2,2,3,2,1,4,1}
	// and the output will be 3.
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter sample String");
		String sampledata = s.nextLine();
		int[] numberOfBlocks = sampletoArray(sampledata);

		FindWaterService fws = new FindWaterService(numberOfBlocks);
		if (numberOfBlocks.length != 0) {
			int res = fws.findWaterFillingBlocks(numberOfBlocks.length);
			fws.printresult(res);
		}
		s.close();
	}

}
