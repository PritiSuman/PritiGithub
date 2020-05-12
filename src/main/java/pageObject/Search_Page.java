package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Page {
	
	private static WebElement element = null;
	
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
