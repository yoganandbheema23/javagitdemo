package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoIntegration {
	
	@Test
	public void TestMethod()
	{
		
		System.setProperty("webdriver.chrome.driver", "./mydrivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userId=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		userId.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		
		WebElement btnLogin=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btnLogin.click();
	}
}







