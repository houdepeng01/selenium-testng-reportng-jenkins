/**
* <p>Title: SelectDriver.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author houdepeng
 *2018年3月14日
 * 
 */
public class SelectDriver {
	
	public WebDriver browserName(String browser){
		if(browser.equals("chrome")){
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	        return new ChromeDriver();
		}else{
			System.setProperty("webdriver.firefox.marionette", "D:\\java\\geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			return new FirefoxDriver();
		}
		
		
		
	}

}
