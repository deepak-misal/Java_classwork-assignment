package com.techlab.business;

import java.util.ArrayList;
import java.util.List;
public class Board implements IBoard {
	private int size;
	private List<Cell> cells=new ArrayList<Cell>();
	public Board(int size)
	{
		this.size=size;
		for (int i = 0; i < size*size; i++) {
			cells.add(new Cell());
		}
	}
	@Override
	public ArrayList<Cell> getBoard() {
		return (ArrayList<Cell>) cells;
	}
	@Override
	public void markCell(int cellNo, Mark mark) throws CellAlreadyMarkedException {
		cells.get(cellNo).setMark(mark);
	}
	@Override
	public boolean checkIfBoardFull() {
		for (Cell cell : cells)
		{
			if ((cell.getMark().equals(Mark.EMPTY)))
				return false;
		}
		return true;
	}
	@Override
	public int getBoardSize() {
		return size;
	}
	@Override
	public Mark getCellValue(int i) {
		return cells.get(i).getMark();
	}
}
