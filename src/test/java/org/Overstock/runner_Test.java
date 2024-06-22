package org.Overstock;

import static org.junit.Assert.assertTrue;

import org.Overstock.Common.DriverManager;
import org.Overstock.Pages.Checkout;
import org.Overstock.Pages.Login_page;
import org.Overstock.Pages.Product_Listing;

import org.Overstock.Resources.prop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class runner_Test extends DriverManager
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Login() throws IOException {
        driverInitionalize();
        System.out.println("Login test started !!");
        driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
        Login_page login=new Login_page(driver);
        System.out.println(login.loginIcon().getText());
        login.loginIcon().click();
        login.enterEmail().sendKeys(prop.getdata("email"));
        login.continueBtnn().click();
        login.enterPass().sendKeys(prop.getdata("password"));
        login.SignIn().click();
        System.out.println(driver.getTitle().toString());
        System.out.println("Login test Ended !!");
//        teardownBrowser();
    }
    @Test
    public void AddtoCart() throws IOException, InterruptedException {
        Login();
        System.out.println("Add to Cart test started !!");
        Product_Listing pl=new Product_Listing(driver);
        driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
        pl.ClothingTAB().click();
        Thread.sleep(9000);
        System.out.println(pl.ClothingTAB().getText());
        Actions actions=new Actions(driver);
        actions.moveToElement(pl.Product_Pant()).click().build().perform();
        actions.moveToElement(pl.Add_to_cart_Btn()).click().build().perform();
        Thread.sleep(9000);
        Checkout checkout=new Checkout(driver);
        Thread.sleep(5000);
        System.out.println(checkout.ViewCart_info().getText());
        System.out.println(driver.getTitle().toString());
        System.out.println("Add to Cart Ended !!");
        teardownBrowser();
    }
    public void CheckOut() throws IOException {
        driverInitionalize();
        driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
        Login_page login=new Login_page(driver);
        System.out.println(login.loginIcon().getText());
        login.loginIcon().click();
        login.enterEmail().sendKeys("nikpofale@gmail.com");
        login.continueBtnn().click();
        login.enterPass().sendKeys("7878198nik");
        login.SignIn().click();
        System.out.println(driver.getTitle().toString());
//        teardownBrowser();
    }
}
