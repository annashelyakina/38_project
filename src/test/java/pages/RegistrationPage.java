package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    @Step("Открытие сайта в браузере")
    public RegistrationPage openPage(){
        open("");
        return this;
    }
    @Step("Нажатие кнопки 'Принять' на форме Cookie")
    public RegistrationPage clickAgreeCookie(){
        $("button.cookie-message-agree").click();
        return this;
    }

    @Step("Проверка, что форма Cookie не отображается")
    public RegistrationPage checkHiddenCookie(){
        $("div.cookie-message").shouldBe(hidden);
        return this;
    }

    @Step("Проверка, что логотип отображается на странице")
    public RegistrationPage checkLogoOnPage(){
        $("a.logo").shouldBe(visible);
        return this;
    }

    @Step("Проверка, что слоган отображается на странице")
    public RegistrationPage checkSloganOnPage(){
        $("h1.header").shouldHave(text("Превращаем идеи в цифровые решения"));
        return this;
    }

    @Step("Проверка, что форма для связи открыта")
    public RegistrationPage clickContactUs(){
        $("#contactUsModule").shouldBe(visible).click();
        return this;
    }

    @Step("Проверка, что текст отображается на форме для связи")
    public RegistrationPage checkTextOnContactUs(){
        $("div.modal-content-wrapper").shouldHave(text("Связаться"));
        return this;
    }

    @Step("Нажатие кнопки на форме для связи")
    public RegistrationPage closeContactUs(){
        $("#close-button").click();
        return this;
    }

    @Step("Проверка, что форма для связи закрыта")
    public RegistrationPage checkHiddenContactUs(){
        $("div.modal-content-wrapper").shouldBe(hidden);
        return this;
    }

    @Step("Нажатие пункта меню 'Компания'")
    public RegistrationPage clickMenuItemCompany(){
    $(byText("Компания")).click();
        return this;
    }

    @Step("Нажатие подпункта меню 'Карьера'")
    public RegistrationPage clickSubMenuItemCareer(){
    $(byText("Карьера")).click();
        return this;
    }

    @Step("Проверка, что текст отображается на странице")
    public RegistrationPage checkTextCareerOnPage(){
    $("h1.header").shouldHave(text("Карьера"));
        return this;
    }
}
