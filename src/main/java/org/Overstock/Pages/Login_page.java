package org.Overstock.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 * DriverManager
 */
public class Login_page {
    WebDriver driver;

    public Login_page(WebDriver driver2){
        this.driver=driver2;
    }
//    private By loginicon = By.xpath("(//span[@class=\"visually-hidden\"])[1]");
    private By loginicon = By.xpath("//a[@class=\"head-slot-nav-link\"]");
    private By email = By.id("email");
    private By continueBtn = By.xpath("//button[text()=\"Continue\"]");
    private By password = By.id("password");
    private By SignInbtn = By.xpath("//button[text()=\"Sign In\"]");

    public WebElement loginIcon() {
        return driver.findElement(loginicon);
    }

    public WebElement enterEmail() {
        return driver.findElement(email);
    }

    public WebElement continueBtnn() {
        return driver.findElement(continueBtn);
    }

    public WebElement enterPass() {
        return driver.findElement(password);
    }

    public WebElement SignIn() {
        return driver.findElement(SignInbtn);
    }
    public Product_Listing afterLogin(){return new Product_Listing(driver);}
}
