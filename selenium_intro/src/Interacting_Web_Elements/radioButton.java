package Interacting_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div[1]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/div[2]/label")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/div[3]/label")).click();
		
	}

}
