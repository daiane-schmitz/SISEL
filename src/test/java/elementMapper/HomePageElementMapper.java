package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(css = "div.navbar-wrapper > a")
    public WebElement principal;

    @FindBy(id = "elementNavigation")
    public WebElement nomeUsuario;

    @FindBy(css =  "div.sidebar-wrapper > ul > li:nth-child(2) > a > p")
    public WebElement materialBtn;

    @FindBy(css = "#elementNavigation > ul > li:nth-child(3) > a > i")
    public WebElement sairBtn;
}
