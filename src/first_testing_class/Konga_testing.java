package first_testing_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Konga_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the property of yor test
	   	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Bademiposi\\Desktop\\AUTOMATION TOOLS\\Drivers\\geko\\geckodriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new FirefoxDriver (); 
	   	 
	   	 //to search for items 
	   	 browser.get("https://www.konga.com/");
	   	 System.out.println("Successfully opened the website");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to write email into email field
	   	 browser.findElement(By.id("jsSearchInput")).sendKeys("search");
	   	 //jsSearchInput where did you get this id?
	   	 //konga site. it has to come from Konga.com
	   	 
	   	 //to write password into the password field
	   	 browser.findElement(By.id("pass")).sendKeys("__NEXT_DATA__");
	   	 
	   	 //to click the login button
	   	 //have not change the id here
	   	 browser.findElement(By.id("u_0_b")).click();
	   	 
	   	 //to close the browser
	   	 browser.close();
	   	 //show me here. you can
	   	 // the one the cusor at 
	}

}
