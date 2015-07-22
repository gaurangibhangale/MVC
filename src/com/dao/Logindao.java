package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.User;
import com.util.DBConfiguration;

public class Logindao {

	public boolean authenticate(User user) {
		String userName = user.getUsername(); 
		 String password = user.getPassword();
		 
		 Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		String userNameDB = "";
		 String passwordDB = "";
		 
		try
		 {
		 con = DBConfiguration.createConnection();
		 statement = con.createStatement();
		 System.out.println("inside logindoa");
		 resultSet = statement.executeQuery("select username,password from user");		
		 System.out.println("after query");
		while(resultSet.next()) // Until next row is present otherwise it return false
		 {
		  userNameDB = resultSet.getString("username"); //fetch the values present in database
		  passwordDB = resultSet.getString("password");
		 
		   if(userName.equals(userNameDB) && password.equals(passwordDB))
		   {
			   System.out.println("match found");
		      return true; 
		   }
		  }
		 }
		 catch(SQLException e)
		 {
		 e.printStackTrace();
		 }
		 return false;
		 
		
	}

	public boolean adduser(User user) {
		
		  Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		  PreparedStatement preparedStatement = null;

		 
		try
		 {
		 con = DBConfiguration.createConnection();
		 statement = con.createStatement();
		 
		 preparedStatement = con
		          .prepareStatement("insert into user (name, email, username, password) values (?,?,?,?)");

		      preparedStatement.setString(1, user.getName());
		      preparedStatement.setString(2, user.getEmail());
		      preparedStatement.setString(3, user.getUsername());
		      preparedStatement.setString(4, user.getPassword());
		      int count=preparedStatement.executeUpdate();
		      
		      if(count>0)
		      {
		    	  return true;
		      }
		     
		 }
		
		catch(SQLException e)
		 {
		 e.printStackTrace();
		 }
		 return false;
	}

}
