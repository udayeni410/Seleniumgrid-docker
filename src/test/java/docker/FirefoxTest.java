package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

	@Test
public static void grid2() throws MalformedURLException, InterruptedException{
		DesiredCapabilities dc=DesiredCapabilities.firefox();
				
		URL url=new URL("http://localhost:4545/wd/hub");
				
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		System.out.println("title of page"+driver.getTitle());
		driver.quit();
				
			}
}
