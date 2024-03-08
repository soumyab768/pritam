package addEmployee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Baba {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("logged in successfully completed");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Bharat");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Biswal");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		System.out.println("employee id created");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		}
		

		
		
		

}


