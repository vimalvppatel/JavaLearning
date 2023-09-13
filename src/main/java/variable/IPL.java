package variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   WebDriver wb = new ChromeDriver();
	   wb.manage().window().maximize();
	   wb.get("http://ldp.infosense.tech/");
	   
	 WebElement dropdown = wb.findElement(By.cssSelector("[name=\"Batting_Team\"]"));
	    Select s = new Select(dropdown);
	    s.selectByIndex(3);
//	   s.selectByVisibleText("Delhi Capitals");
	   
	 WebElement drop2 = wb.findElement(By.cssSelector("[name=\"Bowling_Team\"]"));
	    Select b = new Select(drop2);
	    b.selectByIndex(2);
	   
	 WebElement drop3 = wb.findElement(By.cssSelector("[name=\"City\"]"));
	    Select c = new Select(drop3);
	    c.selectByIndex(4);
	    
	  WebElement target = wb.findElement(By.cssSelector("[name=\"Target\"]"));
	  target.sendKeys("100");
	  
	  WebElement score = wb.findElement(By.cssSelector("[placeholder=\"Score\"]"));
	   
	   score.sendKeys("500");
	   
	  WebElement over = wb.findElement(By.cssSelector("[placeholder=\"Over Completed\"]"));
	    over.sendKeys("50");
	    
	  WebElement wicket = wb.findElement(By.cssSelector("[placeholder=\"Wickets Out\"]"));
	    wicket.sendKeys("12");
	    
	  WebElement submit = wb.findElement(By.cssSelector("[type=\"submit\"]"));
	  submit.click();
	}

}
