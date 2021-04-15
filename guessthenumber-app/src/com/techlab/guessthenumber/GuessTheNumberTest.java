package com.techlab.guessthenumber; 
import java.util.Scanner;

public class GuessTheNumberTest {

	public static void main(String[] args) {
		boolean correct=false;
		Scanner sc = new Scanner(System.in); 
		   
        int number = 1 + (int)(10
                               * Math.random()); 
  
		System.out.println("Random integer:"+number);
		
		while(!correct) {
			System.out.println("Guess the number:");
			int guess =sc.nextInt();
			if (guess<number) {
				System.out.println("To Low");
			}
			else if(guess>number) {
				System.out.println("To High");
			}
			else if(guess==number) {
				System.out.println("Correct Guess");
				correct=true;
			}
		}
		System.out.println("Would you like to play again(y/n):");
		char c = sc.next().charAt(0);
		if(c=='n') {
			System.out.println("Bye!");
		}
		else if (c=='y') {
			main(new String[] {"a","b","c"});
		}

}
}
