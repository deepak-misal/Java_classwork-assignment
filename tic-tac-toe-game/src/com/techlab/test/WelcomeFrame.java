package com.techlab.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomeFrame implements ActionListener{
	JLabel label1 , label2;
	JTextField player1,player2;
	
	 public WelcomeFrame() {
		 JFrame frame=new JFrame("Welcome");  
		 JButton submit=new JButton("Sumbit");
		 label1=new JLabel("Player 1:");
		 label1.setBounds(20, 50, 70, 20);
		 label1.setFont(new Font("Verdana", Font.PLAIN, 15));
		 label2=new JLabel("Player 2:");
		 label2.setBounds(20, 100, 70, 20);
		 label2.setFont(new Font("Verdana", Font.PLAIN, 15));
		 
		 
		 player1=new JTextField();
		 player1.setBounds(100,50, 150,30); 
		 
		 player2=new JTextField();
		 player2.setBounds(100,100, 150,30);
		 
		 submit.setBounds(100,200,95,30);
		 submit.addActionListener(this);
		 
		 frame.add(label1);
		 frame.add(label2);
		 frame.add(player1);
		 frame.add(player2);
		 frame.add(submit); 
		 frame.setSize(400,400);  
		 frame.setLayout(null);  
		 frame.setVisible(true);   
		}  
	     
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		new TicTacToeUI();
		
	}
	
}
