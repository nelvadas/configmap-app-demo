package com.redhat.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MainTest {

	public static void main(String[] args) {

	while(true){	
	System.out.println("Displaying Application Configuration");
	
	System.out.println("01-ENV VAR");
	System.out.println("ENV="+System.getenv("ENV"));
	System.out.println("LOG_LEVEL="+System.getenv("LOG_LEVEL"));
	System.out.println(System.getenv());
	
	
	System.out.println("02-System propreties ");
	System.out.println("Option1="+System.getProperty("Option1"));
	System.out.println("Option2="+System.getProperty("Option2"));
	System.out.println(System.getProperties());
	

	
	System.out.println("03-Configuration Files");
	try {
    InputStream inputStream =new FileInputStream( new File("/etc/config.properties")) ;
		Properties props = new Properties();
		props.load(inputStream);
		
		for (String key : props.stringPropertyNames()) {
			System.out.println(key+"="+props.getProperty(key));
		}
		
		
		Thread.sleep(1000);
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	

	}
	
}
	

}
