package com.scm.selenium.model.page;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.utils.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 * Created by depenghou on 2018/5/9
 */
public class OrderCenterProPage extends BasePage {
    public OrderCenterProPage(DriverBase driver) {
        super(driver);
    }
    /**
     * 获取模块名称
     */
    public WebElement getModelName(){
        return webElement(GetByLocator.getLocator("modelName"));
    }
}
