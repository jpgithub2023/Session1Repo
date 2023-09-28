package variousConcepts;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {

	
			
		 WebDriver driver;
		 @BeforeClass
		 public static void beforeMethod() {
			 System.out.println("Before  Method");
			 
		 }
		 @AfterClass
		 public static void afterMethod() {
			 System.out.println("After Method");
			 
		 }
		
		 @Before
		public void launchBrowser() {
			 System.out.println("Before");
			// set System Property
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\jansp\\Selenium\\crm\\driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			// Create chrome object
			driver = new ChromeDriver();
			// delete cookies
			driver.manage().deleteAllCookies();
			// max windows
			driver.manage().window().maximize();
			// goto website
			driver.get("https://techfios.com/billing/?ng=login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		@Test
		public void loginTest() throws InterruptedException {
			System.out.println("Test1");
			// insert username
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			// insert password
			driver.findElement(By.id("password")).sendKeys("abc123");
			// click sign in button
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
		}
		//@Test
		public void negloginTest() throws InterruptedException {
			System.out.println("Test2");
			// insert username
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com1");
			// insert password
			driver.findElement(By.id("password")).sendKeys("558566");
			// click sign in button
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
		}

	//	@Test
		public void negloginTest1() throws InterruptedException {
			System.out.println("Test2");
			// insert username
			driver.findElement(By.id("username1")).sendKeys("demo@techfios.com1");
			// insert password
			driver.findElement(By.id("password")).sendKeys("558566");
			// click sign in button
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
		}
		@After
		public void tearDown() {
			System.out.println("After");
			// close browser
			driver.close();
		}
	
}

