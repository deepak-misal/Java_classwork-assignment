package com.techlab.pig;

import java.util.Scanner;

public class PigGameTest {

	public static void pigCalculation(int turn_n, int total_n, int turn) {
		boolean hold = false;
		System.out.println("TURN:" + turn);
		Scanner sc = new Scanner(System.in);
		while (hold == false) {
			System.out.println("Roll or Hold(r/h):");
			char r_or_h = sc.next().charAt(0);
			if (r_or_h == 'r') {
				int dice = 1 + (int) (6 * Math.random());
				System.out.printf("%d\n", +dice);
				if (dice == 1) {
					turn_n = 0;
					System.out.println("Turn over. No score.");
					break;
				} else {
					turn_n = turn_n + dice;
					total_n = total_n + dice;
				}
			} else if (r_or_h == 'h') {
				if (total_n >= 20) {
					hold = true;
				} else {
					System.out.println("Turn score:" + turn_n);
					System.out.println("Total score" + total_n);
					System.out.println("\n");
					pigCalculation(0, total_n, turn + 1);
				}
			}
		}
		System.out.println("Total score:" + total_n);
		System.out.printf("You finished in %d turns", +turn);
		System.exit(1);
	}

	public static void main(String[] args) {
		int turn_n = 0, total_n = 0, turn = 1;
		pigCalculation(turn_n, total_n, turn);
		System.out.println("Game Over");

	}

}
