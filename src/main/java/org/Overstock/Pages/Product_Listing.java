package org.Overstock.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

/**
 * Hello world!
 */
public class Product_Listing {
    public WebDriver driver;

    public Product_Listing(WebDriver driver3) {
        this.driver = driver3;
    }

    private By jwellary_tab = By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul[1]/li[5]/a");
    private By clothing_tab = By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul[1]/li[6]/a");
//    private By product_Ring = By.xpath("//*[@id=\"algolia-shopify-instantsearch\"]/div/div[3]/div[2]/div[2]/div/ol/li[2]/div/div/p[2]/a/span/span");
    private By product_Pant = By.xpath("//span[text()=\"Calvin Klein Women's High-Rise Buttoned-Waist Dress Pants Navy Size 4\"]");
    private By add_to_cart_Btn = By.xpath("//button[@name=\"add\"]");

    public WebElement JwellaryTAB() {
        return driver.findElement(jwellary_tab);
    }
    public WebElement ClothingTAB() {
        return driver.findElement(clothing_tab);
    }

//    public WebElement Product_Ring() {
//        return driver.findElement(product_Ring);
//    }
    public WebElement Product_Pant() {
        return driver.findElement(product_Pant);
    }

    public WebElement Add_to_cart_Btn() {
        return driver.findElement(add_to_cart_Btn);
    }

    public Checkout afterChkout() {
        return new Checkout(driver);
    }

}
