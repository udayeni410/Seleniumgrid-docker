package docker;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeTest {
	RemoteWebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		 DesiredCapabilities dc=DesiredCapabilities.chrome();
	        
	        
	        URL url=new URL("http://localhost:4545/wd/hub");
	        
	        driver=new RemoteWebDriver(url,dc);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	  }

 @Test
 public void f() {
	  System.out.println("title of page : "+driver.getTitle());
 }
 @Test
 public void f2() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  System.out.println(links.size());
	  
	  for (int i = 1; i<links.size(); i=i+1)
	  
	  {
	  
	  System.out.println(links.get(i).getText());
	  
	  }
 }
 @Test
 public void f3() {
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.id("aboutDisplayLink")).click();
	  String msg=driver.findElement(By.tagName("body")).getText();
	  System.out.println(msg);
	  
 }

 @AfterTest
 public void afterTest() {
	  driver.quit();
 }
}
