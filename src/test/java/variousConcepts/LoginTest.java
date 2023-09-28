package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negloginTest();
		tearDown();

	}

	public static void launchBrowser() {
		// set System Property
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\jansp\\Selenium\\crm\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// Create chrome object
		driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// max windows
		driver.manage().window().maximize();
		// goto website
		driver.get("https://techfios.com/billing/?ng=login");

	}

	public static void loginTest() throws InterruptedException {
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	public static void negloginTest() throws InterruptedException {
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com1");
		// insert password
		driver.findElement(By.id("password")).sendKeys("558566");
		// click sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	public static void tearDown() {

		// close browser
		driver.close();
	}

}
