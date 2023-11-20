package assignment.november;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdown = driver.findElement(By.id("REGISTERED_BY"));
		
		Select dd = new Select(dropdown);
		
		dd.selectByIndex(1);
		
		driver.findElement(By.id("NAME")).sendKeys("Salman");
		
		driver.findElement(By.xpath("(//input[@class='hp-gender'])[2]")).click();
		
		driver.findElement(By.id("DOBDAY")).sendKeys("30");
		
		driver.findElement(By.id("DOBMONTH")).sendKeys("Aug");
		
		driver.findElement(By.id("DOBYEAR")).sendKeys("1999");
		
		WebElement religion = driver.findElement(By.id("RELIGION"));
		
		Select r1 = new Select(religion);
		
		r1.selectByIndex(1);
		
		WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
		
		Select m1 = new Select(motherTongue);
		
		m1.selectByValue("47");
		
		WebElement country = driver.findElement(By.id("COUNTRY"));
		
		Select c1 = new Select(country);
		
		c1.selectByIndex(1);
		
		driver.findElement(By.id("MOBILENO")).sendKeys("8825958171");
		
		driver.findElement(By.id("EMAIL")).sendKeys("abc@gmail.com");
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
