package amazon.com.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrubberMovementToHorizontal {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
//		d.get("https://vinothqaacademy.com/mouse-event/");
		d.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(d);		
		
//		Slider actions using X & Y values
		WebElement minBeforeValue = d.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		Point minLocation = minBeforeValue.getLocation();
		System.out.println("Minimum location before : "+minLocation); // (59, 250) +-1

		//	Here we can add +100 or anything in X-value, No change in Y-Value
		act.dragAndDropBy(minBeforeValue, 160, 250).perform();
		
		WebElement minAfterValue = d.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		Point minLocationAfter = minAfterValue.getLocation();
		System.out.println("------>Minimum location after move: "+minLocationAfter); // (59, 250) +-1
		
//		Slider actions using X & Y values
		WebElement maxBeforeValue = d.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		Point maxLocation = maxBeforeValue.getLocation();
		System.out.println("Maximum location before: "+maxLocation); // (609, 250) +-1

		//	Here we can subtract -100 or anything in X-value, No change in Y-Value
		act.dragAndDropBy(maxBeforeValue, -109, 250).perform();
		
		WebElement maxAfterValue = d.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		Point maxLocationAfter = maxAfterValue.getLocation();
		System.out.println("<------Maximum location after move: "+maxLocationAfter); // (, 250) +-1
		
		d.quit();
		
		System.out.println("\u001B[35m Test Completed...\u001B[0m");
		
	}

}
