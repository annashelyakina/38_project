package pages;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage(){
        open("https://arcadia.spb.ru/");
        return this;
    }
}
