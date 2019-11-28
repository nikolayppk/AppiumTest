package lib.UI;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageObject {
    protected AppiumDriver driver;

    public MainPageObject(AppiumDriver driver)
    {
        this.driver = driver;
    }
    public WebElement findElementBy(By by, String error_massage, int time_out)  {
        WebDriverWait wait = new WebDriverWait(driver, time_out);
        wait.withMessage(error_massage + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by));
    }
    public WebElement findElementAndClick(By by, String error_massage, int time_out) {
        WebElement element = findElementBy(by, error_massage, time_out);
        element.click();
        return element;
    }
    public WebElement findElementAndSendKey(By by, String value, String error_massage, int time_out) {
        WebElement element = findElementBy(by, error_massage, time_out);
        element.sendKeys(value);
        return element;
    }
    public WebElement findElementBy(By by, String error_massage) {
        return findElementBy(by, error_massage, 5);
    }
}
