package com.techlab.unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlab.business.Board;
import com.techlab.business.Cell;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.IBoard;
import com.techlab.business.Mark;
import com.techlab.business.ResultAnalyzer;

class ResultAnalyzerTest {
	boolean expected_true,actual_true;
	boolean expected_false,actual_false;
	int size=3;
	IBoard board = new Board(size);
	List<Cell> cells=new ArrayList();
	ResultAnalyzer resultAnalyzer=new ResultAnalyzer(board);

	void test_for_board() {
		//arrange
		IBoard expectedBoard=(IBoard) cells;
		int expectedSize=3;
		//act
		//Board actualBoard=(Board) board.getBoard();
		//int actualSize=board.getBoardSize();
		//assert
		//assertEquals(expectedBoard,actualBoard);
		//assertEquals(expectedSize,actualSize);
	}
	@Test
	void test_if_we_got_winner() throws CellAlreadyMarkedException {
		//arrange
		expected_true=true;
		//act
		board.markCell(0, Mark.X);
		board.markCell(1, Mark.X);
		board.markCell(2, Mark.X);
		actual_true= resultAnalyzer.rowChecker();
		//assert
		assertEquals(expected_true,actual_true);
	}
}
