package ru.dynamika;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("dynamika_tests")
public class MainPage extends TestBase{

    @BeforeEach
    void allureListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
    @Test
        void searchCompanyLogoOnPage(){

        step("Проверяем наличие логотипа на странице", () -> {
            $("[alt=Dynamika]").shouldBe(visible);
    });
       }

    @Test
        void checkWelcomeTextOnPage(){

        $("div.welcome__title").shouldHave(text("Бизнес-решения для банков Dynamika"));
    }
}
