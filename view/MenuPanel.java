package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuPanel extends JPanel 
{
	private JButton buttonTiny, buttonSmall, buttonMedium, buttonLarge, buttonHuge;
	private JTextArea textMass;
	
	public MenuPanel(int width,int height)
	{
		setPreferredSize(new Dimension(width, height));
		
		setBackground(Color.gray);
		setFocusable(true);

		setupButtons();
	}
	
	//adds all buttons and labels
	private void setupButtons() 
	{
		setLayout( new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
	//	c.anchor = GridBagConstraints.LAST_LINE_START;
		
		JLabel labelMass = new JLabel("Mass:");
		labelMass.setForeground(Color.RED);
		
		
		//c.ipady = 40; // make this component tall
	//	c.insets = new Insets(5,5,5,5);
		//c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 0;
		//c.weightx = 1;
		//c.weighty = 1;
		add(labelMass, c);

		textMass = new JTextArea();
		c.gridx = 1;
		c.gridy = 1;
		///c.weightx = 1;
	//	c.weighty = 0;
	//	c.ipadx = 100;
	//	c.gridwidth = 100;
		add(textMass,c);
		
		buttonTiny = new JButton("Tiny");
		buttonTiny.setFont(new Font("Arial", Font.PLAIN, 16));
		c.gridx = 0;
		c.gridy = 2;
	//	c.weightx = 0;
	//	c.weighty = 0;
	//	c.ipadx = 100;
	//	c.gridwidth = 100;
		add(buttonTiny, c);

		buttonSmall = new JButton("Small");
		c.gridx = 0;
		c.gridy = 3;
	//	c.weightx = 0;
	//	c.weighty = 0;
		add(buttonSmall, c);

		buttonMedium = new JButton("Medium");
		c.gridx = 0;
		c.gridy = 4;
	//	c.weightx = 0;
	//	c.weighty = 0;
		add(buttonMedium, c);

		buttonLarge = new JButton("Large");
		c.gridx = 0;
		c.gridy = 5;
	//	c.weightx = 0;
	//	c.weighty = 0;
		add(buttonLarge, c);
		
		buttonHuge = new JButton("Huge");
		c.gridx = 0;
		c.gridy = 6;
	//	c.weightx = 0;
	//	c.weighty = 0;
		add(buttonHuge, c);
		
	}
}
