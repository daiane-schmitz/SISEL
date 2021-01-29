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
        return nomeUsuario.getText();
    }

    public boolean isUserNameAdilson(){
        return getUserName().contains("ADILSON");
    }

    public void clickMaterialBtn(){
        materialBtn.click();
    }

    public void clickLogoff(){
        sairBtn.click();
    }
}
