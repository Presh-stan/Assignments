package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//Basic Checkbox
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[2])[1]")).click();
		
		//Notification
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
	
		//Tri State Checkbox
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-c ']/ancestor::div[@id='j_idt87:ajaxTriState'])/div[contains(@class,'ui-chkbox-box ui-widget ui-')]")).click();
		
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Verify if check box is disabled
		boolean enabled = driver.findElement(By.xpath("(//span[text()='Disabled']/preceding-sibling::div)[2]")).isEnabled();
		if(enabled == false)
			System.out.println("The check box is disabled " + enabled);
		else
			System.out.println("The check box is enabled " + enabled);
		
		//Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Barcelona'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	}

}
