package org.amdocs;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.lang.Exception;
import java.util.HashMap;
import java.util.Properties;

public class mathFactory {

	private static HashMap<String,String> classNameMap;
	static
	{
		classNameMap=new HashMap<String,String>();
		FileInputStream file;
		
		try {
			 file=new FileInputStream("src/main/resources/config.properties");
			Properties properties=new Properties();
			properties.load(file);
			
			properties.forEach((key,value) ->
			{
				classNameMap.put((String)key, (String)value);
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public static IMathOperation getObject(String mathOperator) {
		// TODO Auto-generated method stub
		IMathOperation mathOperation=null;
		String className;
		className=classNameMap.get(mathOperator);
		
		
		try
		{
			mathOperation=(IMathOperation)Class.forName(className).newInstance();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return mathOperation;
	}

}
