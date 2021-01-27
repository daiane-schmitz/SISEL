package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
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
    @Story("Adicionar novo material")
    public void testAddMaterial(){
        HomePage homePage = new HomePage();
        MaterialPage materialPage = new MaterialPage();

        testLogin();
        homePage.clickMaterialBtn();
        assertTrue(materialPage.isMaterialPage());
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/material-list")));
        materialPage.addMaterial();
        materialPage.selectMaterialCategory();
        materialPage.selectMaterialType();
        materialPage.selectMaterialSubtype();
        materialPage.selectInstallation();
        materialPage.selectLinking();
        materialPage.selectDestination();
        materialPage.fillJustification();
        materialPage.checkLocation();
        materialPage.selectInstallationWarehouse();
        materialPage.fillStaffRemoval();
        materialPage.fillInfrastructureRemoval();
        materialPage.fillRemovalCost();
        materialPage.selectSituation();
        materialPage.clickSaveBtn();
        assertTrue(materialPage.isMaterialPage());
        materialPage.clickOKBtn();
    }


}
