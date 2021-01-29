package pageObjects;

import elementMapper.NewMaterialElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class NewMaterial extends NewMaterialElementMapper {

    public NewMaterial() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    public void selectMaterialCategorySucata(){
        Select selectMaterialElement = new Select(categoriaDoMaterial);
        selectMaterialElement.selectByValue("3");
    }

    public void selectMaterialCategoryEquipamento(){
        Select selectMaterialElement = new Select(categoriaDoMaterial);
        selectMaterialElement.selectByValue("4");
    }

    public void selectMaterialTypeMetalica(){
        Select selectMaterialElement = new Select(tipoDoMaterial);
        selectMaterialElement.selectByValue("3");
    }

    public void selectMaterialTypeDisjuntor(){
        Select selectMaterialElement = new Select(tipoDoMaterial);
        selectMaterialElement.selectByValue("8");
    }

    public void selectMaterialSubtype(){
        Select selectMaterialElement = new Select(subTipoDoMaterial);
        selectMaterialElement.selectByValue("14");
    }

    public void selectInstallation(){
        Select selectMaterialElement = new Select(instalacao);
        selectMaterialElement.selectByValue("1");
    }

    public void selectLinking(){
        Select selectMaterialElement = new Select(vinculacao);
        selectMaterialElement.selectByValue("2");
    }

    public void selectDestinationAlienation(){
        Select selectMaterialElement = new Select(destinacao);
        selectMaterialElement.selectByValue("3");
    }

    public void selectDestinationStock(){
        Select selectMaterialElement = new Select(destinacao);
        selectMaterialElement.selectByValue("2");
    }

    public void fillJustification(){
        justificativa.sendKeys("Justificativa");
    }

    public void checkLocation(){
        localAlienacao.click();
    }

    public void selectInstallationAlienation(){
        Select selectMaterialElement = new Select(instalacaoAlienacao);
        selectMaterialElement.selectByValue("4");
    }

    public void selectInstallationStock(){
        Select selectMaterialElement = new Select(instalacaoEstoque);
        selectMaterialElement.selectByValue("4");
    }

    public void fillStaffRemoval(){
        equipeNecessariaParaRemocao.sendKeys("Equipe");
    }

    public void fillInfrastructureRemoval(){
        infrastruturaNecessariaParaRemocao.sendKeys("Infraestrutura");
    }

    public void fillRemovalCost(){
        custoAproximadoRemocao.sendKeys("100000");
    }

    public void selectSituation(){
        Select selectSituation= new Select(situacao);
        selectSituation.selectByValue("true");
    }

    public void clickPlusBtn(){
        plusBtn.click();
    }

    public void clickSaveBtn(){
        salvarBtn.click();
    }

    public String getTextAdicionado(){
        return adicionado.getText();
    }

    public boolean isTextAdicionado(){
        return getTextAdicionado().equals("Adicionado!");
    }

    public void clickOKBtn(){
        okBtn.click();
    }


}
