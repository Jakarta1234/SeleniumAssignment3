package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxPageLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium webdriver\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.edureka.co/");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
