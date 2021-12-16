package utilities.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebDriverManager {
private WebDriver driver;
public WebDriver WebDriverlaunchBrowser(String browserName) {
	if (browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome")) { 
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browserName.equalsIgnoreCase("ff")) {
		System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	else {
		Assert.fail("Fail| invalid browser name passed. Valid values are edge, chrome or ff");
}
	return driver;
}
}
