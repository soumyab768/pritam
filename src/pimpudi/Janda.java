package pimpudi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Janda {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "naresh";
	static String title1 = "OrangeHRM - New Lvavel of HR Management";
	static String title2 = "OrangeHRM";
	
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("application lunched");
		if(driver.getTitle().equals("title1")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title doesnot match");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login complete");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		System.out.println("mouse over complete");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
		}
}
