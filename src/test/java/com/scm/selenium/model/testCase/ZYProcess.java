package com.scm.selenium.model.testCase;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.handle.ZYProcessPageHandle;
import com.scm.selenium.model.utils.ProUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by depenghou on 2018/4/13
 */
public class ZYProcess {
    public ProUtil pro;
    public DriverBase driver;
    public ZYProcessPageHandle zyph;
    public ZYProcess(DriverBase driver) {
        this.driver = driver;
        zyph = new ZYProcessPageHandle(driver);
    }

    /**
     * 生成直运请购单
     * @throws InterruptedException
     */
    public void zyOrder() throws InterruptedException {
        pro = new ProUtil("scmUrl.properties");
        driver.get(pro.getPro("scmUrl"));
        Thread.sleep(2000);
        driver.get(pro.getPro("stockRequisitionUrl"));
        Thread.sleep(2000);
        zyph.closeTableWindow().click();
        Thread.sleep(2000);
        driver.action(zyph.selectStore(),"德鹏门店11");
        Thread.sleep(1000);
        zyph.getClick().click();
        Thread.sleep(2000);
        zyph.getAddGoodsButton().click();
        Thread.sleep(2000);
        driver.action(zyph.getSelectStall());
        Thread.sleep(2000);
        zyph.getClickStall().click();
        Thread.sleep(2000);
        zyph.getClickGoodsCode().click();
        Thread.sleep(2000);
        zyph.getClickGoodsCodeQuery().click();
        Thread.sleep(2000);
        zyph.getSelectGoods().click();
        Thread.sleep(2000);
        driver.action(zyph.getOnEnsure());
        Thread.sleep(2000);
        zyph.getSendNumber().click();
        Thread.sleep(1000);
        driver.action(zyph.getSendNumber(),"1");
        Thread.sleep(2000);
        zyph.getClickDate().click();
        Thread.sleep(2000);
        driver.action(zyph.getSelectData());
        Thread.sleep(2000);
        zyph.getClickButtonBuy().click();

    }

}
