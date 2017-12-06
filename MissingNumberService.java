package com.job.test.chiru;

public class MissingNumberService extends ContantsforMNS {

	private String sampledata;
	private String[] sampledataarray;
	private int[] sampledatadiff = {};

	/*
	 * sdiff = series difference ; 
	 * odiff = odd difference ;
	 */
	int sdiff, odiff;

	public MissingNumberService(String sampledata) {
		this.sampledata = sampledata;
	}

	public void convertStringtoArray() {
		sampledataarray = sampledata.split(" ");
	}

	public void findDifferences() {

		sampledatadiff = Differences(sampledataarray, sampledatadiff);
		for (int i = 0; i < sampledatadiff.length; i++) {// 2 4 2 2
			if (i == 0) {
				sdiff = sampledatadiff[i]; // 2
				odiff = sampledatadiff[i];
			} else {
				if (sampledatadiff[i] == sdiff) {

				} else {
					odiff = sampledatadiff[i]; // 4
				}
			}
		}
		for (int i = 0; i < sampledatadiff.length; i++) {
			if (sampledatadiff[i] == odiff) {
				int res = Integer.parseInt(sampledataarray[i]);
				res = res + sdiff;
				System.out.println("Then the output is " + res + ", as the numbers in the series have a difference of "
						+ sdiff + ".");
			}
		}

	}

}
