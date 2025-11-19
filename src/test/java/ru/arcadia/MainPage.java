package ru.arcadia;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

@Tag("arcadia_tests")
public class MainPage extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Step("Закрытие окна Cookie")
    void closeCookieMessage() {

        registrationPage.openPage()
                .clickAgreeCookie()
                .checkHiddenCookie()
        ;
     }

    @Test
    @Step("Поиск логотипа компании на странице")
    void searchCompanyLogoOnPage() {

        registrationPage.openPage()
                .checkLogoOnPage()
        ;

    }

    @Test
    @Step("Поиск лозунга компании на странице")
    void checkWelcomeTextOnPage() {

        registrationPage.openPage()
                .checkSloganOnPage()
        ;
          }

    @Test
    @Step("Проверка формы для связи")
    void contactUsModalDialog() {

        registrationPage.openPage()
                .clickContactUs()
                .checkTextOnContactUs()
                .closeContactUs()
                .checkHiddenContactUs()
        ;
          }

    @Test
    @Step("Открытие страницы с описанием карьеры в компании")
    void clickMenuItem() {

        registrationPage.openPage()
                .clickMenuItemCompany()
                .clickSubMenuItemCareer()
                .checkTextCareerOnPage()
        ;


    }

}
