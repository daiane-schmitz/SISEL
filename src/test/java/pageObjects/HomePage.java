package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextPrincipal(){
        return principal.getText();
    }

    public String getUserName(){
        return userName.getText();
    }

    public boolean isUserNameAdilson(){
        return getUserName().contains("ADILSON");
    }
}
