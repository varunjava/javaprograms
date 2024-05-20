package Practise.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic
{
    @Test
    public static void launch()
    {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=PLLbGltmkpE&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV");
//        driver.getTitle();
//        driver.getWindowHandle();
//        driver.close();

    }
}
