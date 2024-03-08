package waitStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Suraj {
	public static void main(String[] args)throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed Explecet statement worked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("implict wait worked");
		driver.findElement(By.linkText("Logout"));
		Thread.sleep(4000);
		System.out.println("thread sleep worked");
		driver.close();
		}
}
