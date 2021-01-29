package pageObjects;

import elementMapper.MaterialPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class MaterialPage extends MaterialPageElementMapper {

    public MaterialPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextMaterial(){
        return material.getText();
    }

    public boolean isMaterialPage(){
        return getTextMaterial().contains("Materiais");
    }

    public void addMaterial(){
        addMaterialBtn.click();
    }


}
