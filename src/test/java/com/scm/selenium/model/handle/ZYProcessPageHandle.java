package com.scm.selenium.model.handle;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.page.ZYProcessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by depenghou on 2018/4/14
 */
public class ZYProcessPageHandle {
    public DriverBase driver;
    public ZYProcessPage zypp;
    public ZYProcessPageHandle(DriverBase driver){
        this.driver = driver;
        zypp= new ZYProcessPage(driver);
    }
    /**TableWindow
     *关闭报表弹框
     */
    public WebElement closeTableWindow(){
        //zypp.click(zypp.getClickStoreElement());
        return zypp.getCloseTableWindow();
    }

    /**
     * 选择门店
     * @return
     */
    public WebElement selectStore(){
        return zypp.getSelectStore();
    }
    /**
     * 点击事件
     */
    public WebElement getClick(){
        return zypp.getClick();
    }
    /**
     * 点击添加请购单
     */
    public WebElement getAddGoodsButton(){
        return zypp.getAddGoodsButton();
    }
    /**
     * 选择档口
     */
    public WebElement getSelectStall(){
        return zypp.getSelectStall();
    }
    /**
     * 确定档口
     */
    public WebElement getClickStall(){
        return zypp.getClickStall();
    }
    /**
     * 点击物品文本框
     */
    public WebElement getClickGoodsCode(){
        return zypp.getClickGoodsCode();
    }
    /**
     * 点击物品文本框物品搜索
     */
    public WebElement getClickGoodsCodeQuery(){
        return zypp.getClickGoodsCodeQuery();
    }
    /**
     * 选择物品
     */
    public WebElement getSelectGoods(){
        return zypp.getSelectGoods();
    }
    /**
     * 点击确定
     */
    public WebElement getOnEnsure(){
        return zypp.getOnEnsure();
    }
    /**
     * 输入物品数量
     */
    public WebElement getSendNumber(){
        return zypp.getSendNumber();
    }
    /**
     * 点击日期
     */
    public WebElement getClickDate(){
        return zypp.getClickDate();
    }
    /**
     * 选择日期
     */
    public WebElement getSelectData(){
        return zypp.getSelectData();
    }
    /**
     * 点击请购按钮
     */
    public WebElement getClickButtonBuy(){
        return zypp.getClickButtonBuy();
    }


}
