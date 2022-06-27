package qa.guru;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {


 final String REPOSITORY_NAME = "eroshenkoam/allure-example";
 final Integer ISSUE_NUMBER = 76;


        @BeforeEach
       public void addListener() {
            SelenideLogger.addListener("allure", new AllureSelenide());
        }

        @AfterEach
         void addScreenshot() {
            Screenshots.screenshotAs();
        }
    }


