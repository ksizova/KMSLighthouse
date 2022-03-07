package HomePageTests;

import PageObject.HomePage;
import PageObject.ThankYouPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationFormSuccessTest {

    @Test
    public void registrationFormTest() {
        //Создаем тестовые данные
        String name = "Maria";
        String surname = "Curie";
        String email = "curiemaria@exemple.com";
        String phoneNumber = "+79051230977";
        String companyName = "RadiumProdaction";

        //Создаем экземпляр главной страницы
        HomePage homePage;
        homePage = open(HomePage.URL, HomePage.class)
                .conditionalPopUpVisible();

        assertTrue("Не найдено поле ввода имени 'First name'", homePage.isDisplayedFieldFirstName());
        homePage.fillFieldFirstName(name);
        assertEquals("Значение поля 'First name' не соответствует ожидаемому:", name, homePage.getTextFieldFirstName());

        assertTrue("Не найдено поле ввода имени 'Last name'", homePage.isDisplayedFieldLastName());
        homePage.fillFieldLastName(surname);
        assertEquals("Значение поля 'Last name' не соответствует ожидаемому:", surname, homePage.getTextFieldLastName());

        assertTrue("Не найдено поле ввода имени 'Professional Email'", homePage.isDisplayedFieldEmail());
        homePage.fillFieldEmail(email);
        assertEquals("Значение поля 'Professional Email' не соответствует ожидаемому:", email, homePage.getTextFieldEmail());

        assertTrue("Не найдено поле ввода имени 'Phone number'", homePage.isDisplayedFieldPhoneNumber());
        homePage.fillFieldPhoneNumber(phoneNumber);
        assertEquals("Значение поля 'Phone number' не соответствует ожидаемому:", phoneNumber, homePage.getTextFieldPhoneNumber());

        assertTrue("Не найдено поле ввода имени 'Company name'", homePage.isDisplayedFieldCompanyName());
        homePage.fillFieldCompanyName(companyName);
        assertEquals("Значение поля 'Company name' не соответствует ожидаемому:", companyName, homePage.getTextFieldCompanyName());

        assertTrue("Не найдена кнопка 'Submit'", homePage.isDisplayedButtonSubmit());
        homePage.clickButtonSubmit();

        //Создаем экземпляр следующей страницы
        ThankYouPage thankYouPage;
        thankYouPage = page(ThankYouPage.class)
                .visibleThankYouPage();
        assertTrue("Не найдена страница перехода.", thankYouPage.isDisplayedThankYouPage());
    }

}
