package qa.guru;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest extends BaseTest {

    @DisplayName("Simple Selenide test")
    @Test
    public void testGithubIssueSearch() {
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPOSITORY_NAME);
        $(".header-search-input").submit();

        $(linkText(REPOSITORY_NAME)).click();
        $(partialLinkText("Issues")).click();
        $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);

    }
}
