package amazon.com.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//	Launch Page
		d.get("https://vinothqaacademy.com/");	
		// Action class initiate
		Actions act = new Actions(d);
		
		// Demo Site
		WebElement DemoSites = d.findElement(By.xpath("(//*[text()='Demo Sites'])[2]"));
		// Menu: Practice Automation
		WebElement PracticeAutomation = d.findElement(By.xpath("(//a[text()='Practice Automation'])[2]"));
		// Sub-Menu: Drop Down
		WebElement dropDownPage = d.findElement(By.xpath("(//a[text()='DropDown'])[2]"));

		// Perform the action to goto the DropDown page from Home page
		act.moveToElement(DemoSites).moveToElement(PracticeAutomation).moveToElement(dropDownPage).click().perform();

		// DropDown 1
		WebElement chooseCity1 = d.findElement(By.xpath("//span[@id='select2-simpleDropdown-container']"));	//("//*[text()='Choose A City:']"));
		chooseCity1.click();
						
		WebElement chooseCity = d.findElement(By.xpath("(//*[@class='select2-hidden-accessible'])[1]"));
		Select s = new Select(chooseCity);
		Thread.sleep(3000);
//		ArrayList<String> cities = new ArrayList<>();
//
//        // Add cities to the list
//        cities.add("Paris");
//        cities.add("Beijing");
//        cities.add("Mumbai");
//		
//		for(int i = 0; i<=cities.size(); i++) {
//			s.selectByVisibleText(cities.get(i));
//			chooseCity.click();
//			Thread.sleep(5000);
//			
//		}
		
		
		  
		// Type 1: selectByVisibleText
		s.selectByVisibleText("Paris");
		chooseCity.click();
		Thread.sleep(5000);
		
		// Type 2: selectByValue
		s.selectByValue("Beijing");
		chooseCity.click();
		Thread.sleep(5000);
		
		// Type 3: selectByIndex
		s.selectByIndex(11);
		chooseCity.click();
		Thread.sleep(5000);
		
		//		d.quit();

	}

}
