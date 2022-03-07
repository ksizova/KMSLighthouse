package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {

    public static final String URL = "https://www.kmslh.com/automation-test/";

    public static final String URLVIDEO = "https://www.youtube.com/watch?v=yGTsxAY5T0g";

    //Локатор поп-апа видео
    @FindBy(how = How.ID, using = "leadinModal-content-wrapper-2379091")
    private SelenideElement popupVideo;

    //Локатор ссылки на видео
    @FindBy(how = How.XPATH, using = ".//a[@href='https://www.youtube.com/watch?v=yGTsxAY5T0g']")
    private SelenideElement linkVideo;

    //Локатор закрытия поп-апа
    @FindBy(how = How.XPATH, using = ".//button[@class='leadinModal-close']")
    private SelenideElement buttonExitPopup;

    //Локатор ввода имени
    @FindBy(how = How.ID, using = "firstname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814")
    private SelenideElement fieldFirstName;

    //Локатор ввода фамилии
    @FindBy(how = How.ID, using = "lastname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814")
    private SelenideElement fieldLastName;

    //Локатор ввода электронной почты
    @FindBy(how = How.ID, using = "email-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814")
    private SelenideElement fieldEmail;

    //Локатор ввода номера телефона
    @FindBy(how = How.ID, using = "phone-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814")
    private SelenideElement fieldPhoneNumber;

    //Локатор ввода названия компании
    @FindBy(how = How.ID, using = "company-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814")
    private SelenideElement fieldCompanyName;

    //Локатор ввода кнопки утвердить
    @FindBy(how = How.XPATH, using = ".//div[@class='hs_submit hs-submit']")
    private SelenideElement buttonSubmit;

    //Методы работы с локаторами
    //Ждем повяления локатора: если локатор присутствует - закрываем поп-ап, если локатора нет - возвращаем экземпляр страницы
    public HomePage conditionalPopUpVisible() {
        if (popupVideo.isDisplayed()) {
            buttonExitPopup.click();
            return this;
        } else {
            return this;
        }
    }
    //Ожидание появления поп-апа
    public void waitPopUpWithVideo() {
        popupVideo.shouldBe(visible,Duration.ofSeconds(30));
    }
    //Получаем ссылку на видео
    public String getAtributeLinkVideo() {
        linkVideo.shouldBe(enabled);
        return linkVideo.getAttribute("href");
    }


    //Проверяем доступность поля ввода имени
    public boolean isDisplayedFieldFirstName() {
        return fieldFirstName.isDisplayed();
    }
    //Заполняем поле ввода имени
    public HomePage fillFieldFirstName(String name) {
        fieldFirstName.scrollTo().setValue(name);
        return this;
    }
    //Проверяем, что поле ввода имени заполнено верным значением
    public String getTextFieldFirstName() {
        return fieldFirstName.getValue();
    }


    //Проверяем доступность поля ввода фамилии
    public boolean isDisplayedFieldLastName() {
        return fieldLastName.isDisplayed();
    }
    //Заполняем поле ввода фамилии
    public HomePage fillFieldLastName(String surname) {
        fieldLastName.scrollTo().setValue(surname);
        return this;
    }
    //Проверяем, что поле ввода фамилии заполнено верным значением
    public String getTextFieldLastName() {
        return fieldLastName.getValue();
    }


    //Проверяем доступность поля ввода электронной почты
    public boolean isDisplayedFieldEmail() {
        return fieldEmail.isDisplayed();
    }
    //Заполняем поле ввода электронной почты
    public HomePage fillFieldEmail(String email) {
        fieldEmail.scrollTo().setValue(email);
        return this;
    }
    //Проверяем, что поле ввода электронной почты заполнено верным значением
    public String getTextFieldEmail() {
        return fieldEmail.getValue();
    }


    //Проверяем доступность поля ввода номера телефона
    public boolean isDisplayedFieldPhoneNumber() {
        return fieldPhoneNumber.isDisplayed();
    }
    //Заполняем поле ввода номера телефона
    public HomePage fillFieldPhoneNumber(String phoneNumber) {
        fieldPhoneNumber.scrollTo().setValue(phoneNumber);
        return this;
    }
    //Проверяем, что поле ввода номера телефона
    public String getTextFieldPhoneNumber() {
        return fieldPhoneNumber.getValue();
    }


    //Проверяем доступность поля ввода названия компании
    public boolean isDisplayedFieldCompanyName() {
        return fieldCompanyName.isDisplayed();
    }
    //Заполняем поле ввода названия компании
    public HomePage fillFieldCompanyName(String companyName) {
        fieldCompanyName.scrollTo().setValue(companyName);
        return this;
    }
    //Проверяем, что поле ввода названия компании
    public String getTextFieldCompanyName() {
        return fieldCompanyName.getValue();
    }


    //Проверяем доступность кнопки утвердить
    public boolean isDisplayedButtonSubmit() {
        return buttonSubmit.isDisplayed();
    }
    public HomePage clickButtonSubmit() {
        buttonSubmit.scrollTo().click();
        return this;
    }

}
