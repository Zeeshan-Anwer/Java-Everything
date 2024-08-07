/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;

import com.train.StringConstant.StringConstant;

/**
 *
 * @author dell2
 */
public class Admin extends User
{
   

 
  public static String AdminLogin(String name,String password)
  {
            
  if(name.equalsIgnoreCase("admin")&&password.equals("123"))
  {
     return StringConstant.LOGGED_IN;
      
  }
      else
  {
      return StringConstant.WRONG_CREDENTIALS;
     
    
  }
      
        
      
  }

public void setName(String string) {
	// TODO Auto-generated method stub
	
}
  
}
