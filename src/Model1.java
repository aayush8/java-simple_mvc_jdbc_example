package com.aayush.javabc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model1 {
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData resultSetMetaData;
	private ArrayList<String[]> actorData;
	
	public Model1() {
		
		actorData =  new ArrayList<String[]>();
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM actor");
			resultSetMetaData = resultSet.getMetaData();
			ArrayList<String> row = new ArrayList<String>();
			String row2[] = {};
			
			while(resultSet.next()) {
				row.clear();
				for (int i=1; i<=resultSetMetaData.getColumnCount(); i++) {
					row.add(resultSet.getObject(i).toString());
					//row2 = row2 + resultSet.getObject(i).toString();
				}
			String temp[] = row.toArray(new String[0]);
			
			actorData.add(temp);
			}
			
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String[][] returnActors() {
		String temp  [][] = actorData.toArray(new String[0][0]);
		for (int i=0; i<actorData.size(); i++) {
			//
		}
		return temp;
	}
	
	

}
