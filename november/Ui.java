package assignment.november;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//small[text()='Register For Account']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Sadhurya");
		
		WebElement a =driver.findElement(By.id("title"));
		
		Select a1 = new Select(a);
		
		a1.selectByIndex(1);
		
		driver.findElement(By.id("middleName")).sendKeys("P");
		
		driver.findElement(By.id("lastName")).sendKeys("Palanivelan");
		
		WebElement b = driver.findElement(By.id("sex"));
		
	    Select b1 = new Select(b);
	    
	    b1.selectByIndex(2);
	    
	    WebElement c = driver.findElement(By.id("employmentStatus"));
	    
	    Select c1 = new Select(c);
	    
	    c1.selectByIndex(1);
	    
	    driver.findElement(By.id("username")).sendKeys("sadhurya");
	    
	    WebElement m =driver.findElement(By.id("maritalStatus"));
	    Select m1 = new Select(m);
	    m1.selectByIndex(1);
		
	    
	    driver.close();
		
		
		
	}

}
