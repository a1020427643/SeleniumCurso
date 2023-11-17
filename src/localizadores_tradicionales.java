

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class localizadores_tradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\eespinosam\\Documents\\drivers\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
		driver_edge.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		driver_edge.quit();

	}

}
