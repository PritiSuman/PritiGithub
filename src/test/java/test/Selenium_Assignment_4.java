package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import actionClass.SignIn_Action;
import junit.framework.Assert;
import pageObject.Component_Page;
import pageObject.Home_Page;
import pageObject.Login_Page;
import pageObject.PhoneandPDA_Page;
import pageObject.Search_Page;
import utility.ExcelUtility;

public class Selenium_Assignment_4 {
	 private static WebDriver driver = null;
	
	public static void main(String args[]) throws IOException
	{
		ExcelUtility d = new ExcelUtility();
		ArrayList<String> data = d.getdata("Assignment_4");
	
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//call method from  home page
		
		Home_Page.lnk_MyAccount(driver).click();
		Home_Page.lnk_Register(driver).click();
		
		//call method from login page
		// get data from excel
		
		
		Login_Page.txt_EmailAddress(driver).sendKeys(data.get(2));
		Login_Page.txt_Password(driver).sendKeys(data.get(3));
		Login_Page.btn_Login(driver).click();
		
		
		//search for keyword phone
		//call method to search product
		
		String keyword = data.get(4);
		Login_Page.txt_search(driver).sendKeys(keyword);
		Login_Page.btn_Search(driver).click();
		
		
		//click on component to select dropdown value
		
		Component_Page.lnk_Component(driver).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",  Component_Page.dropdown_component_Momitor(driver));
		Component_Page.dropdown_component_Momitor(driver).click();
		
		//click on subcategory search
		
		Component_Page.subcategorySearch_test1(driver).click();
		
		
		//click on phonde and pda and sort with price as High > Low
		
		PhoneandPDA_Page.lnk_Component(driver).click();
		PhoneandPDA_Page.select_SortBy(driver).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",  PhoneandPDA_Page.valuefromdropdown_HighToLow(driver));
		PhoneandPDA_Page.valuefromdropdown_HighToLow(driver).click();
		
		//click on compare products
		
		PhoneandPDA_Page.btn_Comparefirst_product(driver).click();
		PhoneandPDA_Page.btn_Comapre_second_product(driver).click();
		PhoneandPDA_Page.btn_Compare_third_product(driver).click();
		
		//clcik on product comparision 
		
		for(int i=0; i<=2;i++){
			  try{
				  
				  PhoneandPDA_Page.lnk_ProductComparision(driver).click();
				  
			     break;
			  }
			  catch(Exception e){
			    
			  }
			}
		
		PhoneandPDA_Page.lnk_product_PalmTreoPro(driver).click();
		
		String value = PhoneandPDA_Page.description_PalmTreoPro(driver).getText();
		
		//Create File  
		  String TestFile = "src\\test\\java\\testData\\flat.txt";
		  File FC = new File(TestFile);//Created object of java File class.
		  FC.createNewFile();//Create file.
		  
		  //Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		  FileWriter FW = new FileWriter(TestFile);
		  BufferedWriter BW = new BufferedWriter(FW);
		  BW.write(value); //Writing In To File.
		 
		  
		  BW.close();
		
		
		
		
		
		
		
	}
	

}
