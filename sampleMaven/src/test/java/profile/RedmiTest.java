package profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiTest {
	@Test(groups = "smoke")
	public void toLaunchRedmi() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.mi.com/in/");
	}
}
