package selenium4Training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;

public class PrintPageToPDF {

	public static void main(String[] args) throws IOException, InterruptedException {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		//ChromeDriver driver = new ChromeDriver(option);
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		//Pdf pdf = driver.print(new PrintOptions());
		Files.write(Paths.get("./internetHerokuapp.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		driver.quit();
		System.out.println("Completed");

	}


}
