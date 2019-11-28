import lib.CoreTestCase;
import lib.UI.MainPageObject;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends CoreTestCase {
    private MainPageObject mainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();
        mainPageObject = new MainPageObject(driver);
    }

    @Test
    public void testSearch()
    {
        mainPageObject.findElementBy(
               By.xpath("//*[contains(@text, 'Кино и ТВ')]"),
               "can not element Kino and TV",
               10);

        mainPageObject.findElementAndClick(
                    By.xpath("//*[contains(@content-desc, 'Открыть меню')]"),
                    "can not element Menu",
                    5);
        mainPageObject.findElementAndClick(
                By.xpath("//*[contains(@text, 'Авторизоваться')]"),
                "can not button Autorization",
                5);
        mainPageObject.findElementAndSendKey(
                By.xpath("//*[contains(@text, 'Логин')]"),
                "11111111",
                "can not button Autorization",
                5);
        mainPageObject.findElementAndSendKey(
                By.xpath("//*[contains(@text, 'Пароль')]"),
                "111111111",
                "can not button Password",
                5);
        mainPageObject.findElementAndClick(
                By.xpath("//*[contains(@text, 'Войти')]"),
                "can not button Enter",
                5);
    }


}



