package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.flows.AlertsFlows;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertsTests extends TestBaseIOS {

    AlertsFlows alertsFlows;

    @Test (priority = 1, description = "Clicar em alerta e Verifica Mensagem Alerta")
    public void verificarMsgAlerta (){

        alertsFlows = new AlertsFlows();

        alertsFlows.goToAlertsPage();
        String mensagem = alertsFlows.VerificaMensagemAlerta();
        Assert.assertEquals("This is an alert",mensagem);
    }

    @Test (priority = 1, description = "Clicar em alerta e Verifica Mensagem Modal")
    public void verificarMsgModal (){

        alertsFlows = new AlertsFlows();

        alertsFlows.goToAlertsPage();
        String mensagem = alertsFlows.VerificaMensagemModal();
        Assert.assertEquals("This is a modal view",mensagem);
    }

}
