package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.*;
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
    @Story("Entrar na página de materiais")
    public void testEnterMaterialPage(){
        HomePage homePage = new HomePage();
        MaterialPage materialPage = new MaterialPage();

        testLogin();
        homePage.clickMaterialBtn();
        assertTrue(materialPage.isMaterialPage());
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/material-list")));
    }


    @Test
    @Story("Adicionar novo material: Sucata")
    public void testAddMaterialSucata(){
        MaterialPage materialPage = new MaterialPage();
        NewMaterial newMaterial = new NewMaterial();
        MaterialDetails materialDetails = new MaterialDetails();

        testEnterMaterialPage();

        materialPage.addMaterial();
        newMaterial.selectMaterialCategorySucata();
        newMaterial.selectMaterialTypeMetalica();
        newMaterial.selectMaterialSubtype();
        newMaterial.selectInstallation();
        newMaterial.selectLinking();
        newMaterial.selectDestinationAlienation();
        newMaterial.fillJustification();
        newMaterial.checkLocation();
        newMaterial.selectInstallationAlienation();
        newMaterial.fillStaffRemoval();
        newMaterial.fillInfrastructureRemoval();
        newMaterial.fillRemovalCost();
        newMaterial.selectSituation();


        newMaterial.clickPlusBtn();


        materialDetails.fillItemCode();
        materialDetails.fillStandardizedName();
        materialDetails.fillItemDescription();
        materialDetails.selectUnity();
        materialDetails.fillAmount();
        materialDetails.clickSalvarBtn();


        newMaterial.clickSaveBtn();
        assertTrue(newMaterial.isTextAdicionado());
        newMaterial.clickOKBtn();
    }

    @Test
    @Story("Adicionar novo material: Equipamento - Com detalhes")
    public void testAddMaterialEquipamento() {
        MaterialPage materialPage = new MaterialPage();
        NewMaterial newMaterial = new NewMaterial();
        MaterialDetails materialDetails = new MaterialDetails();

        testEnterMaterialPage();

        //Adicionar material
        materialPage.addMaterial();
        newMaterial.selectMaterialCategoryEquipamento();
        newMaterial.selectMaterialTypeDisjuntor();
        newMaterial.selectInstallation();
        newMaterial.selectDestinationStock();
        newMaterial.fillJustification();
        newMaterial.selectInstallationStock();


       //Clicar no + para ir para os detalhes ------ não salva quando adicionados os detalhes
        newMaterial.clickPlusBtn();


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


        newMaterial.fillStaffRemoval();
        newMaterial.fillInfrastructureRemoval();
        newMaterial.fillRemovalCost();
        newMaterial.selectSituation();


        //Salvar
        newMaterial.clickSaveBtn();
        assertTrue(newMaterial.isTextAdicionado());
        newMaterial.clickOKBtn();
    }

    @Test
    @Story("Pesquisar por palavra-chave")
    public void testSearchByKeyWord(){
        MaterialPage materialPage = new MaterialPage();

        testEnterMaterialPage();
        materialPage.SearchKeyWord();
        materialPage.ClickSearchBtn();

        //não consigo fazer assert porque a palavra não aparece nas pesquisas (evidência do allure é mais útil)
    }

    @Test
    @Story("Pesquisar por local")
    public void testSearchByLocation(){
        MaterialPage materialPage = new MaterialPage();

        testEnterMaterialPage();
        materialPage.SearchLocation();
        materialPage.ClickSearchBtn();
        assertTrue(materialPage.isLocalDeTestesUm());
    }

    @Test
    @Story("Pesquisar por categoria")
    public void testSearchByCategory(){
        MaterialPage materialPage = new MaterialPage();

        testEnterMaterialPage();
        materialPage.SearchCategory();
        materialPage.ClickSearchBtn();
        assertTrue(materialPage.isCategoryEquipamento());
    }

    @Test
    @Story("Pesquisar por situação")
    public void testSearchBySituation(){
        MaterialPage materialPage = new MaterialPage();

        testEnterMaterialPage();
        materialPage.SearchSituation();
        materialPage.ClickSearchBtn();
        //não consigo fazer assert porque a palavra não aparece nas pesquisas (evidência do allure é mais útil)
    }


    @Test
    @Story("Atualizar a página")
    public void testUpdatePageMaterialPage(){
        MaterialPage materialPage = new MaterialPage();

        testSearchByCategory();
        materialPage.clickUpdateBtn();
        //não consigo fazer assert
    }


    @Test
    @Story("Fazer logoff")
    public void testLogoff(){
        HomePage homePage = new HomePage();

        testLogin();
        homePage.clickLogoff();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("#/login")));
    }


}
