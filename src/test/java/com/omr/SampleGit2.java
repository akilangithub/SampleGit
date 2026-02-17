package com.omr;

public class SampleGit2 {

	int a = 100, b = 5;
	int c;

	private void add() {
		
		c = a + b;
		System.out.println(c);

	}

	private void subtract() {
		
		c = a - b;
		System.out.println(c);

	}

	private void division() {

		c = a / b;
		System.out.println(c);

	}

	public static void main(String[] args) {

		SampleGit2 git2 = new SampleGit2();
		git2.add();
		git2.subtract();
		git2.division();
	}
}
