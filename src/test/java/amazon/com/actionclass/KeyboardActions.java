package amazon.com.actionclass;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
		
	d.get("https://text-compare.com/");
//	d.get("https://vinothqaacademy.com/demo-site/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	Actions act = new Actions(d);

	//	 Send the values to text field
	d.findElement(By.xpath("//*[@name='vfb-5']")).sendKeys("Keyboard Actions test practice");

	//	Select all the values by Ctrl+A
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

	//	Copy selected all the content by Ctrl+C
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	
	//	Switch the next tab by using TAB
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	// Paste the copied content to the new area
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
//	d.quit();
	
	System.out.println("\u001B[35m Test Completed...\u001B[0m");
	}

}
