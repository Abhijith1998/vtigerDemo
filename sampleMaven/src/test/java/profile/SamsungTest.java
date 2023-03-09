package profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamsungTest {
	@Test(groups = "functionality")
	public void toLaunchSamsung() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.samsung.com/");
	}
}
