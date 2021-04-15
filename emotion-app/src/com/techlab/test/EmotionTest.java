package com.techlab.test;

import com.techlab.model.IEomtionable;
import com.techlab.model.ISocialization;
import com.techlab.model.Infant;
import com.techlab.model.Man;

public class EmotionTest {
	public static void main (String[] args) {
		doEmotionaTest(new Man());
		doEmotionaTest(new Infant());
		doSocializationTest(new Man());
	}

	private static void doSocializationTest(ISocialization man) {
		man.depart();
		man.wish();
		
	}

	private static void doEmotionaTest(IEomtionable obj) {
		obj.cry();
		obj.laugh();
		
	}
	
}
