package Interacting_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class checkBoex_isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"cb_red\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[2]/label[3]")).isSelected());
		

	}

}
