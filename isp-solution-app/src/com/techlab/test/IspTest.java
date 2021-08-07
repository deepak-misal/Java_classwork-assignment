package com.techlab.test;

import com.techlab.model.IEatable;
import com.techlab.model.IWorkable;
import com.techlab.model.Manager;
import com.techlab.model.Robot;

public class IspTest {

	public static void main(String[] args) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		printWorkInfo(manager);
		printEatInfo(manager);
		printWorkInfo(robot);

	}

	private static void printWorkInfo(IWorkable w) {
		w.startWork();
		w.stopWork();
		
	}

	private static void printEatInfo(IEatable e) 
	{
		e.startEat();
		e.stopEat();
		
	}

}
