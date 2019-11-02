package first_testing_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_task {

	public static void main(String[] args) {
		 
	   	 //setting the property of yor test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bademiposi\\Desktop\\AUTOMATION TOOLS\\Drivers\\new\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //Searh for details on google 
	   	 browser.get("https://www.google.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to search for my full details 
	   	 browser.findElement(By.id("email or phone ")).sendKeys("fasanmadebabe@gmail.com or 08062435830");
	   	 
	   	 //to enter password
	   	 browser.findElement(By.name("pass")).sendKeys("...TANIMOLA");
	   	 
	   	 //to click the login button
	   	 browser.findElement(By.id("Njthtb")).click();
	   	 
	   	 //to close the browser
	   	 browser.close();
	   
	}

}
