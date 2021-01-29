package pageObjects;

import elementMapper.MaterialDetailsElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class MaterialDetails extends MaterialDetailsElementMapper {

    public MaterialDetails() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextMaterialDetails(){
        return detalhesDoMaterial.getText();
    }

    public boolean isMaterialDetails(){
        return getTextMaterialDetails().contains("Material");
    }

    public void fillItemCode(){
        codigoItem.sendKeys("1234");
    }

    public void fillStandardizedName(){
        nomePadronizado.sendKeys("Nome");
    }

    public void fillItemDescription(){
        descricaoDoItem.sendKeys("descrição do item");
    }

    public void selectUnity(){
        Select selectMaterialElement = new Select(unidade);
        selectMaterialElement.selectByValue("1");
    }

    public void fillAmount() {
        quantidade.sendKeys("10");
    }

    public void fillEquityNumber(){
        numeroDoPatrimonio.sendKeys("123");
    }

    public void clickSalvarBtn(){
        salvarBtn.click();
    }

    public void fillOperationalPosition(){
        posicaoOperacional.sendKeys("posição operacional");
    }

    public void fillSerialNumber(){
        numDeSerie.sendKeys("123456");
    }

    public void checkNotOil(){
        naoPossuiOleo.click();
    }

    public void checkDeactivationOMDD(){
        tipoDesativacaoOMDD.click();
    }

    public void fillDeactivationDescription(){
        descricaoTipoDesativacao.sendKeys("Descrição");
    }
}
