package amazon.com.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoClass {

	public static void main(String[] args) {
WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(60));
		d.get("https://testautomationpractice.blogspot.com/#");
		
		d.quit();

	}

}
