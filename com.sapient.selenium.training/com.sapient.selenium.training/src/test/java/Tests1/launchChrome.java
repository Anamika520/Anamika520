/** package Tests1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class launchChrome{
	@Test
	public void launchChromeBrowser() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.quit();
	}
	
} **/