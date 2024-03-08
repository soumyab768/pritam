package fileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Photo {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(3000);
		System.out.println("logged in completed");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		System.out.println("clicked on add button");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("pravu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Mohanty");
		WebElement fileinput = driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
		fileinput.sendKeys("C:\\Users\\soumy\\Downloads\\lowResolution.jpg");
		//file uploaded successfully
		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		Thread.sleep(4000);
		System.out.println("file uploaded and saved the emp. id successfully");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		driver.close();
		}

}