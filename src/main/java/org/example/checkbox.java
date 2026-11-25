package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.close();
    }
}
