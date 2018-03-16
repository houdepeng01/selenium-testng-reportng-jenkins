/**
* <p>Title: InitDriver.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.base;

/**
 * @author houdepeng
 *2018年3月14日
 * 
 */
public class InitDriver {
	
	public static DriverBase initDriver(String browser){
		return new DriverBase(browser);
		
	}

}
