package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class findElementByName {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "C:\\\\Users\\\\sugumaran.b\\\\Desktop\\\\workspace\\\\Driver_v1\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/contactForm.html");
		driver.findElement(By.name("first_name")).sendKeys("I am Batman");
		driver.findElement(By.name("last_name")).sendKeys("Johnny Dep");
		driver.findElement(By.name("email")).sendKeys("johnnydep21@gmail.com");
		driver.findElement(By.name("message")).sendKeys("Thanks for your feedback");

	}

}
