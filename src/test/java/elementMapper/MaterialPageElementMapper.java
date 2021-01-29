package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialPageElementMapper {

    @FindBy(id = "elementNav")
    public WebElement material;

    @FindBy(css = "#button-addon4 > button:nth-child(3)")
    public WebElement addMaterialBtn;

    @FindBy(css = "div:nth-child(1) > div.col-md-4 > input")
    public WebElement campoPesquisar;

    @FindBy(css = " div:nth-child(1) > div:nth-child(2) > select")
    public WebElement localPesquisa;

    @FindBy(css = "div:nth-child(1) > div:nth-child(3) > select")
    public WebElement categoriaPesquisa;

    @FindBy(css = "div:nth-child(1) > div.col-md-2 > select")
    public WebElement situacaoPesquisa;

    @FindBy(css = "#button-addon4 > button:nth-child(1)")
    public WebElement pesquisarBtn;

    @FindBy(css = "body > div > app-root > div > div > app-material-list > div > div > div > div > div > div:nth-child(3) > div > label")
    public WebElement localDeTestesUm;

    @FindBy(css = "app-material-list > div > div > div > div > div > div:nth-child(3) > div:nth-child(1) > div > label")
    public WebElement categoriaEquipamento;

}