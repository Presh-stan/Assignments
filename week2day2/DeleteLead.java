package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {


		//Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preshya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Stanley");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Presh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.name("description")).sendKeys("This is Software dept");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("spreshya@gmail.com");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("8220584455");
		driver.findElement(By.className("smallSubmit")).click();	
		driver.findElement(By.linkText("Find Leads")).click(); //click using
		//Click on Phone
		WebElement phone =driver.findElement(By.xpath("//span[text()='Phone']"));
		driver.executeScript("arguments[0].click()", phone);
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(
				"8220584455");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		WebElement findElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = findElement.getText();
		
		System.out.println(text);
		Thread.sleep(5000);

		//Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		//Click Delete
		driver.findElement(By.linkText("Delete")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter captured lead ID
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(text);
		//Click find leads button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String result =driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(result);
		if(result.contains("No records to display")) {
			System.out.println("Confirms the successful deletion");
		}
		else
			System.out.println("Not deleted");
		//Close the browser
		Thread.sleep(3000);
		driver.close();


	}

}
