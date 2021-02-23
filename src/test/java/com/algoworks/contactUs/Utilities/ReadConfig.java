package com.algoworks.contactUs.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 
	public static Properties pr;
	public ReadConfig() 
	{
		File file= new File("./Configuration/config.properties");
		 
		try {
			FileInputStream	fis = new FileInputStream(file);
			pr=new Properties(); 
			pr.load(fis);
		} 
		 catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getChromeDriverPath()
	{
		return pr.getProperty("chromeDriverPath");
	}
	public String getGeckoDriverPath()
	{
		return pr.getProperty("geckoDriverPath");
	}

	public String getUrl()
	{
		return pr.getProperty("url");
	}
	
	public String getExcelPath()
	{
		return pr.getProperty("excelPath");
	}
	public String getReportPath()
	{
		return pr.getProperty("reportPath");
	}
	public  String getScreenshotPath()
	{
		return pr.getProperty("shotPath");
	}
	
	public  String getContactFormUrl()
	{
		return pr.getProperty("contactFormUrl");
	}
	
	
}
