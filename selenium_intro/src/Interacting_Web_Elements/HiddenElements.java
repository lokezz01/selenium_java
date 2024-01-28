package Interacting_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/hiddenElements.html");
		System.out.println(driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div > p:nth-child(3)")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div > p:nth-child(4)")).isDisplayed());
		
		
	}

}
