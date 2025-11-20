package ru.arcadia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

@Tag("arcadia_tests")
public class MainPage extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Закрытие окна Cookie")
    void closeCookieMessage() {

        registrationPage.openPage()
                .clickAgreeCookie()
                .checkHiddenCookie()
        ;
     }

    @Test
    @DisplayName("Поиск логотипа компании на странице")
    void searchCompanyLogoOnPage() {

        registrationPage.openPage()
                .checkLogoOnPage()
        ;

    }

    @Test
    @DisplayName("Поиск лозунга компании на странице")
    void checkWelcomeTextOnPage() {

        registrationPage.openPage()
                .checkSloganOnPage()
        ;
          }

    @Test
    @DisplayName("Проверка формы для связи")
    void contactUsModalDialog() {

        registrationPage.openPage()
                .clickContactUs()
                .checkTextOnContactUs()
                .closeContactUs()
                .checkHiddenContactUs()
        ;
          }

    @Test
    @DisplayName("Открытие страницы с описанием карьеры в компании")
    void clickMenuItem() {

        registrationPage.openPage()
                .clickMenuItemCompany()
                .clickSubMenuItemCareer()
                .checkTextCareerOnPage()
        ;


    }

}
