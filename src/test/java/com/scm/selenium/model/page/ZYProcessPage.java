package com.scm.selenium.model.page;

import com.scm.selenium.model.base.DriverBase;
import com.scm.selenium.model.utils.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 * Created by depenghou on 2018/4/14
 */
public class ZYProcessPage extends BasePage {

    public ZYProcessPage(DriverBase driver) {
        super(driver);
    }
    /**
     * click门店select元素
     */
    public WebElement getCloseTableWindow(){
        return webElement(GetByLocator.getLocator("closeTableWindow"));
    }
    /**
     * 选择门店
     */
    public WebElement  getSelectStore(){
        return webElement(GetByLocator.getLocator("selectStore"));
    }
    /**
     * 点击选择框
     */
    public WebElement getClick(){
        return webElement(GetByLocator.getLocator("click"));
    }
    /**
     * 点击添加请购订单
     */
    public WebElement getAddGoodsButton(){
        return webElement(GetByLocator.getLocator("addGoodsButton"));
    }
    /**
     * 选择档口
     */
    public WebElement getSelectStall(){
        return webElement(GetByLocator.getLocator("selectStall"));
    }
    /**
     * 确定档口
     */
    public WebElement getClickStall(){
        return  webElement(GetByLocator.getLocator("clickStall"));
    }
    /**
     * 点击物品文本框
     */
    public WebElement getClickGoodsCode(){
        return webElement(GetByLocator.getLocator("clickGoodsCode"));
    }
    /**
     * 点击物品文本框物品搜索
     */
    public WebElement getClickGoodsCodeQuery(){
        return webElement(GetByLocator.getLocator("clickGoodsCodeQuery"));
    }
    /**
     * 选择物品
     */
    public WebElement getSelectGoods(){
        return webElement(GetByLocator.getLocator("selectGoods"));
    }
    /**
     * 点击确定
     */
    public WebElement getOnEnsure(){
        return webElement(GetByLocator.getLocator("onEnsure"));
    }
    /**
     * 输入物品数量
     */
    public WebElement getSendNumber(){
        return webElement(GetByLocator.getLocator("sendNumber"));
    }
    /**
     * 点击日期
     */
    public WebElement getClickDate(){
        return webElement(GetByLocator.getLocator("clickDate"));
    }
    /**
     * 选择日期
     */
    public WebElement getSelectData(){
        return webElement(GetByLocator.getLocator("selectData"));
    }
    /**
     * 点击请购按钮
     */
    public WebElement getClickButtonBuy(){
        return webElement(GetByLocator.getLocator("clickButtonBuy"));
    }

}
