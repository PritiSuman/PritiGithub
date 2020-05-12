package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Component_Page {
	
	private static WebElement element = null;
	 
	 public static WebElement lnk_Component(WebDriver driver) {
		 element = driver.findElement(By.linkText("Components"));
		 return element;
	 }
	 
	 public static WebElement dropdown_component_Momitor(WebDriver driver)
	 {
		 element = driver.findElement(By.linkText("Monitors (2)"));
		 
		return element;
		 
	 }
	 
	 public static WebElement subcategorySearch_test1(WebDriver driver)
	 {
		 element = driver.findElement(By.linkText("test 1 (0)"));
		return element;
		 
	 }

}
