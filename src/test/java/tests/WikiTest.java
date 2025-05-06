package tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
//import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WikiTest {

    private final SelenideElement input = $x("//*[@id=\"searchInput\"]");
    private final SelenideElement input1 = $x("/html/body/div[5]/div/div[1]/div/div[1]/form/input[1]");
    private final SelenideElement logo = $x("/html/body/div[1]/div/header/div/div/a/span/img");
    private final SelenideElement searchButton = $x("/html/body/div[5]/div/div[2]/div/div[1]/div");



    @Test
    @DisplayName("Тест на Вики")
    void wikiTest() {
        open("https://ru.m.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        input.click();
        input1.setValue("БФТ");
        searchButton.click();
        logo.shouldBe(Condition.visible).shouldHave(Condition.attribute("alt","Википедия"));
    }
}
