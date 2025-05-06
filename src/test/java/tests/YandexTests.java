package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class YandexTests {

    private final SelenideElement input = $x("//*[@id=\"text\"]");
    private final SelenideElement logo = $("HeaderLogo");
    private final SelenideElement searchButton = $x("/html/body/main/div[3]/form/div[4]/button");

    //капча победила
    @Test
    void yandexTestLogo() {
        open("https://ya.ru/?utm_referrer=https%3A%2F%2Fwww.google.com%2F");

        input.setValue("БФТ");

        searchButton.click();

        logo.shouldHave(Condition.cssValue("background-color", "rgba(0, 123, 255, 1)"));

        sleep(5000);
    }
}
