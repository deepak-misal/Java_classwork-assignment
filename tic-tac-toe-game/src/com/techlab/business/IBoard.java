package com.techlab.business;

import java.util.ArrayList;

public interface IBoard {

	ArrayList<Cell> getBoard();

	void markCell(int cellNo, Mark mark) throws CellAlreadyMarkedException;

	boolean checkIfBoardFull();

	int getBoardSize();

	Mark getCellValue(int i);

}