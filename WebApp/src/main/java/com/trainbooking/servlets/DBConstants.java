package com.trainbooking.servlets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConstants {

	public static final String DB_QUERY_1="CREATE TABLE TRAIN_DETAILS"
	                                      +"(ID INTEGER not null,"
	                                      +"TRAINNUMBER INTEGER,"
	                                      +"TRAINNAME VARCHAR(50),"
                                           
			                              +"FROMSTATION VARCHAR(50),"
			                              +"TOSTATION VARCHAR(50),"
			                              +"SEATSAVAILABLE INTEGER,"
                                          +"FARE INTEGER,"
			                              +"DATEOFJOURNEY INTEGER,"
                                          + "PRIMARY KEY(ID))";
	public static final String DB_QUERY_2=
"insert into train_details(TRAINNUMBER,TRAINNAME,FROMSTATION,TOSTATION,SEATSAVAILABLE,FARE,DATEOFJOURNEY)values(?,?,?,?,?,?,?);";
                                      
	public static final String DB_QUERY_3="SELECT * FROM TRAIN_DETAILS" ;
	
	public static final String DB_QUERY_4="DELETE FROM TRAIN_DETAILS WHERE ID=?" ;
	
	public static final String DB_QUERY_5="UPDATE TRAIN_DETAILS SET TRAINNAME=?,FROMSTATION=?,TOSTATION=?, SEATSAVAILABLE=?,FARE=?,DATEOFJOURNEY=? WHERE TRAINNUMBER=?" ;
	
	public static final String DB_QUERY_6="SELECT * FROM TRAIN_DETAILS WHERE TRAINNUMBER=?" ;
	public static final String DB_QUERY_7="SELECT * FROM TRAIN_DETAILS WHERE FROMSTATION=? AND TOSTATION=?" ;

	public static final String User_DB_QUERY_1="CREATE TABLE USER_DETAILS"
            +"(ID INTEGER not null,"
            +"FIRSTNAME VARCHAR(50),"
            +"LASTNAME VARCHAR(50),"
             
            +"DATEOFBIRTH VARCHAR(50),"
           
            +"PASSWORD VARCHAR(50),"
            +"CONTACT VARCHAR(10),"
            + "PRIMARY KEY(ID))";

	public static final String User_DB_QUERY_2=
			"INSERT INTO USER_DETAILS(FIRSTNAME,LASTNAME,DATEOFBIRTH,PASSWORD,CONTACT) VALUES(?,?,?,?,?);";
             
	public static final String User_DB_QUERY_3="SELECT * FROM USER_DETAILS WHERE FIRSTNAME=? AND PASSWORD=? ;" ;
        

	
}
