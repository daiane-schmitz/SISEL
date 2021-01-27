package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void fillUser(){
        user.sendKeys("hamme012");
    }

    public void fillPassword(){
        password.sendKeys("Chesf2020");
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void login(){
        fillUser();
        fillPassword();
        clickLoginBtn();
    }
}
