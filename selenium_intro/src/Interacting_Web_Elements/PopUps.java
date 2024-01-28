package Interacting_Web_Elements;


import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class PopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\sugumaran.b\\Desktop\\workspace\\Driver_v1\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/popups.html");
		driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div > button")).click();
		String MainWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterate=handles.iterator();
		
		while(iterate.hasNext()) {
			String child=iterate.next();
			
			if(!MainWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.close();
			}
			
		}
		driver.switchTo().window(MainWindow);
		driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div > button")).click();
	}

}
