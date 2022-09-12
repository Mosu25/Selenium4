package selenium4Training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoGetScreenshotAs {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File sh = driver.findElement(By.id("home")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/button.png");
		FileHandler.copy(sh, dest);
		
		
		File sh1 = driver.findElement(By.className("fontawesome-i2svg-complete")).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/page.png");
		FileHandler.copy(sh1, dest1);
		
		File sh2 = driver.findElement(By.className("is-4-tablet")).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./snaps/section.png");
		FileHandler.copy(sh2, dest2);
				
		driver.quit();
	}

}
