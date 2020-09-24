package docker;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ChromeTest {
	RemoteWebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		 ChromeOptions cop=new ChromeOptions();
		
	        
		 System.setProperty("java.net.preferIPv4Stack" , "true");
	        URL url=new URL("http://host.docker.internal:4445/wd/hub");
	        driver=new RemoteWebDriver(url,cop);
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
	        driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	  }

 @Test
 public void f() {
	  System.out.println("title of page : "+driver.getTitle());
 }
 @Test
 public void f2() {
     driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
        driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
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
     String txt="Welcome Admin";
     String txt1=driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
     AssertJUnit.assertEquals(txt, txt1);
         
     
 }

 @AfterTest
 public void afterTest() {
     driver.quit();
 }
}
