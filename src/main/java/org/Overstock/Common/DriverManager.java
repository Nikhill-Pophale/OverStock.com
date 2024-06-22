package org.Overstock.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public class DriverManager {
    public static WebDriver driver;

    public static void driverInitionalize() throws IOException {
     FileInputStream fis = new FileInputStream("C:\\Users\\nikpo\\IdeaProjects\\Overstock\\src\\main\\java\\org\\Overstock\\Utils\\data.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String browser = prop.getProperty("Browser");


        if (browser.equals("chrome")) {
//            ChromeOptions options=new ChromeOptions();
//            options.addArguments("--headless");
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
            driver.manage().window().maximize();
            try{
                driver.findElement(By.id("cl-dialog-close")).click();
            }catch (Exception e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("no pop-up");
                driver.getTitle();
            }

        } else if (browser == "edge") {
            driver = new EdgeDriver();
            driver.get(prop.getProperty("url"));
        } else {
            System.out.println("Select proper browser !!");
        }
    }

    public static void teardownBrowser() {
        driver.quit();
    }
}
