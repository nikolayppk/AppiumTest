package lib;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class CoreTestCase extends TestCase {
    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";

    @Override
    protected void setUp() throws Exception {

        super.setUp();
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Galaxy S8");
        capabilities.setCapability("udid","9WV4C18628002053");

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.gsgroup.tricoloronline.mobile");
        capabilities.setCapability("appActivity", "com.gsgroup.phoenix.ui.screen.launch.LauncherActivity");
        capabilities.setCapability("app", "C:\\Users\\LuschenkoNM\\Desktop\\KinoAndTV\\appks\\mobiletvphoenix-release.apk");

        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }
    @Override
public void tearDown() throws Exception
    {
driver.quit();
super.tearDown();
    }
}

