package week2day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml")
		;
		//Click and Confirm title.
		driver.findElement(By.xpath("(//div[@class='card']/button[@role='button'])[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		if(title.equals("Dashboard"))
			System.out.println("Confirm that the title is " + title);
		else
			System.out.println("Title is not confirmed");
		driver.navigate().back();
		
		//Confirm if the button is disabled.
		boolean b = driver.findElement(By.xpath("//div[@class='card']/button[@aria-disabled='true']")).isEnabled();
		if(b==false)
			System.out.println("Confirmed the button is disabled");
		else
			System.out.println("The button is enabled");
		
		//Find the position of the Submit button
		String attribute = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button")).getAttribute("class");
		if(attribute.contains("left"))
			System.out.println("The position of the button is left");
		Thread.sleep(3000);
		
		//Find the Save button color
		String value = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("color");
		System.out.println(" The colour of the button is " +value);
		
		//Find the height and width of this button
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize();
		System.out.println("The height of the button is " + size.height);
		System.out.println("The width of the button is " + size.width);
		
		//Mouse over and confirm the color changed
		WebElement element = driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']/following-sibling::button"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		String attribute2 =driver.findElement(By.xpath("(//span[text()='Success'])[1]")).getAttribute(
				"style"); 
		if(attribute2.contains("salmon"))
			System.out.println("Confirmed colour changed");
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//div[@class='grid formgrid']//button")).click();
		WebElement findElement = driver.findElement(By.xpath("(//h5[text()='How many rounded buttons are there?']/following-sibling::button)[1]"));
		driver.executeScript("$(arguments[0]).click();", findElement);
		
		//How many rounded buttons are there?
		List<WebElement> Elements = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button[contains(@class,'rounded-button')]"));
		System.out.println("The number of rounded buttons is " + Elements.size());

	}
	}
