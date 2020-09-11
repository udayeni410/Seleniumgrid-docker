package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxTest {

	RemoteWebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		 DesiredCapabilities dc=DesiredCapabilities.firefox();
	        
	        
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
	 String url= driver.getCurrentUrl();
	 System.out.println("Current page url is : "+url);
}
@Test
public void f3() throws InterruptedException{
	 driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).click();
	 String txt=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
	 if(txt=="Dashboard") {
		 System.out.println("Page exist");
	 }
	 else {
		 System.out.println("page not exist");
	 }
	 
}
 @AfterTest
 public void afterTest(){
	  driver.quit();
 }
}
