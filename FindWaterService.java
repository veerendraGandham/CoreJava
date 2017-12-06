package com.job.test.chiru;

public class FindWaterService {

	int[] numberOfBlocks;

	public FindWaterService(int[] numberOfBlocks) {
		this.numberOfBlocks = numberOfBlocks;
	}

	public int findWaterFillingBlocks(int nobl) {

		int water = 0;

		int left[] = new int[nobl];
		int right[] = new int[nobl];

		left[0] = numberOfBlocks[0];
		for (int i = 1; i < nobl; i++) {
			left[i] = Math.max(left[i - 1], numberOfBlocks[i]);
		}

		right[nobl - 1] = numberOfBlocks[nobl - 1];
		for (int i = nobl - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], numberOfBlocks[i]);
		}

		for (int i = 0; i < nobl; i++) {
			water += Math.min(left[i], right[i]) - numberOfBlocks[i];
		}
		return water;
	}

	public void printresult(int res) {

		if (res > 0) {
			System.out.println("Maximum Number of water Filling Blocks " + res);
		} else {
			System.out.println("Not Possiable to store water in this pattern, Try another.");
		}
	}
}
