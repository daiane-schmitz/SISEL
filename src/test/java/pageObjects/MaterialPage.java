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

    public void SearchKeyWord(){
        campoPesquisar.sendKeys("teste");
    }

    public void SearchLocation(){
        Select selectLocation = new Select(localPesquisa);
        selectLocation.selectByValue("1");
    }

    public void SearchCategory(){
        Select selectCategory = new Select(categoriaPesquisa);
        selectCategory.selectByValue("4");
    }

    public void SearchSituation(){
        Select selectSituation = new Select(situacaoPesquisa);
        selectSituation.selectByValue("true");
    }

    public void ClickSearchBtn(){
        pesquisarBtn.click();
    }

    public String getTextLocalDeTestesUm(){
        return localDeTestesUm.getText();
    }

    public boolean isLocalDeTestesUm(){
        return getTextLocalDeTestesUm().equals("Local de testes 1");
    }

    public String getTextEquipamento(){
        return categoriaEquipamento.getText();
    }

    public boolean isCategoryEquipamento(){
        return getTextEquipamento().equals("Equipamento");
    }

}
