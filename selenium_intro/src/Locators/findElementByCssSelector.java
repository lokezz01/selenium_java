package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findElementByCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/buttons.html");
		//driver.findElement(By.cssSelector("#btn_one")).click();
		driver.findElement(By.cssSelector("button#btn_one")).click();
	}
}
