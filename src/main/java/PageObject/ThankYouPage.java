package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ThankYouPage {

    //Локатор "Thank you for singing up! We will be in touch with you shortly"
    @FindBy(how = How.XPATH, using = ".//h1[@class='elementor-heading-title elementor-size-small']")
    private SelenideElement thankYouPage;

    //Ожидаем появление локатора
    public ThankYouPage visibleThankYouPage() {
        thankYouPage.shouldBe(Condition.enabled);
        return this;
    }

    //Проверяем, доступен ли локатор
    public boolean isDisplayedThankYouPage() {
        return thankYouPage.isDisplayed();
    }

}
