package first_testing_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {

	public static void main(String[] args) {
		 
	   	 //setting the property of yor test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bademiposi\\Desktop\\AUTOMATION TOOLS\\Drivers\\new\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //to open the faacebook login page
	   	 browser.get("https://www.facebook.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to write email into email field
	   	 browser.findElement(By.name("email")).sendKeys("fasanmadebabe@gmail.com");
	   	 
	   	 //to write password into the password field
	   	 browser.findElement(By.name("pass")).sendKeys("...TANIMOLA");
	   	 
	   	 //to click the login button
	   	 browser.findElement(By.id("u_0_b")).click();
	   	 
	   	 //to close the browser
	   	 browser.close();
	   

	}

}
