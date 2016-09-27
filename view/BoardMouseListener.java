package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MouseInputAdapter;

import controller.Controller;
import model.Point;

public class BoardMouseListener extends MouseInputAdapter
{
	private Controller controller;
	
	public BoardMouseListener(Controller c)
	{
		controller = c;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		controller.setMousePressedFlag(true);
		controller.setPositionOfMouse(new Point(arg0.getX(),arg0.getY()));
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
			controller.setPositionOfMouse(new Point(arg0.getX(),arg0.getY()));
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		controller.setMousePressedFlag(false);	
	}
	
	
}
