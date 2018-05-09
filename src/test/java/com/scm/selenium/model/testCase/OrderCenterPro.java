package com.scm.selenium.model.testCase;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.handle.OrderCenterProHandle;
import com.scm.selenium.model.utils.ProUtil;

/**
 * Created by depenghou on 2018/5/9
 */
public class OrderCenterPro {
    public DriverBase driver;
    public OrderCenterProHandle ocph;
    public OrderCenterPro(DriverBase driver){
        this.driver = driver;
        ocph = new OrderCenterProHandle(driver);
    }
    public void checkOrder() throws InterruptedException {
        ocph.getModelName().click();
        Thread.sleep(6000);
    }

}
