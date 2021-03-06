package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMaterialElementMapper {

    @FindBy(css = "div:nth-child(1) > div:nth-child(1) > select")
    public WebElement categoriaDoMaterial;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(2) > select")
    public WebElement tipoDoMaterial;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(3) > select")
    public WebElement subTipoDoMaterial;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(1) > select")
    public WebElement instalacao;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(2) > select")
    public WebElement vinculacao;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(3) > select")
    public WebElement destinacao;

    @FindBy(css = "#collapseOne > div > div:nth-child(3) > div > div > input")
    public WebElement justificativa;

    @FindBy(css = "#collapseOne > div > div:nth-child(4) > div > div > div:nth-child(1) > label")
    public WebElement localAlienacao;

    @FindBy(css = "#collapseOne > div > div:nth-child(5) > div > select")
    public WebElement instalacaoAlienacao;

    @FindBy(css = "#collapseOne > div > div:nth-child(4) > div > select")
    public WebElement instalacaoEstoque;

    @FindBy(css = "#headingTwo > span > a")
    public WebElement plusBtn;

    @FindBy(css = "#collapseTwo > div > div:nth-child(1) > div:nth-child(1) > div > input")
    public WebElement equipeNecessariaParaRemocao;

    @FindBy(css = "#collapseTwo > div > div:nth-child(1) > div:nth-child(2) > div > input")
    public WebElement infrastruturaNecessariaParaRemocao;

    @FindBy(css = "#collapseTwo > div > div:nth-child(2) > div:nth-child(1) > div > input")
    public WebElement custoAproximadoRemocao;

    @FindBy(css = "#collapseTwo > div > div:nth-child(2) > div:nth-child(2) > select")
    public WebElement situacao;

    @FindBy(css = "div.right-side > button")
    public WebElement salvarBtn;

    @FindBy(id = "swal2-title")
    public WebElement adicionado;

    @FindBy(css = "body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled")
    public WebElement okBtn;

}
