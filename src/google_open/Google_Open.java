package google_open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Google_Open {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	public static void main(String[] args) {
		
	
		
		        long startTime = System.currentTimeMillis();
		        System.setProperty("webdriver.edge.driver", "C:\\Users\\corol\\Documents\\Web Drivers\\edgedriver_win64\\msedgedriver.exe");
		        // Launch the FireFox browser.
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.get("http://www.google.com");
		        driver.quit();
		        long endTime   = System.currentTimeMillis();
		        long totalTime = endTime - startTime;
		        System.out.println(totalTime/1000.0+" seconds");
		    }
	}

	
