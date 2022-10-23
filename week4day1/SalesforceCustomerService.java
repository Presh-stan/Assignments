package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustomerService {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		/*
		 * ChromeOptions options =new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 */
		driver.findElement(By.xpath("//span[contains(text(),': Mobile Publisher')]/preceding-sibling::span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Size  : " +windowHandles.size() );
		List<String> windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(2));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		Thread.sleep(2000);
		for(int i =0;i<windows1.size();i++)
		{driver.switchTo().window(windows1.get(i));
		driver.close();
		}
		
		
	}

}
