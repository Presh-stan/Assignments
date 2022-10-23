package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		
		//Type your name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Preshya Stanley");
		
		//Append Country to this City.
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("India");
		
		//Verify if text box is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		if(enabled ==false)
			System.out.println("Verified that the textbox is disabled");
		else
			System.out.println("The text box is enabled");
		
		//Clear the typed text.
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		
		//Retrieve the typed text.
		WebElement value = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']"));
		String retrivedText = value.getAttribute("value");
		System.out.println("The retrived text is " + retrivedText);
		
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("spreshya@gmail.com",Keys.TAB);
		
		//Type about yourself
		driver.findElement(By.xpath("//textarea")).sendKeys("I am Preshya,I currently live in Bangalore");
		
		//Text Editor
		WebElement element = driver.findElement(By.xpath("(//span[@class='ql-formats']//span[@class='ql-picker-label'])[1]"));
		element.click();
		driver.findElement(By.xpath("//span[@data-value='serif']/following::span[@data-value='monospace']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='ql-formats']//span[@class='ql-picker-label'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='ql-header' and @value='1']")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor']")).sendKeys("Hello");
		
		//Just Press Enter and confirm error message*
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println("Error message confirmed");
		
		//Click and Confirm Label Position Changes
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		System.out.println("Label position changes");
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Preshya");
		//driver.findElement(By.xpath("//li[text()='2']")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("08/07/1991");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Show Calendar']")).click();
	    
		//Type number and spin to confirm value changed
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt118_input']")).sendKeys("8");
	    
		//Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath("//input[@name='j_idt106:slider']")).sendKeys("56");
	    
		//Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
	    
	    //Custom Toolbar
	}

}
