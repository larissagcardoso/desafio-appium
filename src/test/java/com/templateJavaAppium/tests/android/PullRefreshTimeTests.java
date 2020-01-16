package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.PullRefreshTimePage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PullRefreshTimeTests extends TestBaseAndroid {

    PullRefreshTimePage pullRefreshTimePage;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;


    @Test(priority = 1, description = "Atualizando tela e verificando formato hora exibido")
    public void atualizaPullToRefresh() {

        pullRefreshTimePage = new  PullRefreshTimePage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();


        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuPullToRefresh();
        pullRefreshTimePage.pullToRefresh();

        Assert.assertTrue(pullRefreshTimePage.getDisplayText().matches("\\d{2}:\\d{2}:\\d{2} (AM|PM)"));
    }
}
