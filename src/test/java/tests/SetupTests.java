package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
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


}
