package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialPageElementMapper {

    @FindBy(id = "elementNav")
    public WebElement material;

    @FindBy(css = "#button-addon4 > button:nth-child(3)")
    public WebElement addMaterialBtn;

    @FindBy(css = "div:nth-child(1) > div:nth-child(1) > select")
    public WebElement materialCategory;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(2) > select")
    public WebElement materialType;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(3) > select")
    public WebElement materialSubtype;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(1) > select")
    public WebElement installation;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(2) > select")
    public WebElement linking;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(3) > select")
    public WebElement destination;

    @FindBy(css = "#collapseOne > div > div:nth-child(3) > div > div > input")
    public WebElement justification;

    @FindBy(css = "#collapseOne > div > div:nth-child(4) > div > div > div:nth-child(1) > label")
    public WebElement location;

    @FindBy(css = "div:nth-child(5) > div > select")
    public WebElement installationWarehouse;

    @FindBy(css = "#collapseTwo > div > div:nth-child(1) > div:nth-child(1) > div > input")
    public WebElement staffRemoval;

    @FindBy(css = "#collapseTwo > div > div:nth-child(1) > div:nth-child(2) > div > input")
    public WebElement infrastructureRemoval;

    @FindBy(css = "#collapseTwo > div > div:nth-child(2) > div:nth-child(1) > div > input")
    public WebElement removalCost;

    @FindBy(css = "#collapseTwo > div > div:nth-child(2) > div:nth-child(2) > select")
    public WebElement situation;

    @FindBy(css = "div.right-side > button")
    public WebElement saveBtn;

    @FindBy(id = "swal2-title")
    public WebElement adicionado;

    @FindBy(css = "button.swal2-confirm.swal2-styled")
    public WebElement okBtn;

}