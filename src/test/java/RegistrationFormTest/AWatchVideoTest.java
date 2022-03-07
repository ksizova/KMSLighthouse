package RegistrationFormTest;

import PageObject.HomePage;
import PageObject.YouTubePage;
import org.junit.Before;
import org.junit.Test;

import static PageObject.YouTubePage.URLVIDEO;
import static PageObject.YouTubePage.nameVideoOnYouTube;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AWatchVideoTest {

    @Before
    public void clearCache() {
        clearBrowserCache();
    }

    @Test
    public void awatchVideoTest() {

        //Создаем экземпляр главной страницы
        HomePage homePage;
        homePage = open(HomePage.URL, HomePage.class);
        homePage.waitPopUpWithVideo();
        assertEquals("Ссылка внутри тега 'hfer' не соответствует заданному", URLVIDEO, homePage.getAtributeLinkVideo());


        YouTubePage youTubePage;
        youTubePage = open(URLVIDEO, YouTubePage.class);
        assertTrue("Название видео не определяется на странице.", youTubePage.isDisplayedNameOfVideo());
        assertEquals("Название видео не соответствует ожидаемому 'GE Healthcare: A KMS Lighthouse Success Story'", nameVideoOnYouTube, youTubePage.getTextNameOfVideo());
    }

}
