package com.scm.selenium.model.testCase;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.utils.ProUtil;
import org.openqa.selenium.By;

/**
 * Created by depenghou on 2018/4/13
 */
public class ZYProcess {
    public ProUtil pro;
    public DriverBase driver;
    public ZYProcess(DriverBase driver) {
        this.driver = driver;
    }
    public void zyOrder() throws InterruptedException {
        pro = new ProUtil("scmUrl.properties");
        driver.get(pro.getPro("scmUrl"));
        Thread.sleep(2000);
        driver.get(pro.getPro("stockRequisitionUrl"));
        Thread.sleep(2000);

    }


}
