package variable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgricultureCrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
	    wb.manage().window().maximize();
        wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wb.get("http://ars.infosense.tech/");
        
        WebElement Nitrogen = wb.findElement(By.cssSelector("[id=\"Nitrogen\"]"));
        Nitrogen.sendKeys("10");

		WebElement Phosphorus = wb.findElement(By.cssSelector("[id=\"Phosporus\"]"));
	    Phosphorus.sendKeys("10");
		
		WebElement Potassium = wb.findElement(By.cssSelector("[id=\"Potassium\"]"));
		Potassium.sendKeys("20");
		
		WebElement Temperature = wb.findElement(By.cssSelector("[id=\"Temperature\"]"));
		Temperature.sendKeys("10");
		
		WebElement PH = wb.findElement(By.cssSelector("[id=\"Ph\"]"));
		PH.sendKeys("15");
		
		WebElement Rainfall = wb.findElement(By.cssSelector("[id=\"Rainfall\"]"));
		Rainfall.sendKeys("9");
		
		WebElement Humidity = wb.findElement(By.cssSelector("[id=\"Humidity\"]"));
		Humidity.sendKeys("29");

		WebElement Submit = wb.findElement(By.cssSelector("[type=\"submit\"]"));
		Submit.click();
		
	}

}
