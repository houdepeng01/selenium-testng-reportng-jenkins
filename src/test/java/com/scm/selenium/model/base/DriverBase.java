/**
* <p>Title: DriverBase.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author houdepeng 2018年3月14日
 * 
 */
public class DriverBase {
	public WebDriver driver;

	public DriverBase(String browser) {
		SelectDriver selectDriver = new SelectDriver();
		this.driver = selectDriver.browserName(browser);
	}

	/**
	 * 获取driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * 封装element
	 */
	public WebElement findElement(By by) {
		WebElement webElement = driver.findElement(by);
		return webElement;
	}

	/**
	 * 封装定位一组elements
	 */
	public List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}

	/**
	 * 
	 * get封装
	 */
	public void get(String url) {
		driver.get(url);
	}

	/**
	 * 获取当前url
	 */
	public String getUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * 点击
	 */
	public void click(WebElement webElement) {
		webElement.click();
	}

	/**
	 * 返回
	 */
	public void back() {
		driver.navigate().back();
	}

	/**
	 * 切换window窗口
	 */
	public void switchWindows(String name) {
		driver.switchTo().window(name);
	}

	/**
	 * 关闭浏览器
	 */
	public void close() {
		driver.close();
	}

	/**
	 * 获取当前title
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * 获取当前系统窗口list
	 */
	public List<String> getWindowsHandles() {
		Set<String> windHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windHandles);
		return handles;
	}

	/**
	 * 获取当前窗口
	 */
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	/**
	 * actionMoveElement
	 */
	public void action(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * 设置cookies
	 */	
	public void setCookie(Cookie cookie) {
		driver.manage().addCookie(cookie);   
	}

}
