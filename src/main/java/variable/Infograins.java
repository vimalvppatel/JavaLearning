package variable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infograins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
        wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wb.get("https://www.infograinsdevelopment.com/infograins/");
        
        JavascriptExecutor js = (JavascriptExecutor)wb;
        js.executeScript("window.scrollBy(0,8500)");
        
        
        WebElement Name = wb.findElement(By.cssSelector("[name=\"name\"]"));
        Name.sendKeys("Vimal patel");
        
        WebElement mobile = wb.findElement(By.cssSelector("[name=\"phone\"]"));
        mobile.sendKeys("9977558866");
       
        WebElement email = wb.findElement(By.cssSelector("[name=\"email\"]"));
        email.sendKeys("vimalpatel@gmail.comm");
        
        WebElement subject = wb.findElement(By.cssSelector("[name=\"subject\"]"));
        subject.sendKeys("Vimalpatel");
        
        WebElement message = wb.findElement(By.cssSelector("[name=\"message\"]"));
        message.sendKeys("I am vimal patel");
        
        WebElement submit = wb.findElement(By.cssSelector("[class=\"form_submit_btn\"]"));
        submit.click();
        
        
	}

}
