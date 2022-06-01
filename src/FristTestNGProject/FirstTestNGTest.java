package FristTestNGProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.Test; 

public class FirstTestNGTest {





   public WebDriver driver; 
   @Test 
   public void homePage() 
   { 
 
      
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\corol\\Documents\\Web Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		 System.out.println("Launching edge browser");

     String URL = "https://www.google.com";


     driver.get(URL); 

     String getTitle = driver.getTitle(); 
     System.out.println("Title of home page: " +getTitle); 


     driver.close();
  } 
}