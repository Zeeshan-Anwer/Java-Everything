package com.training.Map;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {


				HashMap<Integer, String> Windows = new HashMap<>();


				HashMap<String, Integer> Brand= new HashMap<String, Integer>();


				Windows.put(1, "Windows 11");
				Windows.put(2, "Windows 10");
				Windows.put(3, "Windows 98");

				Brand.put("Nokia",1);
				Brand.put("Samsung",2);
				Brand.put("Redmi",3);

				System.out.println("Mappings of HashMap By Windows are : "
								+ Windows);
				System.out.println("Mapping of HashMap By Brand are : "
								+ Brand);
				
				Brand.remove("Redmi");
				Windows.remove(1);
				
				System.out.println("**************************");
				
				System.out.println("Update data of Mappings of HashMap By Windows are : "
						+ Windows);
				System.out.println("Update data of Mapping of HashMap By Brand are : "
						+ Brand);
				
			}
		


	}


