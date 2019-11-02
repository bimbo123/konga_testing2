package first_testing_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Konga_tesing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the property of yor test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bademiposi\\Desktop\\AUTOMATION TOOLS\\Drivers\\new\\chromedriver.exe");
		
		//Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	// WebDriver browser = new FirefoxDriver();
	   	 
	   	 //to open the konga  registration page
	   	 browser.get("https://www.konga.com//");
	   	 	 
	   	browser.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());

	   //to click the login/signup button
		   browser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[3]/div/div[3]/div[2]/a")).click();
	  	      
      //to write email into email field
     browser.findElement(By.id("username")).sendKeys("fasanmadebabe@gmail.com");

     //to write password into the password field
     browser.findElement(By.id("password")).sendKeys("1Tanimola+++");
     
   //to click the login button
     browser.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/div/div/div[1]/form/div[3]/button")).click();
	      
     //to write items to seach for 
   	 browser.findElement(By.xpath("//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")).sendKeys("phones");
   	 
   //to click the seach button
   	 browser.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/div[2]/div/form/button")).click();
   	 
   	 
   	//to add to cart
  	 browser.findElement(By.xpath("//*[@id=\"mainContent\"]/section[2]/section/div[2]/div[1]/div/ul/li[1]/div/div/div[2]/form/div[4]/button")).click();
  	 
	 	}



	}


