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
		
//		Actions a = new Actions(d);
//		//Demo site hover 
//		a.moveToElement(d.findElement(By.className("menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-6372"))).build().perform();
		
		WebElement menu = d.findElement(By.className("menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-6372"));

			Actions a = new Actions(d);
			a.moveToElement(menu).perform();
		
		
	}

}
