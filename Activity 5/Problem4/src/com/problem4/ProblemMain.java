package com.problem4;

import java.util.Scanner;
import java.util.TreeSet;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeSet<String> player = new TreeSet<String>();
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			player.add(input.nextLine());
		}
		for(String s:player) {
			System.out.println(s);
		}
	}
}
