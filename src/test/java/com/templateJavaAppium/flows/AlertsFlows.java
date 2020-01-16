package com.templateJavaAppium.flows;
import com.templateJavaAppium.pages.AlertsPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.StartPage;

public class AlertsFlows {

        private StartPage startPage;
        private MenuPage menuPage;
        private AlertsPage alertsPage;

        public AlertsFlows() {
            startPage = new StartPage();
            menuPage = new MenuPage();
        }

    public void goToAlertsPage()
    {
        startPage.clickMenu();
        menuPage.clickAterts();
    }

    public String VerificaMensagemAlerta()
    {
         alertsPage = new AlertsPage();
         alertsPage.clickAlerta();
          return alertsPage.getMessageText();
    }

    public String VerificaMensagemModal()
    {
        alertsPage = new AlertsPage();
        alertsPage.clickToast();
        return alertsPage.getMessageModal();
    }
}


