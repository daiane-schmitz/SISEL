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

    public void selectMaterialCategory(){
        Select selectMaterialElement = new Select(materialCategory);
        selectMaterialElement.selectByValue("3");
    }

    public void selectMaterialType(){
        Select selectMaterialElement = new Select(materialType);
        selectMaterialElement.selectByValue("3");
    }

    public void selectMaterialSubtype(){
        Select selectMaterialElement = new Select(materialSubtype);
        selectMaterialElement.selectByValue("14");
    }

    public void selectInstallation(){
        Select selectMaterialElement = new Select(installation);
        selectMaterialElement.selectByValue("1");
    }

    public void selectLinking(){
        Select selectMaterialElement = new Select(linking);
        selectMaterialElement.selectByValue("2");
    }

    public void selectDestination(){
        Select selectMaterialElement = new Select(destination);
        selectMaterialElement.selectByValue("2");
    }

    public void fillJustification(){
        justification.sendKeys("Justificativa");
    }

    public void checkLocation(){
        location.click();
    }

    public void selectInstallationWarehouse(){
        Select selectMaterialElement = new Select(installationWarehouse);
        selectMaterialElement.selectByValue("4");
    }

    public void fillStaffRemoval(){
        staffRemoval.sendKeys("Equipe");
    }

    public void fillInfrastructureRemoval(){
        infrastructureRemoval.sendKeys("Infraestrutura");
    }

    public void fillRemovalCost(){
        removalCost.sendKeys("1000");
    }

    public void selectSituation(){
        Select selectSituation= new Select(situation);
        selectSituation.selectByValue("true");
    }

    public void clickSaveBtn(){
        saveBtn.click();
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
