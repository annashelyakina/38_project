package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage(){
        open("https://arcadia.spb.ru/");
        return this;
    }
    public RegistrationPage closeCookies(){
        $("span.btn-name").click();
        return this;
    }

}
