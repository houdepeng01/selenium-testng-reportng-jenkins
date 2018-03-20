/**
* <p>Title: GetByLocator.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月15日
* @version 1.0.1
*/
package com.scm.selenium.model.utils;

import org.openqa.selenium.By;

/**
 * @author houdepeng 2018年3月15日
 * 
 */
public class GetByLocator {
	public static By getLocator(String key) {
		ProUtil pro = new ProUtil("element.properties");
		String locator = pro.getPro(key);
		String locatorType = locator.split(">")[0];
		//System.out.println(locatorType);
		String locatorValue = locator.split(">")[1];
		//System.out.println(locatorValue);
		if (locatorType.equals("id")) {
			return By.id(locatorValue);
		} else if (locatorType.equals("name")) {
			return By.name(locatorValue);
		} else if (locatorType.equals("tageName")) {
			return By.tagName(locatorValue);
		} else if (locatorType.equals("linkText")) {
			return By.linkText(locatorValue);
		} else if (locatorType.equals("partialLinkText")) {
			return By.partialLinkText(locatorValue);
		} else if (locatorType.equals("className")) {
			return By.className(locatorValue);
		} else {
			return By.xpath(locatorValue);
		}
	}
}
