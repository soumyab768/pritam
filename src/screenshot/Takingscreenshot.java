package screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Takingscreenshot {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("login completed");
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			Thread.sleep(4000);
			System.out.println("mouseover complete");
			driver.findElement(By.linkText("Add Employee123")).click();
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			System.out.println("login completed");
			
		}catch(Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("C:\\Users\\soumy\\Screenshot\\xyz.png"));
			
		}
		driver.close();
	}
}