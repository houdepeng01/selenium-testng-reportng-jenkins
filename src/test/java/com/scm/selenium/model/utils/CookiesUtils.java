/**
* <p>Title: CookiesUtils.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月21日
* @version 1.0.1
*/
package com.scm.selenium.model.utils;

import org.openqa.selenium.Cookie;

import com.scm.selenium.model.base.DriverBase;

/**
 * @author houdepeng
 *2018年3月21日
 * 
 */
public class CookiesUtils {
	
	public DriverBase driver;
	public ProUtil  proUtil;
	
	public CookiesUtils(DriverBase driver){
		this.driver = driver;
		proUtil = new ProUtil("cookies.properties");
	}
	public void setCookie(){
		String value = proUtil.getPro("JSESSIONID");
		Cookie cookie = new Cookie("JSESSIONID",value,"scmqas.choicesaas.cn","/ipos-chains",null);
		driver.setCookie(cookie);
	}

}
