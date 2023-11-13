
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class metodos_basicos_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\eespinosam\\Documents\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		
		
		//metodo 1:  get  trae la pagina requrrida 
		driver_chrome.get("https://www.google.com");
		
		
		//metodo 2:  gettitle()  trae el titulo de la pagina actual  
		System.out.println(driver_chrome.getTitle());
		
		//metodo 3:  getcurrenturl()  trae la url de la pagina actual  
		System.out.println(driver_chrome.getCurrentUrl());
		
		//metodo 3:  close()  cierrala pagina actual  
		driver_chrome.close();
				
		//metodo 3:  quit()  termina la sesion del driver 
		driver_chrome.quit();
		
	}

}
