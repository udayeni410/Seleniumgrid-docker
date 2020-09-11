package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	public static void grid1() throws MalformedURLException, InterruptedException{
DesiredCapabilities dc=DesiredCapabilities.chrome();
		
		
		URL url=new URL("http://127.0.0.1:4545/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		Thread.sleep(10000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(10000);
		System.out.println("title of page"+driver.getTitle());
		driver.quit();
		
	}
}
