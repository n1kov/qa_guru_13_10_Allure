package qa.guru;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AnnotationStepsTest extends BaseTest {

    @Test
    @DisplayName("Test with annotation @Step")
    public void annotatedStepsTest() {
        AnnotationSteps annotationSteps = new AnnotationSteps();

        annotationSteps.openMainPage();
        annotationSteps.searchRepository(REPOSITORY_NAME);
        annotationSteps.openRepositoryLink(REPOSITORY_NAME);
        annotationSteps.openIssueTab();
        annotationSteps.checkIssueNumber(ISSUE_NUMBER);
    }
}