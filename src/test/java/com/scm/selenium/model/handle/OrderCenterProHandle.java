package com.scm.selenium.model.handle;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.page.OrderCenterProPage;
import com.scm.selenium.model.utils.ProUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by depenghou on 2018/5/9
 */
public class OrderCenterProHandle {
    public DriverBase driver;
    public OrderCenterProPage ocpp;
    public ProUtil pro;
    public OrderCenterProHandle(DriverBase driver){
        this.driver = driver;
        ocpp = new OrderCenterProPage(driver);
    }

    /**
     * 获取模块名
     * @return
     */
    public WebElement getModelName(){
        return ocpp.getModelName();
    }
}
