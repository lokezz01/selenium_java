package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk");
		driver.findElement(By.linkText("FILE UPLOAD")).click();
	}

}
