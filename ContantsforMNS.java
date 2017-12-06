package com.job.test.chiru;

public class ContantsforMNS extends ConstantsBFS {
	public int[] Differences(String[] sampledataarray, int[] sampledatadiff) {

		for (int i = 0; i < (sampledataarray.length - 1); i++) {
			int fir = Integer.parseInt(sampledataarray[i]);
			int sec = Integer.parseInt(sampledataarray[(i + 1)]);
			int diff = sec - fir;
			sampledatadiff = addElement(sampledatadiff, diff);
		}
		return sampledatadiff;
	}
}
