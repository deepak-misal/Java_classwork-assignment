package com.techlab.unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.business.Board;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.IBoard;
import com.techlab.business.Mark;

class BoardTest {
	int expectedSize=3;
	int actualSize;
	IBoard b=new Board(expectedSize);
	@Test
	void test_size_of_board() {
		expectedSize=9;
		actualSize=b.getBoard().size();
		assertEquals(expectedSize,actualSize);
	}
	@Test
	void test_if_board_is_getting_marked() throws CellAlreadyMarkedException {
		Mark expectedMark=Mark.X;
		b.markCell(1,Mark.X);
		Mark actualMark=b.getBoard().get(1).getMark();
		assertEquals(expectedMark,actualMark);
	}
	@Test
	void test_if_board_is_full() throws CellAlreadyMarkedException {
		boolean expected=true;
		b.markCell(0, Mark.X);
		b.markCell(1, Mark.X);
		b.markCell(2, Mark.X);
		b.markCell(3, Mark.X);
		b.markCell(4, Mark.X);
		b.markCell(5, Mark.O);
		b.markCell(6, Mark.O);
		b.markCell(7, Mark.X);
		b.markCell(8, Mark.O);
		boolean actual=b.checkIfBoardFull();
		assertEquals(expected,actual);
	}
}
