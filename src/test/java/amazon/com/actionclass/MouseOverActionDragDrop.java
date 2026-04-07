package amazon.com.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionDragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		
		d.get("https://vinothqaacademy.com/mouse-event/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Mouse Over Actions from 1 element to another element action
//		 Example 1: Type 1 with build().perform();
		WebElement overId = d.findElement(By.xpath("(//a[text()='Free Complete QA Video Courses'])[2]"));
		
		Actions act = new Actions(d);
		
		act.moveToElement(overId).build().perform();
		
		// or 		act.moveToElement(overId).perform();
				
		WebElement moveToId = d.findElement(By.xpath("(//a[text()='Cucumber BDD Framework'])[2]"));
		moveToId.click();
		
		Thread.sleep(3000);
		
//		Example 2: Type 2 
		WebElement DemoSites = d.findElement(By.xpath("(//a[text()='Demo Sites'])[2]"));
		// act.moveToElement(DemoSites).build().perform();
		
		WebElement PracticeAutomations = d.findElement(By.xpath("(//a[text()='Practice Automation'])[2]"));
		// act.moveToElement(PracticeAutomations).build().perform();
				
		WebElement MouseEvent = d.findElement(By.xpath("(//a[text()='Mouse Event'])[2]"));
		// MouseEvent.click();
		
		act.moveToElement(DemoSites).moveToElement(PracticeAutomations).moveToElement(MouseEvent).click().build().perform();
		
//		Drag and Drop - without build(). But with perform();
		WebElement dragID = d.findElement(By.className("draggable"));
		WebElement dropID = d.findElement(By.className("droppable"));
		
		act.dragAndDrop(dragID, dropID).perform();
		
		Thread.sleep(3000);
		
//		Double Click
		WebElement doubleClickID = d.findElement(By.id("dblclick"));
		act.doubleClick(doubleClickID).perform();
		
		Thread.sleep(3000);
		
//		Right Click / contextClick
		WebElement rightClickID = d.findElement(By.id("rightclick"));
		act.contextClick(rightClickID).perform();
		
		Thread.sleep(3000);
		
		WebElement newTextAppear = d.findElement(By.xpath("(//div[@id='myDiv']//a[text()='Registration Form'])[1]"));
		String textAfterRightClick = newTextAppear.getText();
		System.out.println(" Text after Right Click is : "+textAfterRightClick);
		
		Thread.sleep(3000);
		
//		d.quit();
		
		System.out.println("\u001B[35m Test Completed...\u001B[0m");

	}

}
