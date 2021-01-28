package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(css = "div:nth-child(1) > input")
    public WebElement usuario;

    @FindBy(css = "div:nth-child(2) > input")
    public WebElement senha;

    @FindBy(css = "div > button")
    public WebElement entrarBtn;
}
