/**
* <p>Title: LogIn.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.testCase;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.base.InitDriver;
import com.scm.selenium.model.business.LoginPro;
import com.scm.selenium.model.utils.ProUtil;

/**
 * @author houdepeng
 *2018年3月14日
 * 
 */
public class LogIn {
	
	public DriverBase driver;
	public InitDriver initDriver;
	public ProUtil  pro;
	public LoginPro loginPro;
	@BeforeClass
	public void beforeClass(){
		this.driver= InitDriver.initDriver("chrome");
		pro = new ProUtil("loginTest.properties");
		driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.driver.manage().window().maximize();
		loginPro = new LoginPro(driver);
		driver.get(pro.getPro("url"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 登录 跳转到供应链模块
	 */
    @Test(priority = 0)
	public void testLogin() throws InterruptedException {
		String username = pro.getPro("username");
		String password = pro.getPro("password");
		loginPro.login(username, password);
		Thread.sleep(5000);
        pro = new ProUtil("scmUrl.properties");
        driver.get(pro.getPro("scmUrl"));
        Thread.sleep(2000);
	}
	/***
	 *
	 * 生成直运订单
	 */
	@Test(priority = 1)
	public  void testProgress() throws InterruptedException {
		ZYProcess zy = new ZYProcess(driver);
		zy.zyOrder();
	}
	@Test(priority = 2)
	public void testOrderCenterPro() throws InterruptedException {
		OrderCenterPro ocp = new OrderCenterPro(driver);
		ocp.checkOrder();

	}
	@AfterClass
	public void afterClass(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}


}
