package com.techlab.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.business.Mark;
import com.techlab.business.Player;

class PlayerTest {
	Player player=new Player("abc",Mark.X);

	@Test
	void test_of_Player() {
		//arrange
		String expectedName="abc";
		Mark expectedMark=Mark.X;
		//act
		String actualName=player.getName();
		Mark actualMark=player.getMark();
		//assert
		assertEquals(expectedName,actualName);
		assertEquals(expectedMark,actualMark);
		
		
	}

}
