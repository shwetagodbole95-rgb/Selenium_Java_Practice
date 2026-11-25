package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);

        a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']//a[contains(@class,'nav-progressive-attribute')]"))).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
}
