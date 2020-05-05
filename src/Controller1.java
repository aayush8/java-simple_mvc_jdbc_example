package com.aayush.javabc;

import javax.swing.JFrame;

public class Controller1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		View1  view1 = new View1();
		Model1 model1 = new Model1();
		
		
		/*	GETTING RID OF HARDCODED DATA
		String[][] data = {
				{"1", "Aayush", "23"}
		};
		*/
		
		view1.setData(model1.returnActors());
		view1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view1.setSize(700, 500);
		view1.setLocationRelativeTo(null);
		view1.setVisible(true);

	}

}
