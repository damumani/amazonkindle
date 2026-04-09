package amazon.com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegistrationForm {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver(); // Driver-Chrome
		
		d.get("https://vinothqaacademy.com/"); //Home Page Url
		d.manage().window().maximize(); //Max_window
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait
		
		//Home button locater 
		String Home_button = d.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Home']")).getText();
		System.out.println(Home_button);	
		
//		//Demo site hover 
		// Action class initiate
				Actions a = new Actions(d);
				
		// Demo Site
		WebElement DemoSites = d.findElement(By.xpath("(//*[text()='Demo Sites'])[2]"));
		// Menu: Practice Automation
		WebElement PracticeAutomation = d.findElement(By.xpath("(//a[text()='Practice Automation'])[2]"));
		
		// Perform the action from Home page
		a.moveToElement(DemoSites).click().perform(); //DemoSite
		a.moveToElement(PracticeAutomation).click().perform();	//	PracticeAutomation
		
	}

}
