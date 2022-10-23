package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Which is your favorite UI Automation tool?
		WebElement findElement = driver.findElement(By.className("ui-selectonemenu"));
		Select s1=new Select(findElement);
		s1.selectByVisibleText("Selenium");
		
		//Choose your preferred country.
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']/preceding::li[text()='Germany']")).click();
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		System.out.println("Confirmed the cities belonging to the country are loaded");
		driver.findElement(By.xpath("//li[text()='Frankfurt']")).click();
		
		//Choose the Course
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		//Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[text()='Select Values']/following::li)[1]")).click();
		
		
	}

}
