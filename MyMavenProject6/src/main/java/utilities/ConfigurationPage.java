package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigurationPage {
	
	public static Properties prop;
	
	public static void loadConfig(){
	
	File file= new File("src/main/resources/configuration.txt");

     InputStream is=null;
     
     try {
    	 
     is=new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
     prop=new Properties();
     
     try {
		prop.load(is);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
     
	}
	public static String getBrowser(){
		return prop.getProperty("browser");
		
	}
	public static String getURL(){
		return prop.getProperty("URL");
	}
	
}
