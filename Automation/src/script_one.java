

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_one {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("search-inp"));
		search.sendKeys("Selenium");
		
		WebElement click = driver.findElement(By.id("search-button-top"));
		click.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.xpath("/html/body/div[2]/div[7]/section[3]/a"));
		course.click();
	}

}
