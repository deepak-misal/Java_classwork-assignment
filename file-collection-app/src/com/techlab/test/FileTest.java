package com.techlab.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("JavaFile.java");
		try {

			boolean value = file.createNewFile();
			if (value) {
				System.out.println("New Java File is created.");
			} else {
				System.out.println("The file already exists.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		String program ="hello";
		try {
			
			FileWriter output = new FileWriter("JavaFile.java");

			output.write(program);
			System.out.println("Data is written to the file.");

			output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		try {
		      File myObj = new File("JavaFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
