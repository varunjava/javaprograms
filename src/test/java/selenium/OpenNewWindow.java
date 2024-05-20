package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenNewWindow
{
    @Test
    public void launchNewWindow()
    {
        WebDriver driver=new ChromeDriver();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable());

        JavascriptExecutor js= (JavascriptExecutor) driver;

    }
}
