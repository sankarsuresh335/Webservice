package seleniumDemo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jar and Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
		driver.manage().window().maximize();
		
		String mainwindow=driver.getWindowHandle();
		
		Set<String> str=driver.getWindowHandles();
		
		 Iterator<String> it=str.iterator();
		 
		 while(it.hasNext()) {
			 
			 
			 String childwindow=it.next();
			 
			 if(!mainwindow.equals(childwindow)) {
				 
				 driver.switchTo().window(childwindow).getTitle();
			 }
		 }
			 
				 
		
	}

}
