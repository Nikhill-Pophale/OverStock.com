package org.Overstock.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
    public WebDriver driver;

    public Checkout(WebDriver driver1) {
        this.driver = driver1;
    }

    private By ViewCartbtn = By.xpath("//*[@id=\"header-mini-cart-footer\"]/div/div[2]/a");
    private By ViewCart = By.xpath("//div[@class=\"mini-cart-item-info\"]");
    private By Total = By.xpath("//div[@class=\"totals\"]");
    private By CheckoutBtn = By.id("checkout");

    public WebElement ViewCartBtn() {
        return driver.findElement(ViewCartbtn);
    }
    public WebElement ViewCart_info() {
        return driver.findElement(ViewCart);
    }

    public String getTotal() {
        return driver.findElement(Total).getText();
    }

    public WebElement getCheckoutBtn() {
        return driver.findElement(CheckoutBtn);
    }
}
