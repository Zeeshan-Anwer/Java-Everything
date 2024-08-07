package com.nt.jdbc;
//ConTestMysql
import java.sql.*;
class ConTestOracle
{
	public static void main(String args[]) throws Exception
	{
		//register mysql driver into DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","zeeshan");
		if(con!=null)
			System.out.println("Established");
	}//main
}//class