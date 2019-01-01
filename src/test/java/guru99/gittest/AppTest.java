package guru99.gittest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AppTest {
	protected WebDriver driver;
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String eTitle = "bluefish";
		String aTitle = "";
		driver.get("https://www.bluefishdevops.com/");
		driver.manage().window().maximize();
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle)){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Passed");
		}
		System.out.println(driver.getTitle());
		//driver.quit();
		//close browser
		//jaziz test
		//more test
		//more tetsing
		driver.close();
	}
}
