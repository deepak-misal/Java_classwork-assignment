package com.techlab.business;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private ResultAnalyzer resultAnalyzer;
	private ArrayList<Player> players=new ArrayList<Player>();
	private boolean player1Playing=true;
	private Player currentPlayer;
	int i;
	private IBoard board=new Board(i);

	public Game(ResultAnalyzer resultAnalyzer,ArrayList<Player> players,IBoard board)
	{
		this.resultAnalyzer=resultAnalyzer;
		this.players=players;
		this.board=board;
	}
	public Player getCurrentPlayer() {
		if(player1Playing)
		{
			currentPlayer=players.get(0);
			return currentPlayer;
		}
		else 
		{
			currentPlayer=players.get(1);
			return currentPlayer;
		}
	}
	public void switchPlayer() {
		if(player1Playing)
			player1Playing=false;
		else
			player1Playing=true;
	}
	public String getWinnerName() {
		if(resultAnalyzer.getMarkOfWinner()==((Player) players.get(0)).getMark())	
			return ((Player) players.get(0)).getName();
		else if(resultAnalyzer.getMarkOfWinner()==((Player) players.get(1)).getMark())	
			return ((Player) players.get(1)).getName();
		else return null;
	}

	
	public int play(int cellNo)
	{
		try {
			board.markCell(cellNo,getCurrentPlayer().getMark());
		} 
		catch (CellAlreadyMarkedException e) 
		{
			System.out.println(e.getMessage());
			return 1;
		}
		return 0;
	}

}
