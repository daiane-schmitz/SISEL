package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(css = "div:nth-child(1) > input")
    public WebElement user;

    @FindBy(css = "div:nth-child(2) > input")
    public WebElement password;

    @FindBy(css = "div > button")
    public WebElement loginBtn;
}
