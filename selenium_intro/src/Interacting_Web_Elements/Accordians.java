package Interacting_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Accordians {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/accordion.html");
	/*	driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(3)")).click();
		driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(3)")).click();
		driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(5)")).click();
		driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(5)")).click();*/
		
		for(int i=0;i<10;i++) {
			driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(1)")).click();
			driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(3)")).click();
			driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(5)")).click();
		}
	}

}
