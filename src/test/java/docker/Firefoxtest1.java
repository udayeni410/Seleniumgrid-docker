package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Firefoxtest1 {

	
	
@Test
	
	public static void grid2() throws MalformedURLException{
		DesiredCapabilities dc=DesiredCapabilities.firefox();
				
				URL url=new URL("http://192.168.99.100:4545/wd/hub");
				
				RemoteWebDriver driver=new RemoteWebDriver(url,dc);
				driver.get("https://opensource-demo.orangehrmlive.com/");
				System.out.println("title of page"+driver.getTitle());
				driver.quit();
				
			}
}
