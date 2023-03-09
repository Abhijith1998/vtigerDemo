package profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppleTest {
	@Test(groups = "smoke")
	public void toLaunchApple() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.apple.com/");
	}
}
