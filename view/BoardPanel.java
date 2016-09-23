package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class BoardPanel extends JPanel  implements ActionListener 
{

	public BoardPanel(int width,int height)
	{
		setPreferredSize(new Dimension(width, height));
		
		setBackground(Color.black);
		setFocusable(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
