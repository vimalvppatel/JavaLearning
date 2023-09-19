package variable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgricultureCrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("headless");
		WebDriver wb = new ChromeDriver();
	    wb.manage().window().maximize();
        wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wb.get("http://ars.infosense.tech/");
        
        
    
        
        WebElement Nitrogen = wb.findElement(By.cssSelector("[id=\"Nitrogen\"]"));
        Nitrogen.sendKeys(test.getData("Nitrogen"));

		WebElement Phosphorus = wb.findElement(By.cssSelector("[id=\"Phosporus\"]"));
	    Phosphorus.sendKeys(test.getData("Phosphorus"));
		
		WebElement Potassium = wb.findElement(By.cssSelector("[id=\"Potassium\"]"));
		Potassium.sendKeys(test.getData("Potassium"));
		
		WebElement Temperature = wb.findElement(By.cssSelector("[id=\"Temperature\"]"));
		Temperature.sendKeys(test.getData("Temperature"));
		
		WebElement PH = wb.findElement(By.cssSelector("[id=\"Ph\"]"));
		PH.sendKeys(test.getData("PH"));
		
		WebElement Rainfall = wb.findElement(By.cssSelector("[id=\"Rainfall\"]"));
		Rainfall.sendKeys(test.getData("Rainfall"));
		
		WebElement Humidity = wb.findElement(By.cssSelector("[id=\"Humidity\"]"));
		Humidity.sendKeys(test.getData("Humidity"));

		WebElement Submit = wb.findElement(By.cssSelector("[type=\"submit\"]"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Submit.click();
		
		
		System.out.println(wb.findElement(By.xpath("(//div//h1//b)[2]")).getText());
		;
	}

}
