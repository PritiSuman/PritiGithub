package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhoneandPDA_Page {
	
	private static WebElement element = null;
	 
	 public static WebElement lnk_Component(WebDriver driver) {
		 element = driver.findElement(By.linkText("Phones & PDAs"));
		 return element;
	 }
	 
	 public static WebElement select_SortBy(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//*[@class='form-control']"));
				 
		return element;
		 
	 }
	 
	 public static WebElement valuefromdropdown_HighToLow(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//*[@class='form-control']/option[contains(text(), 'High > Low')]"));
		 
			return element;
	 }
	
	 public static WebElement btn_Comparefirst_product(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//h4//a[contains(text(),'Palm Treo Pro')]/parent::h4/parent::div/following-sibling::div/descendant::button[3]"));
		return element;
		
	 }
	 
	 public static WebElement btn_Comapre_second_product(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//h4//a[contains(text(),'iPhone')]/parent::h4/parent::div/following-sibling::div/descendant::button[3]"));
		return element;
		
	 }
	 
	 public static WebElement btn_Compare_third_product(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//h4//a[contains(text(),'HTC Touch HD')]/parent::h4/parent::div/following-sibling::div/descendant::button[3]"));
		return element;
		
	 }
	 
	 public static WebElement lnk_ProductComparision(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//*[contains(@class, 'alert alert-success alert-dismiss')]/descendant::a[contains(text(), 'product comparison')]"));
		
		return element;
		 
	 }
	 
	 public static WebElement lnk_product_PalmTreoPro(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//*[contains(text(), 'Palm Treo Pro')]"));
			
			return element;
	 }
	 
	 public static WebElement description_PalmTreoPro(WebDriver driver)
	 {
		 element = driver.findElement(By.xpath("//div[contains(@class, 'tab-pane active')]//li[contains(text(), 'Tri-band UMTS')]"));
			
			return element;
		
	 }

}

