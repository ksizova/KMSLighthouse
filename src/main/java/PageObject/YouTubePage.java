package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class YouTubePage {

    public static final String URLVIDEO = "https://www.youtube.com/watch?v=yGTsxAY5T0g";

    public static final String nameVideoOnYouTube = "GE Healthcare: A KMS Lighthouse Success Story";

    //Локатор названия видео
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/h1/yt-formatted-string")
    private SelenideElement nameOfVideo;

    //Проверяем, видин ли локатор на странице
    public boolean isDisplayedNameOfVideo() {
        nameOfVideo.shouldBe(visible);
        return nameOfVideo.isDisplayed();
    }

    //Вытаскиваем значение названия в локаторе
    public String getTextNameOfVideo() {
        return nameOfVideo.getText();
    }
}
