package ru.arcadia;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Tag("arcadia_tests")
public class MainPage extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Step("Закрытие окна Cookie")
    void closeCookieMessage() {

        registrationPage.openPage();
        $("button.cookie-message-agree").click();
        $("div.cookie-message").shouldBe(hidden);
     }

    @Test
    @Step("Поиск логотипа компании на странице")
    void searchCompanyLogoOnPage() {

        registrationPage.openPage();
        $("a.logo").shouldBe(visible);
    }

    @Test
    @Step("Поиск лозунга компании на странице")
    void checkWelcomeTextOnPage() {

        registrationPage.openPage();
        $("h1.header").shouldHave(text("Превращаем идеи в цифровые решения"));
    }

    @Test
    @Step("Проверка формы для связи")
    void contactUsModalDialog() {

        registrationPage.openPage();
        $("#contactUsModule").shouldBe(visible).click();
        $("div.modal-content-wrapper").shouldHave(text("Связаться"));
        $("#close-button").click();
        $("div.modal-content-wrapper").shouldBe(hidden);
    }

    @Test
    @Step("Открытие страницы с описанием карьеры в компании")
    void clickMenuItem() {

        registrationPage.openPage();
        $(byText("Компания")).click();
        $(byText("Карьера")).click();
        $("h1.header").shouldHave(text("Карьера"));

    }

}
