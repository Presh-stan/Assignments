package week4day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The size of the windows is " + windowHandles.size() );
		List<String> str=new ArrayList<String>(windowHandles);
		driver.switchTo().window(str.get(3));
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		for(int i=0;i<str.size()-1;i++)
			{driver.switchTo().window(str.get(i));
			driver.close();
			}

	}

}
