package com.train.booking.htmlutil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HtmlUtil {

	
	public static String  converter(String path)
	{StringBuffer sb= new StringBuffer();
	
		
		try {
			FileReader fr= new FileReader(path);
			
			int ch=0;
			
			while((ch=fr.read())!=-1)
			{
			sb.append((char)ch);	
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return sb.toString();
	}
	
}
