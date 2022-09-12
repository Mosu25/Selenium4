package selenium4Training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//driver.switchTo().frame(1); //index based //one of the overloading concept in selenium is framefirstFrs
		//driver.switchTo().frame("firstFr"); //name and id based
		WebElement mf = driver.findElement(By.xpath("//iframe[@src=\"frameUI\"]")); // webelement based
		driver.switchTo().frame(mf);
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Mosu");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("mosu@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("M");
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("M");

		driver.quit();
	}

}
