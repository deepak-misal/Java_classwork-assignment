package com.techlab.test;

import java.util.Scanner;

public class TicTacToeTest {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("------Choices Available-------");
		System.out.println("1. Console Printer");
		System.out.println("2. Frame Printer(UI)");
		System.out.println("");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		if(choice==1) {
			TicTacToeConsole console=new TicTacToeConsole();
			console.printConsole();
		}
		else {
			//TicTacToeUI ui=new TicTacToeUI();
			WelcomeFrame welcome=new WelcomeFrame();
			
		}

	}

}
