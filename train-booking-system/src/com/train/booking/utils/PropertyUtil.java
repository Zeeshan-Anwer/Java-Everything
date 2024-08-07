package com.train.booking.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.train.booking.jdbc.connection.DBDetails;

public class PropertyUtil {

public static DBDetails getCredentials()
{
	DBDetails db= new DBDetails();
	
	try 
	{
		FileReader fr= new FileReader("C:\\Users\\dell2\\eclipse-workspace\\train-booking-system\\src\\com\\train\\booking\\utils\\credentials.properties");
	     Properties pro=new Properties();
	     pro.load(fr);
	     
	     db.setUrl(pro.getProperty("dburl"));
	     db.setName(pro.getProperty("dbusername"));
	     db.setPassword(pro.getProperty("dbpassword"));
	     
	     
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return db;
	

}
	
}
