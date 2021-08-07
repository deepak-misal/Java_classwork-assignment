package com.techlab.test;

import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robots;

public class IspTest {

	public static void main(String[] args) {
		Managers manager=new Managers();
		Robots robot=new Robots();
		printInfo(manager);
		printInfo(robot);
	}

	private static void printInfo(IWorkable obj) {
		obj.startWork();
		obj.stopWork();
		obj.stratEat();
		obj.stopEat();
		
	}

}
