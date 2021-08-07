package com.techlab.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.business.Cell;
import com.techlab.business.CellAlreadyMarkedException;
import com.techlab.business.Mark;

class CellTest {
	Cell c=new Cell();
	Mark actualMark;
	Mark expectedMark;
	@Test
	void test_if_the_cell_is_empty() {
		expectedMark=Mark.EMPTY;
		actualMark=c.getMark();
		assertEquals(expectedMark,actualMark);
	}
	@Test
	void test_cell_marked_as_x() {
		expectedMark=Mark.X;
		try {
			c.setMark(Mark.X);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actualMark=c.getMark();
		assertEquals(expectedMark,actualMark);
	}
	@Test
	void test_cell_marked_as_o() {
		expectedMark=Mark.O;
		try {
			c.setMark(Mark.O);
		} catch (CellAlreadyMarkedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actualMark=c.getMark();
		assertEquals(expectedMark,actualMark);
	}
	@Test
	void test_if_cell_is_already_marked() throws CellAlreadyMarkedException {
		String expectedmsg="this cell is already marked!";
		c.setMark(Mark.X);
		String actualmsg=null;
		try {
			c.setMark(Mark.O);
		} catch (CellAlreadyMarkedException e) {
			actualmsg=e.getMessage();
		}
		assertEquals(expectedmsg,actualmsg);
	}
}
