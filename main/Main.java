package main;

import javax.swing.SwingUtilities;

import controller.Controller;
import model.Model;
import view.View;

public class Main 
{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Controller controller = new Controller();
				Model model = new Model();
				View  view = new View(controller);
			}
		});
	}
}
