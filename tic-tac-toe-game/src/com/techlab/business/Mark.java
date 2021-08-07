package com.techlab.business;

public enum Mark {
	X{
		@Override
	    public String toString() {
	      return "X";
	    }
	}
	,O{
		@Override
	    public String toString() {
	      return "O";
	    }
	},EMPTY;
}
