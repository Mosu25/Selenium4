package selenium4Training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		//		WebDriver driver = new ChromeDriver();
		//		driver.get("https://jqueryui.com/droppable/");
		//		driver.manage().window().maximize();
		//		driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		//		driver.switchTo().frame(0);
		//		Thread.sleep(5000);
		//		WebElement Sele=driver.findElement(By.id("draggable"));
		//		WebElement dele=driver.findElement(By.id("droppable"));
		//		Actions builder = new Actions(driver);
		//		builder.dragAndDrop(Sele, dele).perform();
		//		Thread.sleep(5000);
		//		driver.quit();

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		WebElement src=driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		int x = src.getLocation().getX();
		int y = src.getLocation().getY();
		builder.dragAndDropBy(src, x+55, y+95).perform();
		Thread.sleep(4000);
		driver.quit();

	}

}
