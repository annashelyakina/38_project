package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage(){
        open("https://arcadia.spb.ru/");
        return this;
    }
    public RegistrationPage clickAgreeCookie(){
        $("button.cookie-message-agree").click();
        return this;
    }

    public RegistrationPage checkHiddenCookie(){
        $("div.cookie-message").shouldBe(hidden);
        return this;
    }

    public RegistrationPage checkLogoOnPage(){
        $("a.logo").shouldBe(visible);
        return this;
    }

    public RegistrationPage checkSloganOnPage(){
        $("h1.header").shouldHave(text("Превращаем идеи в цифровые решения"));
        return this;
    }

    public RegistrationPage clickContactUs(){
        $("#contactUsModule").shouldBe(visible).click();
        return this;
    }

    public RegistrationPage checkTextOnContactUs(){
        $("div.modal-content-wrapper").shouldHave(text("Связаться"));
        return this;
    }

    public RegistrationPage closeContactUs(){
        $("#close-button").click();
        return this;
    }

    public RegistrationPage checkHiddenContactUs(){
        $("div.modal-content-wrapper").shouldBe(hidden);
        return this;
    }

    public RegistrationPage clickMenuItemCompany(){
    $(byText("Компания")).click();
        return this;
    }

    public RegistrationPage clickSubMenuItemCareer(){
    $(byText("Карьера")).click();
        return this;
    }
    public RegistrationPage checkTextCareerOnPage(){
    $("h1.header").shouldHave(text("Карьера"));
        return this;
    }
}
