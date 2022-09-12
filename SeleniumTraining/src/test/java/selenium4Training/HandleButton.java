package selenium4Training;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");

		// driver.findElement(By.id("position")).getLocation();
		//Get the X and Y co-ordinates		
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("X= "+x +" Y= "+y);

		//Find the color of the button
		WebElement btncolor = driver.findElement(By.id("color"));
		String color = btncolor.getCssValue("background-color");
		System.out.println(color);


		//Find the height and Width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getPoint());

		Dimension sz = driver.findElement(By.id("property")).getSize();
		System.out.println(sz.getHeight());
		System.out.println(sz.getWidth());

		Dimension dime = rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getHeight());
		System.out.println(dime.getWidth());

		//Confirm button is disabled
		boolean isDisabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isDisabled);

		driver.quit();

	}

}
