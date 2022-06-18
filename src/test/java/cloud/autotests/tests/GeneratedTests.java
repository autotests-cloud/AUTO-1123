package cloud.autotests.tests;

import cloud.autotests.config.ProjectConfig;
import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
    String baseUrl = config.baseUrl();
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка страницы услуг")
    void serviceCheck() {
        step("Open url '" + baseUrl + "'", () ->
                open(baseUrl));

        step("click Услуги", () ->
                $(byText("Услуги")).click());

        step("check header", () -> {
            $(".head-cont").shouldHave(text("Услуги"));
        });
    }

    @ParameterizedTest(name = "Проверка страницы услуги {0}")
    @CsvSource(value = {
            "BigData"
    })
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка страниц услуг")
    void servicesCheck(String service) {
        step("Open url '" + baseUrl + "'", () ->
                open(baseUrl));

        step("click Услуги", () ->
                $(byText("Услуги")).click());

        step("click " + service, () ->
                $(".b_block").$(byText(service)).click());

        step("check header", () -> {
            $(".head-cont").shouldHave(text(service));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url '" + baseUrl + "'", () ->
                open(baseUrl));

        step("Page title should have text '«Т1 Консалтинг»'", () -> {
            String expectedTitle = "«Т1 Консалтинг»";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url '" + baseUrl + "'", () ->
                open(baseUrl));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}