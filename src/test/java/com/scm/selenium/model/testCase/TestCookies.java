/**
* <p>Title: TestCookies.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月22日
* @version 1.0.1
*/
package com.scm.selenium.model.testCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.base.InitDriver;
import com.scm.selenium.model.utils.CookiesUtils;

/**
 * @author houdepeng
 *2018年3月22日
 * 
 */
public class TestCookies {
	public DriverBase  driver;
	public CookiesUtils handleCookie;
	@Test
	public void beforeClass() throws Exception{
		this.driver = InitDriver.initDriver("chrome");
		handleCookie = new CookiesUtils(driver);
		driver.get("http://scmqas.choicesaas.cn/settled.html#/merchants/merchantsInfo?_k=egmr2p");
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get("http://scmqas.choicesaas.cn/settled.html#/merchants/merchantsInfo?_k=egmr2p");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	@AfterClass
	public void afterClass(){
		driver.close();
	}*/

}
