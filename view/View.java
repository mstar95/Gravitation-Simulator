package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Model;

public class View 
{
	private final int B_WIDTH = 1000;
	private final int B_HEIGHT = 600;
	private final int M_WIDTH = 200;
	private final int M_HEIGHT = 200;

	private BoardPanel boardPanel;
	private MenuPanel menuPanel;
	private JFrame frame;
	private Model model;
	private Controller controller;

	public View(Controller c) 
	{
		controller = c;

		createGUI();
		//setupObservers();
		setupListeners();
	}

	
	//creates Frame and Panels
	private void createGUI()
	{
		frame = new JFrame("GRAVITATION");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		boardPanel = new BoardPanel(B_WIDTH,B_HEIGHT);
		menuPanel = new MenuPanel(M_WIDTH,M_HEIGHT);
		
		c.anchor = GridBagConstraints.LAST_LINE_START;
		c.gridx = 0;
		c.gridy = 1;
		
		frame.add(menuPanel,c);
		frame.add(boardPanel,c);
		frame.pack();
	}
	
	private void setupListeners()
	{
		//boardPanel.setupListeners();
	//	menuPanel.setupListeners();
	}
	
}
