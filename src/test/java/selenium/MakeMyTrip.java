package Automation.Treasury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeMyTrip
{
    @Test
    public void calenderHandle() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement popupEle=driver.findElement(By.cssSelector("iframe[title*='notification-frame']"));
        driver.switchTo().frame(popupEle);
        WebElement popCloseEle=driver.findElement(By.cssSelector("a[class='close']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(popCloseEle).build().perform();
        popCloseEle.click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-cy='departureDate']")).click();
        String mon = "June 2024";
        String date = "8";

        while (true)
        {
            try
            {
                driver.findElement(By.xpath("//div[@class='dateInnerCell']/descendant::p[text()='"+date+"']/../../../../..//div[@class='DayPicker-Caption']/descendant::div[text()='"+mon+"']")).click();
                break;
            } catch (Exception e)
            {
                driver.findElement(By.xpath("//span[contains(@class,\"NavButton--next\")]")).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }

        }

        ExpectedConditions ec;

        driver.quit();
    }
}
