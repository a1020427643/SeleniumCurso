
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Buscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\eespinosam\\Documents\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");
		
		
		

	}

}
