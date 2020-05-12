package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.Home_Page;
import pageObject.Login_Page;
import utility.ExcelUtility;

public class Selenium_Assignment1_ {

    private static WebDriver driver = null;

	public static void main(String args[]) throws IOException
	{
		ExcelUtility d = new ExcelUtility();
		ArrayList<String> data = d.getdata("Assignment1_Login");
		
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
		Login_Page.lnk_Logout(driver).click();
		
		driver.close();
		
		
		
		
	}

}
