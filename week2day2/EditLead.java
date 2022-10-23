package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Preshya");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.linkText("10305")).click();

		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("CRM"))
			System.out.println("The title is verified ");
		else
			System.out.println("The title is wrong");

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement companyName = driver.findElement(By.id("viewLead_companyName_sp"));
		if(companyName.getText().contains("Infosys"))
			System.out.println("Confirmed that the changed name appears");
		else
			System.out.println("Changed name does not appear"); driver.close();
		driver.close();

	}

}
