package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridTest {
	
	@Test
	public void login() throws MalformedURLException {
	DesiredCapabilities caps= new DesiredCapabilities();
	caps.setPlatform(Platform.ANY);
	RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.16:4444/wd/hub"),caps);
	driver.get("http://www.amazon.com/");
	driver.quit();
	
}
}
