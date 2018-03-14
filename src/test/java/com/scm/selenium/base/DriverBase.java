/**
* <p>Title: DriverBase.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.base;

import org.openqa.selenium.WebDriver;

/**
 * @author houdepeng
 *2018年3月14日
 * 
 */
public class DriverBase {
	public WebDriver driver;
	public DriverBase(){
		SelectDriver selectDriver = new SelectDriver();
	}
	

}
