package com.job.test.chiru;

public class BoilerFillingService extends ConstantsBFS implements Runnable {
	private Thread t;
	private String threadName;
	int boilerholdCapcity;
	int boilerhold;
	int jar1 = 5;
	int jar2 = 4;
	int remain;
	int[] boilerFillingFlow = {};

	public BoilerFillingService(String name,int boilerholdCapcity) {
		threadName = name;
		this.boilerholdCapcity = boilerholdCapcity;
	}
	
	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public void run() {
		sequencyGenerator();
		outputPrinter(boilerFillingFlow);
	}

	private void outputPrinter(int[] boilerFillingFlow) {
		for (int i = 0; i < boilerFillingFlow.length; i++) {
			if (i == 0) {
				System.out.println("Result flow ");
				System.out.print("[" + boilerFillingFlow[i] + " ,");
			} else if (i == (boilerFillingFlow.length - 1)) {
				System.out.print(boilerFillingFlow[i] + " ]");
			} else {
				System.out.print(boilerFillingFlow[i] + " , ");
			}
		}

	}

	synchronized void sequencyGenerator() {
		int changevalue = 0;
		while (boilerholdCapcity > boilerhold) {
			remain = boilerholdCapcity - boilerhold;
			if (remain >= jar1) {
				boilerhold = boilerhold + jar1;
				boilerFillingFlow = addElement(boilerFillingFlow, jar1);
			} else {
				boilerhold = boilerhold - jar1;
				boilerFillingFlow = addElement(boilerFillingFlow, (-jar1));
			}
			changevalue = changevalue + 1;
			change(changevalue);
		}
	}

	public void change(int change) {
		if (change % 2 == 0) {
			jar1 = 5;
		} else {
			jar1 = 4;
		}

	}
}
