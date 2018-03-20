/**
* <p>Title: LogInPageHandle.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.handle;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.page.LogInPage;

/**
 * @author houdepeng 2018年3月14日
 * 
 */
public class LogInPageHandle {

	public DriverBase driver;
	public LogInPage lp;

	public LogInPageHandle(DriverBase driver) {
		this.driver = driver;
		lp = new LogInPage(driver);
	}

	/**
	 * 输入用户名
	 */
	public void sendKeysUser(String username) {
		lp.sendKeys(lp.getUserElement(), username);
	}

	/**
	 * 输入密码
	 */
	public void sendKeysPassword(String password) {
		lp.sendKeys(lp.getPasswordElement(), password);
	}

	/**
	 * 点击登陆
	 */
	public void clickLoginButton() {
		lp.click(lp.getLoginButtonElement());
	}

	/**
	 * 点击自动登陆
	 */
	public void clickAutoSignin() {
		lp.click(lp.getAutoSigninElement());
	}

	/**
	 * 判断是否是登陆页面
	 */
	public boolean assertLoginPage() {
	 return lp.assertElementIs(lp.getUserElement());
	}

}
