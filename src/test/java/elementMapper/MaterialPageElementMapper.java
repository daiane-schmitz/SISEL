package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialPageElementMapper {

    @FindBy(id = "elementNav")
    public WebElement material;

    @FindBy(css = "#button-addon4 > button:nth-child(3)")
    public WebElement addMaterialBtn;


}