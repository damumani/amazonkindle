package amazon.com.kindle;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
//import org.graalvm.compiler.core.common.calc.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KindleWeb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(60));

		// Login Page
		d.get("https://read.amazon.in/landing");
		
		@Nullable
		String titleStart = d.getTitle();
		System.out.println(titleStart);
		
		d.findElement(By.xpath("//*[@id='top-sign-in-btn']")).click();
		
//		d.findElement(By.id("ap_email")).sendKeys("cdmanik+test@amazon.com", Keys.ENTER);
		WebElement userName = d.findElement(By.id("ap_email"));
		userName.sendKeys("cdmanik+test@amazon.com", Keys.ENTER);
		
//		d.findElement(By.id("ap_password")).sendKeys("qwerty", Keys.ENTER);
		WebElement password = d.findElement(By.id("ap_password"));
		password.sendKeys("qwerty", Keys.ENTER);
		
/*
		// Open Book
		d.findElement(By.id("cover-B0CLPYHXP8")).click();
		Thread.sleep(15000);
		
		WebElement kindleLibrary = d.findElement(By.xpath("//ion-button[@title='Kindle Library']"));
//		WebElement kindleLibrary = d.findElement(By.className("//*[@class='library-back-button-icon ios']"));
		
		wait.until(ExpectedConditions.visibilityOf(kindleLibrary));
		System.out.println("Kindle Library Button visible");
		
		// Open Annotation Notebook Page & Close
		WebElement AnPage = d.findElement(By.xpath("//*[@item-i-d='top_menu_notebook']"));
		wait.until(ExpectedConditions.visibilityOf(AnPage));
		System.out.println("Annotation Notebook Button visible");
		AnPage.click();
		
		WebElement AnClose = d.findElement(By.xpath("//*[@item-i-d='notebook-panel-close']"));
		wait.until(ExpectedConditions.visibilityOf(AnClose));
		System.out.println("Annotation Notebook Close Button visible");
		
		AnClose.click();
		
		// Close Book
		wait.until(ExpectedConditions.visibilityOf(kindleLibrary));
		System.out.println("Kindle Library Button visible");
		
	
		kindleLibrary.click();
		*/
		
		
		// Logout Page
		
		d.findElement(By.id("settings_button")).click();
		
		d.findElement(By.id("settings-link-logout")).click();
		
		@Nullable
		String titleEnd = d.getTitle();
		System.out.println(titleEnd);
		d.quit();
		
		if(titleStart == titleEnd) {
			System.out.println("Account Logout Successfully");
			throw new Error("Account Not Logout");
		}else {
			throw new Error("Account Not Logout");
			
		}
		
//		System.out.println("--- Completed ---");
	}

}
