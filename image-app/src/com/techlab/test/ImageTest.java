package com.techlab.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageTest {

	public static void main(String[] args) {
	try {
		Image image1= ImageIO.read(new File("D:\\javaclasswork_a\\image-app\\src\\com\\techlab\\test\\itachi.jpg"));
		BufferedImage img= (BufferedImage) image1;
		BufferedImage img1= img.getSubimage(0, 0, img.getWidth(), img.getHeight()/2);
		File outputfile = new File("D:\\javaclasswork_a\\image-app\\src\\com\\techlab\\test\\itachi1.jpg");
		ImageIO.write(img1, "jpg", outputfile);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
