package selenium4Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();

		driver.get("https://letcode.in/alert");
		// Alert type 1.Simple 2.Confirm 3. Prompt
		// Simple Alert
		driver.findElement(By.xpath("//button[@id=\"accept\"]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//		alert.dismiss();

		//Prompt Alert
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert();	
		alert.sendKeys("Mosu");
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.id("myName")).getText());

		//  methods can be performed in the alert
		//		1. accept 2. dismiss 3. getText 4. sendKeys
		//	exeptions:
		//		1. UnhandledAlertException
		//		2. NoAlertPresentException

		driver.quit();

	}

}
