import org.testng.annotations.Test;
import pSight.pages.HomePage;

public class SearchTest extends BaseTestClass {
  //code from another person

    HomePage homePage = new HomePage();

    @Test
    public void basicFilterByTest() {
        homePage.search("Java");
    }
}
