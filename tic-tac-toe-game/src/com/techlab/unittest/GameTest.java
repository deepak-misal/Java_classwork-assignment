package com.techlab.unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.business.Board;
import com.techlab.business.Game;
import com.techlab.business.IBoard;
import com.techlab.business.Mark;
import com.techlab.business.Player;
import com.techlab.business.ResultAnalyzer;

class GameTest {
	private ResultAnalyzer resultanalyzer;
	ArrayList players= new ArrayList();
	Mark markOfWinner=Mark.X;
	IBoard board=new Board(3);
	@Test
	void test_for_Game() {
		
		//arrange
		Player player1=new Player("abc",Mark.X);
		Player player2=new Player("xyz",Mark.O);
		players.add(player1);
		players.add(player2);
		Game game=new Game(resultanalyzer,players,board);
		String expectedPlayerName="abc";
		Mark expectedMark=Mark.X;
		//act
		String actualPlayerName=((Player) players.get(0)).getName();
		Mark actualMark=((Player)players.get(0)).getMark();
		//assert
		assertEquals(expectedPlayerName,actualPlayerName);
		assertEquals(expectedMark,actualMark);
		
	}
	@Test
	void test_for_switching_player() {
		//arrange
		Player player1=new Player("abc",Mark.X);
		Player player2=new Player("xyz",Mark.O);
		players.add(player1);
		players.add(player2);
		Game game=new Game(resultanalyzer,players,board);
		game.switchPlayer();
		Player expectedPlayer=(Player) players.get(1);
		//act
		Player actualPlayer=game.getCurrentPlayer();
		//assert
		assertEquals(expectedPlayer,actualPlayer);
	}
	

}
