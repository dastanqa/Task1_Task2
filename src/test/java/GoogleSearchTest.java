import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class GoogleSearchTest {
    @BeforeTest
    public void openGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ENVY\\IdeaProjects\\2\\IdeaProjects\\DianaTask\\src\\main\\resources\\drivers\\chromedriver.exe");
        Selenide.open("https://www.google.com");
    }

    @Test
    public void test2() {
        // Search by Name (e.g., "OpenAI")
        $(By.name("q")).val("OpenAI").pressEnter();

        // Validate the search results
        // In this example, we assert that at least one search result is displayed
        $$("#search .g").shouldHave(CollectionCondition.sizeGreaterThan(0), Duration.ofSeconds(10));

        // Hover over the search input field and check the tooltip
        $(By.name("q")).hover();
        $(By.xpath("//a[@href='https://openai.com/']/h3")).waitUntil(Condition.visible, 5000);


        // Click on the Google logo in the top left
        // $(By.xpath("//div[@class='logo']")).shouldBe(visible);
        $(By.xpath("//div[@class='logo']")).click();

        // Validate the empty results area
        // In this example, we assert that the search results container is not visible
        $("#search").shouldNotBe(visible);
    }
}
