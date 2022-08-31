package selenium4Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//Switch to a newly created tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		//Switch to a newly created window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.in/");	
		
		driver.quit();
		
	}

}
