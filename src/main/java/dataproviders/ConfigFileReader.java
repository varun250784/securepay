package dataproviders;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ConfigFileReader { 
	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir")+"/Config.properties";

	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} 
	}

	public String getDriverPath(){
		
		switch (properties.getProperty("browser").toLowerCase())
		{
		case("ie"):
			return (System.getProperty("user.dir")+"/drivers/iedriver");
		
		case("chrome"):
			return (System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		default:
			
			throw new RuntimeException("Check driver type in Config.properties, current choice : "+properties.getProperty("browser")+" is not allowed, should be ie or chrome" ); 
		
		}
	}
		
		public String getDriverName(){
			
			switch (properties.getProperty("browser").toLowerCase())
			{
			case("ie"):
				return "ie";
			
			case("chrome"):
				return "chrome";
			default:	
				throw new RuntimeException("Check driver type in Config.properties, current choice : "+properties.getProperty("browser")+" is not allowed, should be ie or chrome" ); 
			
			}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("appurl");
		if(url != null) return url;
		else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
	}
	
	public long getImplicitWait() { 
		 String wait = properties.getProperty("wait");
		 if(wait != null) {
		 try{
		 return Long.parseLong(wait);
		 }catch(NumberFormatException e) {
		 throw new RuntimeException("Not able to parse value : " + wait + " in to Long");
		 }
		 }
		 return 30; 
		 }
}

