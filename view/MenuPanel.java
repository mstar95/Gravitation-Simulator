package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuPanel extends JPanel 
{
	private JButton buttonTiny, buttonSmall, buttonMedium, buttonLarge, buttonHuge;
	private JTextField textMass;
	
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
		
		c.anchor = GridBagConstraints.LINE_END;
		
		JLabel labelMass = new JLabel("Mass:");
		labelMass.setForeground(Color.RED);
		c.gridx = 0;
		c.gridy = 0;
		add(labelMass, c);
		
		c.fill=GridBagConstraints.HORIZONTAL;
		buttonTiny = new JButton("Tiny");
		//buttonTiny.setFont(new Font("Arial", Font.PLAIN, 16));
		c.gridx = 0;
		c.gridy = 1;
		add(buttonTiny, c);

		buttonSmall = new JButton("Small");
		c.gridx = 0;
		c.gridy = 2;
		add(buttonSmall, c);

		buttonMedium = new JButton("Medium");
		c.gridx = 0;
		c.gridy = 3;
		add(buttonMedium, c);

		buttonLarge = new JButton("Large");
		c.gridx = 0;
		c.gridy = 4;
		add(buttonLarge, c);
		
		buttonHuge = new JButton("Huge");
		c.gridx = 0;
		c.gridy = 5;
		add(buttonHuge, c);
		
		c.anchor = GridBagConstraints.LINE_START;
		
		textMass = new JTextField(10);
		textMass.setText("1000");
		c.gridx = 1;
		c.gridy = 0;
		add(textMass,c);
	}
	
	public void setupListeners()
	{
		buttonTiny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMass.setText("1");
			}
		});
		
		buttonSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMass.setText("1000");
			}
		});
		
		buttonMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMass.setText("10000");
			}
		});
		
		buttonLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMass.setText("100000");
			}
		});
		
		buttonHuge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMass.setText("1000000");
			}
		});
	}
}
