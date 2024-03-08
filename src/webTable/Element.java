package webTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
	public static void main(String args[])throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/soumy/OneDrive/Documents/windHandlerTable.html");
		int row=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr"))
		
	}
}