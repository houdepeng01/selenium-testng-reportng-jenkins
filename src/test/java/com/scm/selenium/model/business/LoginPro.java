/**
* <p>Title: LoginPro.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.business;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.handle.LogInPageHandle;

/**
 * @author houdepeng 2018年3月14日
 * 
 */
public class LoginPro {

	public DriverBase driver;
	public LogInPageHandle lph;

	public LoginPro(DriverBase driver) {
		this.driver = driver;
		lph = new LogInPageHandle(driver);
	}

	public void login(String username, String password) {
		/*if (lph.assertLoginPage()) {*/
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			lph.clickLoginButton();
		/*} else {
			System.out.println("页面不存在或者状态不正确。");
		}*/

	}

}
