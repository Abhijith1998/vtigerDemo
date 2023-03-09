package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	//this class won't be considered for pom.xml batch execution as it is not suffixed with Test
	//but if we run it individually it will run
	
	@Test(groups = "smoke")
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
	}
}
