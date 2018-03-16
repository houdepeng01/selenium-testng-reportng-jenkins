/**
* <p>Title: BasePage.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月15日
* @version 1.0.1
*/
package com.scm.selenium.model.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;

import com.scm.selenium.model.base.DriverBase;

/**
 * @author houdepeng 2018年3月15日
 * 
 */
public class BasePage {
	public DriverBase driver;

	public BasePage(DriverBase driver) {
		this.driver = driver;
	}

	/**
	 * 定位Element
	 */
	public WebElement webElement(By by) {
		WebElement webElement = driver.findElement(by);
		return webElement;
	}

	/**
	 * 层级定位，通过父节点定位子节点 需要传入父子节点的by
	 */
	public WebElement webElement(By by, By nodeBy) {
		WebElement el = this.webElement(by);
		return el.findElement(nodeBy);
	}

	/**
	 * 层级定位传入element,以及子的by
	 */
	public WebElement nodeElement(WebElement element, By by) {
		return element.findElement(by);

	}

	/**
	 * 定位父节点List<WebElement>集合的元素
	 */
	public List<WebElement> webElements(WebElement element, By by) {
		return element.findElements(by);
	}

	/**
	 * 定位List<WebElement>集合元素
	 */
	public List<WebElement> elements(By by) {
		return driver.findElements(by);
	}

	/**
	 * 封装点击
	 */
	public void click(WebElement element) {
		if (element != null) {
			element.click();
		} else {
			System.out.println("元素定位不到，点击失败");
		}
	}

	/**                                                                                                                                                                            
	 * 封装输入
	 */
	public void sendKeys(WebElement element, String value) {
		if (element != null) {
			element.sendKeys(value);
		} else {
			System.out.println(element + "元素没有定位到，输入失败" + value);
		}
	}

	/**
	 * 判断元素是否显示
	 */
/*	public boolean assertElementIsDisplay(WebElement element) {
		return element.isDisplayed();
	}*/

	/**
	 * 获取文本信息
	 */
	public String getText(WebElement element) {
		return element.getText();
	}

	/**
	 * 获取title
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * 关闭浏览器
	 */
	public void close() {
		driver.close();
	}

	/**
	 * 获取当前窗口所有的windows
	 */
	public List<String> getWindowsHandles() {
		List<String> handles = driver.getWindowsHandles();
		return handles;
	}

	/**
	 * 根据title切换新窗口
	 */
	public boolean switchToWindow_Title(String windowTitle) {
		boolean flag = false;
		try {
			String currentHandle = driver.getWindowHandle();
			List<String> handles = driver.getWindowsHandles();
			for (String s : handles) {
				if (s.equals(currentHandle))
					continue;
				else {
					driver.switchWindows(s);
					if (driver.getTitle().contains(windowTitle)) {
						flag = true;
						System.out.println("切换windows成功: " + windowTitle);
						break;
					} else
						continue;
				}
			}
		} catch (NoSuchWindowException e) {
			System.out.println("Window: " + windowTitle + " 没找到!!!" + e.fillInStackTrace());
			flag = false;
		}
		return flag;
	}

	/**
	 * action事件
	 */
	public void action(WebElement element) {
		driver.action(element);
	}

}
