package com.techlab.business;

public class ResultAnalyzer {

	private IBoard board;
	private int size;
	
	private Mark markOfWinner;
	private String winX="", winO="";
	int temp;
	boolean val;
	public ResultAnalyzer(IBoard board)
	{
		this.board=board;
		this.size=board.getBoardSize();
		for (int i=0 ; i< size;i++) {
			winX+=Mark.X;
			winO+=Mark.O;
		}
	}
	public boolean analyzeResult()
	{
		if(rowChecker())	return true;
		else if(columnChecker()) return true;
		else if(leftDiagonalChecker()) return true;
		else if(rightDiagonalChecker()) return true;
		else return false;
	}

	public boolean rowChecker() {
		temp=0;
		for (int i = 0; i < size; i++) 
		{
			String checkWinner="";
			for (int j = 0; j < size; j++) 
				checkWinner+=board.getCellValue(temp++);
			if(checkWinner.equals(winX))	
			{
				markOfWinner=Mark.X; 
				return true;
			}
			else if(checkWinner.equals(winO))	
			{
				markOfWinner=Mark.O; 
				return true;
			}
		}
		return false;
	}
	public boolean columnChecker() {
		for(int i=0;i<size;i++)
		{
			temp=i;
			String checkWinner="";
			for (int j = 0; j < size; j++) 
			{
				checkWinner+=board.getCellValue(temp);
				temp+=size;
			}
			if(checkWinner.equals(winX))	
			{
				markOfWinner=Mark.X; 
				return true;
			}
			else if(checkWinner.equals(winO))	
			{
				markOfWinner=Mark.O; 
				return true;
			}
		}
		return false;
	}	

	public boolean leftDiagonalChecker() {
		temp=0;
		String checkWinner="";
		for (int i = 0; i < size; i++) 
		{	checkWinner+=board.getCellValue(temp);
			temp=temp+(size+1);
		}
		if(checkWinner.equals(winX))	
		{
			markOfWinner=Mark.X; 
			return true;
		}
		else if(checkWinner.equals(winO))	
		{
			markOfWinner=Mark.O; 
			return true;
		}
		return false;
	}
	public boolean rightDiagonalChecker() {
		temp=size-1;
		String checkWinner="";
		for (int i = 0; i < size; i++) 
		{
			checkWinner+=board.getCellValue(temp);
			temp+=size-1;
		}
		if(checkWinner.equals(winX))	
		{
			markOfWinner=Mark.X; 
			return true;
		}
		else if(checkWinner.equals(winO))	
		{
			markOfWinner=Mark.O; 
			return true;
		}
		return false;
	}
	public Mark getMarkOfWinner() {
		return markOfWinner;
	}
}


