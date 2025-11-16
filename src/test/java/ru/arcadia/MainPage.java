package ru.arcadia;

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

@Tag("arcadia_tests")
public class MainPage extends TestBase {

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
    void searchCompanyLogoOnPage() {

        step("Проверяем наличие логотипа на странице", () -> {
            $("a.logo").shouldBe(visible);
        });
    }

    @Test
    void checkWelcomeTextOnPage() {

        step("Проверяем наличие лозунга компании на странице", () -> {
            $("h1.header").shouldHave(text("Превращаем идеи в цифровые решения"));
        });
    }

    @Test
    void contactUsModalDialog() {

        step("Проверяем наличие кнопки для связи и нажимаем её", () -> {
            $("#contactUsModule").shouldBe(visible).click();
        });
        step("Проверяем открытие формы для связи", () -> {
            $("div.modal-content-wrapper").shouldHave(text("Связаться"));
        });
        step("Закрываем форму для связи", () -> {
            $("#close-button").click();
        });


    }
}
