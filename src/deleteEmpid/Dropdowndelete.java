package deleteEmpid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdowndelete {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login completed");
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByIndex(1);
		Thread.sleep(4000);
		driver.findElement(By.name("loc_name")).sendKeys("3330");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("logout completed");
		driver.close();		
	}
}
