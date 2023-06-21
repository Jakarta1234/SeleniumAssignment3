package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEPageLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\Selenium webdriver\\IE Driver\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.manage().window().maximize();

		driver.get("https://www.edureka.co/");

		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
