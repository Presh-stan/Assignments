package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Preshya");
		driver.findElement(By.name("lastname")).sendKeys("Stanley");
		driver.findElement(By.name("reg_email__")).sendKeys("8220584455");
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		WebElement day = driver.findElement(By.id("day"));
		Select select1=new Select(day);
		select1.selectByVisibleText("1");
		WebElement month = driver.findElement(By.id("month"));
		Select select2=new Select(month);
		select2.selectByVisibleText("Jan");
		WebElement year = driver.findElement(By.id("year"));
		Select select3=new Select(year);
		select3.selectByVisibleText("1990");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}

}
