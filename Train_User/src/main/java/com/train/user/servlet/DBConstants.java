package com.train.user.servlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConstants {

//	public static final String DB_QUERY_1="CREATE TABLE TRAIN_DETAILS"
//	                                    //  +"(TRAINNUMBER INTEGER not null,"  //what is TRAINNUMBER here
//	                                      +"TRAINNUMBER INTEGER,"
//	                                      +"TRAINNAME VARCHAR(50),"
//                                           
//			                              +"FROMSTATION VARCHAR(50),"
//			                              +"TOSTATION VARCHAR(50),"
//			                              +"SEATSAVAILABLE INTEGER,"
//                                          +"FARE INTEGER,"
//			                              +"DATEOFJOURNEY INTEGER,"
//                                          + "PRIMARY KEY(TRAINNUMBER))";
	
	

	
	
	public static final String INSERT_QUERY_TRAINDETAILS=
"insert into train_details(TRAINNUMBER,TRAINNAME,FROMSTATION,TOSTATION,SEATSAVAILABLE,FARE,DATEOFJOURNEY)values(?,?,?,?,?,?,?);";
    
	public static final String INSERT_QUERY_USER="insert into user_details(Username,Firstname,MiddleName,Secondname,AddressLine1,AddressLine2, AddressLine3,City,State,Country,Pincode,Password,Age) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
			
	public static final String SELECT_QUERY_WITHOUT_WHERE="SELECT * FROM TRAIN_DETAILS" ;
	
	public static final String DELETE_QUERY="DELETE FROM TRAIN_DETAILS WHERE TRAINNUMBER=?" ;
	
	public static final String UPDATE_QUERY="UPDATE TRAIN_DETAILS SET TRAINNUMBER=?,TRAINNAME=?,FROMSTATION=?,TOSTATION=?,SEATSAVAILABLE=?,FARE=?,DATEOFJOURNEY=? WHERE TRAINNUMBER=?" ;
	
	public static final String SELECT_QUERY_ON_TRAINNO ="SELECT * FROM TRAIN_DETAILS WHERE TRAINNUMBER=?" ;
	public static final String SELECT_QUERY_ONSTATION="SELECT * FROM TRAIN_DETAILS WHERE FROMSTATION=? AND TOSTATION=?" ;

	public static final String CREATE_QUERY="CREATE TABLE USER_DETAILS"
            +"(TRAINNUMBER INTEGER not null,"
            +"FIRSTNAME VARCHAR(50),"
            +"LASTNAME VARCHAR(50),"
             
            +"DATEOFBIRTH VARCHAR(50),"
           
            +"PASSWORD VARCHAR(50),"
            +"CONTACT VARCHAR(10),"
            + "PRIMARY KEY(TRAINNUMBER))";

	public static final String INSERT_QUERY_USER_DETAILS=
			"INSERT INTO USER_DETAILS(FIRSTNAME,LASTNAME,DATEOFBIRTH,PASSWORD,CONTACT) VALUES(?,?,?,?,?);";
             
	public static final String User_DB_QUERY_3="SELECT * FROM USER_DETAILS WHERE FIRSTNAME=? AND PASSWORD=? ;" ;

	public static final String FINDTRAIN_USERQUERY="SELECT * FROM TRAIN_DETAILS WHERE FROMSTATION=? AND TOSTATION=? ;" ;

	
}

