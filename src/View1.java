package com.aayush.javabc;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class View1 extends JFrame{

	private JButton addButton;
	private JTable actorTable;
	private String columnName[] = {"ID", "AGE", "NAME"};
	private String data[][] = {};
	private JScrollPane jScrollPane;
	private JLabel jLabel;
	
	public View1() 
	{
		super("Aayush Simple java MVC");
		setLayout(new FlowLayout());
		
		addButton = new JButton("Add new actor");
		jLabel = new JLabel("Existing Actors");
		
	}
	
	public void setData(String data[][]) {
		add(jLabel);
		actorTable = new JTable(data, columnName) ;
		jScrollPane = new JScrollPane(actorTable);
		//adding table
		add(jScrollPane);
		//add(addButton);
	}
	
	
	
}
