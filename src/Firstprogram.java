import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Neelam\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Neelam\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.makemytrip.com/flights/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
    	driver.quit();

	}

}
