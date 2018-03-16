/**
* <p>Title: ProUtils.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2017</p>
* <p>Company: Choice</p>
* @author houdepeng
* @date 2018年3月14日
* @version 1.0.1
*/
package com.scm.selenium.model.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author houdepeng
 *2018年3月14日
 * 
 */
public class ProUtil {
	private String filePath;
	private Properties prop;

	/**
	 * 构造方法
	 */
	public ProUtil(String filePath) {
		this.filePath = filePath;
		this.prop = readProperties();
	}

	/**
	 * 读取配置文件
	 */
	private Properties readProperties() {
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			BufferedInputStream in = new BufferedInputStream(inputStream);
			properties.load(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	/**
	 * 根据key值获取关键字的内容
	 */
	public String getPro(String key){
		if(prop.containsKey(key)){
			return prop.getProperty(key);
		}else{
			System.out.println("你输入的key值有误");
			return "";
		}	
	}

}
