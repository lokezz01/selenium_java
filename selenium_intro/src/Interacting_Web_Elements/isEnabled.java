package Interacting_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk");
		driver.findElement(By.linkText("BUTTONS")).click();
		System.out.println(driver.findElement(By.id("btn_three")).isEnabled());
		System.out.println(driver.findElement(By.id("btn_four")).isEnabled());

	}

}