package doc;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ert {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver; 
		for(int i=1;i<=5;i++)
		{ 
			System.out.println("Start...");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakes\\Downloads\\chromedriver_win32\\chromedriver.exe");			
			driver= new ChromeDriver();			
			driver.get("https://www.google.com/");	
			driver.close();
			
		}
		driver=null;
	}
}
