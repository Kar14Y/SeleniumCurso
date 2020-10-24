package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opcion = new ChromeOptions();
		opcion.addArguments("--incognito");
		opcion.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver");
		driver = new ChromeDriver(opcion);
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
//		driver.close();

	}

}


//edge driver
