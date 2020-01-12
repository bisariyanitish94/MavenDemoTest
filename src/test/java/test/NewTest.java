package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {
	@Test
	
	public void launchBrowser () throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kusum\\Downloads\\Salenium\\chromedriver_win32\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	System.out.println("Hello");
	
	Thread.sleep(5000);
	
	driver.quit();
}
}

