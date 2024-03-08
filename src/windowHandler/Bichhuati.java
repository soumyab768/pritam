package windowHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class Bichhuati {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/soumy/OneDrive/Documents/soumyaSarkar.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn3")).click();
		ArrayList<String>windinfo=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(0));
		Thread.sleep(3000);
		driver.close();
	}

}