package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class IMovableTest {

	public static void main(String[] args) {
		IMovable[] arr=new IMovable[3];
		arr[0]=new Bike();
		arr[1]=new Car();
		arr[2]=new Truck();
		startRace(arr);
	}

	private static void startRace(IMovable[] movable) {
		for(int i=0;i<movable.length;i++) {
			movable[i].move();
		}
		System.out.println("Race Stopped");
		
	}

}
