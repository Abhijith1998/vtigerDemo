package profilePractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaskinRobbinsTest {
	@Test
	public void eatBaskinRobbins() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.baskinrobbins.com/");
	}
}
