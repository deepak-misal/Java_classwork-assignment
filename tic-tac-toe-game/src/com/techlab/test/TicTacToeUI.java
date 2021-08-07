package com.techlab.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.techlab.business.Board;
import com.techlab.business.Game;
import com.techlab.business.IBoard;
import com.techlab.business.Mark;
import com.techlab.business.Player;
import com.techlab.business.Result;
import com.techlab.business.ResultAnalyzer;

public class TicTacToeUI implements ActionListener {
	private Game game;
	private JFrame frame = new JFrame();
    private JPanel bt_panel = new JPanel();
	private JButton[] bton = new JButton[9];
	private ResultAnalyzer resultAnalyzer;
	private IBoard board;
	private JLabel textfield;
	
	public TicTacToeUI() {
		this.board=new Board(3);
		ArrayList<Player> players=new ArrayList<Player>();
		this.resultAnalyzer=new ResultAnalyzer(board);
		
		Player player1=new Player("a",Mark.X);
		Player player2=new Player("b",Mark.O);

		players.add(player1);
		players.add(player2);

		this.game= new Game(resultAnalyzer, players,board);
		
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setTitle("Tic Tac Toe");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        bt_panel.setLayout(new GridLayout(4, 3)); 
        bt_panel.setBackground(new Color(150, 150, 150));
        
        for (int i = 0; i < 9; i++) {
        	final int a=i;
            bton[i] = new JButton(Integer.toString(i));
            bton[i].setFont(new Font("Verdana", Font.PLAIN, 25));
            bt_panel.add(bton[i]);
            bton[i].setFocusable(true);
            bton[i].addActionListener(this);
        }
        this.textfield = new JLabel();
        textfield.setBounds(150,650, 500, 400);
        textfield.setFont(new Font("Verdana", Font.PLAIN, 25));
        frame.add(textfield);
        frame.add(bt_panel);
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			textfield.setText("Current Player:"+game.getCurrentPlayer().getName()+" Game status: ongoing");
			int cellLocation=Integer.parseInt(e.getActionCommand());
			bton[cellLocation].setText(game.getCurrentPlayer().getMark().toString());
			game.play(cellLocation);
			game.switchPlayer();
			boolean isWin=resultAnalyzer.analyzeResult();
			if(isWin==true) {
				 String winner= game.getWinnerName();
				 textfield.setText("Winner:"+winner);
				 disableButton();
			}
		}catch(Exception ea){
			textfield.setText("Cell is already marked!");
		}
		
	}

	private void disableButton() {

		for(int i=0;i<9;i++) {
			bton[i].setEnabled(false);
		}
		
	}

}
