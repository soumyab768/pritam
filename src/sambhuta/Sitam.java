package sambhuta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sitam {
    public static void main(String args[]) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
        System.out.println("Application launched");
        Thread.sleep(3000);

        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        System.out.println("entering to the application");
        if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
        	System.out.println("Title matched");
        }
        else {
        	System.out.println("Title not match");
        	System.out.println(driver.getTitle());
        }

        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}