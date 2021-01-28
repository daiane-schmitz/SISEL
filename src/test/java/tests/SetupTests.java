package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MaterialDetails;
import pageObjects.MaterialPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

@Feature("Testes do SISEL")
public class SetupTests extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
    }

    @Test
    @Story("Logar com sucesso")
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login();
        assertTrue(homePage.getTextPrincipal().equals("Principal"));
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/home")));
    }

    @Test
    @Story("Verificar usuário logado")
    public void testUserName() {
        HomePage homePage = new HomePage();

        testLogin();
        assertTrue(homePage.isUserNameAdilson());
    }

    @Test
    @Story("Adicionar novo material: Sucata")
    public void testAddMaterialSucata(){
        HomePage homePage = new HomePage();
        MaterialPage materialPage = new MaterialPage();

        testLogin();
        homePage.clickMaterialBtn();
        assertTrue(materialPage.isMaterialPage());
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/material-list")));
        materialPage.addMaterial();
        materialPage.selectMaterialCategorySucata();
        materialPage.selectMaterialTypeMetalica();
        materialPage.selectMaterialSubtype();
        materialPage.selectInstallation();
        materialPage.selectLinking();
        materialPage.selectDestinationAlienacao();
        materialPage.fillJustification();
        materialPage.checkLocation();
        materialPage.selectInstallationWarehouse();
        materialPage.fillStaffRemoval();
        materialPage.fillInfrastructureRemoval();
        materialPage.fillRemovalCost();
        materialPage.selectSituation();
        materialPage.clickSaveBtn();
        assertTrue(materialPage.isTextAdicionado());
        materialPage.clickOKBtn();
    }

    @Test
    @Story("Adicionar novo material: Equipamento")
    public void testAddMaterialEquipamento() {
        HomePage homePage = new HomePage();
        MaterialPage materialPage = new MaterialPage();
        MaterialDetails materialDetails = new MaterialDetails();

        testLogin();
        homePage.clickMaterialBtn();
        assertTrue(materialPage.isMaterialPage());
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/material-list")));

        //Adicionar material
        materialPage.addMaterial();
        materialPage.selectMaterialCategoryEquipamento();
        materialPage.selectMaterialTypeDisjuntor();
        materialPage.selectInstallation();
        materialPage.selectDestinationEstoque();
        materialPage.fillJustification();
        materialPage.selectInstallationWarehouse();
        materialPage.fillStaffRemoval();
        materialPage.fillInfrastructureRemoval();
        materialPage.fillRemovalCost();
        materialPage.selectSituation();

        //Clicar no + para ir para os detalhes
        materialPage.clickPlusBtn();


        materialDetails.fillItemCode();
        materialDetails.fillStandardizedName();
        materialDetails.fillItemDescription();
        materialDetails.selectUnity();
        materialDetails.fillAmount();
        materialDetails.fillOperationalPosition();
        materialDetails.fillSerialNumber();
        materialDetails.checkNotOil();
        materialDetails.checkDeactivationOMDD();
        materialDetails.fillDeactivationDescription();
        materialDetails.clickSalvarBtn();


        //Salvar
        materialPage.clickSaveBtn();
        assertTrue(materialPage.isTextAdicionado());
        materialPage.clickOKBtn();
    }


}
