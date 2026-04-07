package amazon.com.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
		d.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Single file Upload:
		d.findElement(By.id("filesToUpload")).sendKeys("/Users/cdmanik/Downloads/1.EditFailTestSuite_dashboard.html");
		
		d.navigate().refresh();
		
//		Multiple files Upload:
		String file1 = "/Users/cdmanik/Downloads/1.EditFailTestSuite_dashboard.html";
		String file2 = "/Users/cdmanik/Downloads/2.EditFailTestSuite_dashboard.html";
		String file3 = "/Users/cdmanik/Downloads/3.EditFailTestSuite_dashboard.html";
		
		d.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		
		d.quit();
	}

}
