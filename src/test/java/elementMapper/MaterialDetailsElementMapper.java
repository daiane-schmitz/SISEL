package elementMapper;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialDetailsElementMapper {

    @FindBy(css = "body > ngb-modal-window:nth-child(9) > div > div > app-form-patrimonial-material > div > div.modal-header.justify-content-center > h4")
    public WebElement detalhesDoMaterial;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(1) > div > input")
    public WebElement codigoItem;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(2) > div > input")
    public WebElement nomePadronizado;

    @FindBy(css = "#collapseOne > div > div:nth-child(1) > div:nth-child(3) > input")
    public WebElement descricaoDoItem;

    @FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-form-patrimonial-material/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div[2]/div[1]/select")
    public WebElement unidade;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(2) > input")
    public WebElement quantidade;

    @FindBy(css = "#collapseOne > div > div:nth-child(2) > div:nth-child(3) > div > input")
    public WebElement numeroDoPatrimonio;

    @FindBy(css = "body > ngb-modal-window:nth-child(9) > div > div > app-form-patrimonial-material > div > div.modal-body > div.modal-footer > div.right-side > button")
    public WebElement salvarBtn;

    @FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-form-patrimonial-material/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div[1]/div/input")
    public WebElement posicaoOperacional;

    @FindBy(css = "#collapseOne > div > div:nth-child(3) > div:nth-child(2) > div > input")
    public WebElement numDeSerie;

    @FindBy(css = "#collapseOne > div > div:nth-child(3) > div:nth-child(3) > div > div:nth-child(2) > label")
    public WebElement naoPossuiOleo;

    @FindBy(css = "#collapseOne > div > div:nth-child(4) > div > div > div:nth-child(2) > label")
    public WebElement tipoDesativacaoOMDD;

    @FindBy(css = "#collapseOne > div > div:nth-child(4) > div.col-md-8 > div > input")
    public WebElement descricaoTipoDesativacao;
}
