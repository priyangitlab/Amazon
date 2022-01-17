package doc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void f() {

		WebDriver driver;
		System.out.println("Start...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakes\\Downloads\\chromedriver_win32\\chromedriver.exe");			
		driver= new ChromeDriver();			
		driver.get("https://www.google.com/");	
		driver.close();
		System.out.println("End...");
		driver=null;
		

	}
}
