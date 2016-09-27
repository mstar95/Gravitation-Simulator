package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Observer;
import model.Params;

public class BoardPanel extends JPanel  implements ActionListener, Observer
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

	@Override
	public void update(Params params) {
		// TODO Auto-generated method stub
		
	}
}
