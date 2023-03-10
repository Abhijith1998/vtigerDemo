package profilePractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PolarBearTest {
	@Test
	public void eatRibbons() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://polarbear.co.in/");
	}
}
