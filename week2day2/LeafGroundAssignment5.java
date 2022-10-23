package week2day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
	
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		String href = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
		System.out.println("The link is :" + href);
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Broken?")).click();
		String pageSource = driver.getPageSource();
		if(pageSource.contains("404"))
		{
			System.out.println("The link is broken");
		}
		else
			System.out.println("The link is not broken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//a[text()='Go to Dashboard']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("How many links in this page?")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links in this page is " + links.size());
	      driver.navigate().back();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("How many links in this layout?")).click();
	      List<WebElement> links1 = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links in this page is " + links1.size());
	      driver.navigate().back();
	      Thread.sleep(2000);
	
	}

}
