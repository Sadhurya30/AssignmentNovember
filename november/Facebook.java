package assignment.november;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sathyabama");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sathyabama");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("arunachalam");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8825958174");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Sath@123");
		
		driver.findElement(By.name("birthday_day")).sendKeys("15");
		
		driver.findElement(By.name("birthday_month")).sendKeys("Jul");
		
		driver.findElement(By.id("year")).sendKeys("2001");
		
		driver.findElement(By.className("_8esa")).click();
		
		driver.close();
		
		
		

	}

}
