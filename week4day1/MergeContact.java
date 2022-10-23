package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//2.Enter UserName and Password Using Id Locator
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(3000);
		
		
		//8. Click on First Resulting Contact
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("No. of windows " + windowHandles.size());
		List<String> windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(2));
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		driver.findElement(By.linkText("10487")).click();
		Thread.sleep(5000);
		
		
		//9. Click on Widget of To Contact
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(3000);
		
		
		// 10. Click on Second Resulting Contact
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> windows3=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(windows3.get(2));
		//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		driver.findElement(By.linkText("10490")).click();
		Thread.sleep(3000);
		
		
		//11. Click on Merge button using Xpath Locator
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(windows2.get(1));
		
		driver.findElement(By.linkText("Merge")).click();
		
		//12. Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//13. Verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Contact"))
		{
			System.out.println("Title of the page verified");
		}
		else
			System.out.println("The title of the page is not verified");
	}

}
