package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.InputControlsInfoPage;
import com.templateJavaAppium.pages.InputControlsPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputControlsInfoTests extends TestBaseIOS {

    InputControlsPage inputControlsPage;
    InputControlsInfoPage inputControlsCampoInformacaoPage;
    MenuPage menuPage;


    @Test(priority = 1, description = "Teste para entrar na tela mais info e clicar botao")
    public void clicarBotaoMaisInformacao() {

        inputControlsPage = new InputControlsPage();
        inputControlsCampoInformacaoPage = new InputControlsInfoPage();
        menuPage = new MenuPage();

        menuPage.clickInputControls();
        inputControlsPage.swipeSubMenusInput();
        inputControlsCampoInformacaoPage.clicarBtnMaisInformacao();

        Assert.assertEquals("More Info",inputControlsCampoInformacaoPage.getTextoBtnMaisInformacao());
    }


    @Test(priority = 1, description = "entrar tela mais Info e verificar botao visivel na tela")
    public void entrarMaisInfo() {

        inputControlsPage = new InputControlsPage();
        inputControlsCampoInformacaoPage = new InputControlsInfoPage();
        menuPage = new MenuPage();

        menuPage.clickInputControls();
        inputControlsPage.swipeSubMenusInput();

        Assert.assertTrue(inputControlsCampoInformacaoPage.botaoInfoDisplayed());
    }

}
