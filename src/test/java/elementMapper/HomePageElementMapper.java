package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(css = "div.navbar-wrapper > a")
    public WebElement principal;
}
