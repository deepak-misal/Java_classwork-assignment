package com.techlab.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.business.Board;
import com.techlab.business.Game;
import com.techlab.business.IBoard;
import com.techlab.business.Mark;
import com.techlab.business.Player;
import com.techlab.business.Result;
import com.techlab.business.ResultAnalyzer;

public class TicTacToeConsole {
	private static Scanner sc;
	
	public void printConsole() {
		sc = new Scanner(System.in);
		ArrayList<Player> players=new ArrayList<Player>();
		System.out.println("Enter board size : ");
		int size=sc.nextInt();

		IBoard board=(IBoard) new Board(size);
		ResultAnalyzer resultAnalyzer=new ResultAnalyzer(board);

		System.out.println("Enter name of Player1 : ");
		String player1Name=sc.next();
		System.out.println("Enter name of Player2 : ");
		String player2Name=sc.next();

		Player player1=new Player(player1Name,Mark.X);
		Player player2=new Player(player2Name,Mark.O);

		players.add(player1);
		players.add(player2);

		Game game=new Game(resultAnalyzer, players,board);

		displayBoard(board);
		int again=0;
		
		while(!resultAnalyzer.analyzeResult() && !(board.checkIfBoardFull()))
		{
			System.out.println(game.getCurrentPlayer().getName()+" Enter the cell number between (0-"+(board.getBoardSize()*board.getBoardSize())+") for marking "+game.getCurrentPlayer().getMark());
			int cellNo=sc.nextInt();
			if(cellNo < (board.getBoardSize()*board.getBoardSize()) )
			{
				again=game.play(cellNo);
				if (again==1)
					continue;
				displayBoard(board);
				game.switchPlayer();
			}
			else
				System.out.println("Enter valid cell number : ");
		}

		if(resultAnalyzer.analyzeResult())
			System.out.println(game.getWinnerName()+" you are Winner!!!");
		if(board.checkIfBoardFull())
			System.out.println("Game is "+Result.DRAW);
	}
	private static void displayBoard(IBoard board) {
		int temp=0;
		for (int i = 0; i < board.getBoardSize(); i++) {
			for (int j = 0; j < board.getBoardSize(); j++) {
				if(board.getBoard().get(temp).getMark().equals(Mark.EMPTY))
					System.out.print("|-|");
				else
					System.out.print("|"+board.getBoard().get(temp).getMark()+"|");
				temp+=1;
			}
			System.out.println();
		}	
	}
}