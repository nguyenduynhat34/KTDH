/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author nguye
 */
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class test1 extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
        int width = 300;
        int height = 200;
                

	public test1() {
		setTitle("Simple Frame");
		addMouseListener(this);
                setSize(width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//System.out.println("Mouse Clicked at X: " + x + " - Y: " + y);
                
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Entered frame at X: " + x + " - Y: " + y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Exited frame at X: " + x + " - Y: " + y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Pressed at X: " + x + " - Y: " + y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Released at X: " + x + " - Y: " + y);
	}

	private static void createAndShowGUI() {

  //Create and set up the window.

  JFrame frame = new test1();

  //Display the window.

  frame.setVisible(true);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

	public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.

  javax.swing.SwingUtilities.invokeLater(new Runnable() {

public void run() {

    createAndShowGUI(); 

}

  });
    }

}
