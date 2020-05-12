package pageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	private static WebElement element = null;
	 
	 public static WebElement txt_EmailAddress(WebDriver driver) {
		 element = driver.findElement(By.name("email"));
		 return element;
	 }
	 
	 public static WebElement txt_Password(WebDriver driver)
	 {
		 element = driver.findElement(By.name("password"));
		 return element;
	 }
	 
	 public static WebElement btn_Login(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		 return element;
	 }
	 
	 public static WebElement lnk_Logout(WebDriver driver) 
	 {
		 element = driver.findElement(By.linkText("Logout"));
		return element;
		 
	 }
	 
	 public static WebElement txt_search(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//input[contains(@class, 'form-control input-lg')]"));
			return element;
			
		}
		
		public static WebElement btn_Search(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//button[contains(@class, 'btn btn-default')]"));
			return element;
			
		}

}
