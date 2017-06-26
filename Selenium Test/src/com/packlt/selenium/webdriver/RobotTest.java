package com.packlt.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class RobotTest {

	private WebDriver driver;
	private WebElement login;
	private String browser;

	public void setBrowser(){
		browser = "Firefox";
	}

	public void setBrowserConfig(){

		if (browser.contains("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/Users/kevin.d.panaglima/workspace/Selenium Test/lib/geckodriver.exe");
			driver = new FirefoxDriver();

		}
	}

	public void runTest(){
		driver.get("https://www.farmon.ph/");
		login = driver.findElement(By.xpath("html/body/div[1]/div[2]/ul[2]/li[3]/a"));
		login.click();

	}

	public static void main(String[] args) {
		RobotTest rt = new RobotTest();

		rt.setBrowser();
		rt.setBrowserConfig();
		rt.runTest();

	}

}
