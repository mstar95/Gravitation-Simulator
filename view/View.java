package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import controller.Controller;
import model.Model;
import model.Observer;

public class View 
{
	private final int B_WIDTH = 1000;
	private final int B_HEIGHT = 600;
	private final int M_WIDTH = 200;
	private final int M_HEIGHT = 200;

	private BoardPanel boardPanel;
	private MenuPanel menuPanel;
	private JFrame frame;
	private Controller controller;
	private JLayeredPane lPanel;
	
	public View(Controller c) 
	{
		controller = c;

		createGUI();
		setupObservers();
		setupListeners();
	}

	
	//creates Frame and Panels
	private void createGUI()
	{
		frame = new JFrame("GRAVITATION");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		lPanel = new JLayeredPane();
		lPanel.setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	   
		GridBagConstraints c = new GridBagConstraints();
		
		boardPanel = new BoardPanel(B_WIDTH,B_HEIGHT);
		menuPanel = new MenuPanel(M_WIDTH,M_HEIGHT);
	
		boardPanel.setBounds(0, 0,B_WIDTH,B_HEIGHT);
		menuPanel.setBounds(0, B_HEIGHT-M_WIDTH,M_WIDTH,M_HEIGHT);
		
		lPanel.add(boardPanel, JLayeredPane.DEFAULT_LAYER);
		lPanel.add(menuPanel, JLayeredPane.PALETTE_LAYER);
		frame.add(lPanel);
		
		frame.pack();
	}
	
	private void setupListeners()
	{
		BoardMouseListener listener =new BoardMouseListener(controller);
		boardPanel.addMouseMotionListener(listener);
		boardPanel.addMouseListener(listener);
		menuPanel.setupListeners();
	}
	
	private void setupObservers()
	{
		 ArrayList<Observer> observers = new ArrayList<Observer>();
		 observers.add(boardPanel);
		 controller.setupObservers(observers);
	}
	
}
