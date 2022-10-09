package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriverManager.edgedriver().setup(); EdgeDriver driver =new EdgeDriver();
		 */
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
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
