package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePageLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.edureka.co/");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
