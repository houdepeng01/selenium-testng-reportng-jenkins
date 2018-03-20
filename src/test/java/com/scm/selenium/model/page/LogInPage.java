/**
* <p>Title: LogInPage.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.page;

import org.openqa.selenium.WebElement;
import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.utils.GetByLocator;

/**
 * @author houdepeng 2018年3月14日
 * 
 */
public class LogInPage extends BasePage {

	/**
	 * @param driver
	 */
	public LogInPage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取用户名输入框
	 */
	public WebElement getUserElement() {
		return webElement(GetByLocator.getLocator("userName"));
	}

	/**
	 * 获取密码输入框Element
	 */
	public WebElement getPasswordElement() {
		return webElement(GetByLocator.getLocator("password"));
	}

	/**
	 * 获取登陆按钮element
	 */
	public WebElement getLoginButtonElement() {
		return webElement(GetByLocator.getLocator("loginbutton"));
	}

	/**
	 * 获取自动登陆element
	 */
	public WebElement getAutoSigninElement() {
		return webElement(GetByLocator.getLocator("autoSignin"));
	}

}
