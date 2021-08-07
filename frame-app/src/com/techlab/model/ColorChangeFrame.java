package com.techlab.model;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;

public class ColorChangeFrame extends Frame implements ActionListener {

	private JButton btnRed, btnBlue;

	public ColorChangeFrame() {
		super("AWT Buttons");
		btnRed = new JButton("Red");
		btnRed.setBounds(25, 50, 250, 30);
		btnRed.addActionListener(this);
		this.add(btnRed);
		
		btnBlue = new JButton("Blue");
		btnBlue.setBounds(25, 100, 250, 30);
		btnBlue.addActionListener(this);
		this.add(btnBlue);
		
		this.setSize(300, 200);
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRed) {
			this.setBackground(Color.RED);
		} else if (e.getSource() == btnBlue) {
			this.setBackground(Color.BLUE);
		}

	}

}
