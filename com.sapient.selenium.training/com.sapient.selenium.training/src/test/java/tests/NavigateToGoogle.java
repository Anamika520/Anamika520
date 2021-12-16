package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogle {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.WebDriverlaunchBrowser("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogleTest(){
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		System.out.println(innerText);
		String attribClass = oelem.getAttribute("class");
		System.out.println(attribClass);
		
		List<WebElement> oList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		for(WebElement oElem: oList){
			String innertext = oElem.getText();
			System.out.println(innertext);
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}


}
