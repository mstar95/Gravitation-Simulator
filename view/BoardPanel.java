package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import model.Observer;
import model.Params;

public class BoardPanel extends JPanel  implements ActionListener, Observer
{
	private Params params;
	private Timer timer;
	private final int DELAY = 10;
	public BoardPanel(int width,int height)
	{
		setPreferredSize(new Dimension(width, height));
		
		setBackground(Color.black);
		setFocusable(true);
		
		timer = new Timer(DELAY,this);
		params = new Params();
		
		timer.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		 repaint();
	}

	@Override
	public void update(Params params) 
	{
		this.params = params;
	}
	
	public void paintComponent(Graphics g) 
	{
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        if(params.isMousePressed == true)
        {
        	
        	g2d.setColor(Color.RED);
        	g2d.drawLine(params.getMouseVector().getA().getX(),
        		params.getMouseVector().getA().getY(),
        		params.getMouseVector().getB().getX(),
        		params.getMouseVector().getB().getY());
        	repaint();
        }
     }
}
