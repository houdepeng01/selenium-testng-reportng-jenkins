package com.hdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

/**
 * Created by HouDepeng on 2018/2/11.
 */
@Test
public class DemoTest {

    WebDriver driver =null;
    @Test(priority = 1)
    public   void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test(priority = 2)
    public  void login(){

        driver.get("http://choice-scm.tst.choicesoft.com.cn");
        System.out.println("The testing page title is: " + driver.getTitle());
    }

    @Test(priority = 3)
    public  void finish() throws InterruptedException {
    	System.out.println("333333");
        Thread.sleep(5000);
        driver.quit();

    }


}
