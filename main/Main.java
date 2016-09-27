package main;

import javax.swing.SwingUtilities;

import controller.Controller;
import model.Model;
import view.View;

public class Main 
{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() 
			{
				Model model = new Model();
				Controller controller = new Controller( model);
				View  view = new View(controller);
				controller.setView(view);
				model.setController(controller);
			}
		});
	}
}
