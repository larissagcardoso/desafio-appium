package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.AlertsFlows;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertsTests extends TestBaseAndroid {

    AlertsFlows alertsFlows;

    @Test (priority = 1, description = "Verifica Mensagem Alerta")
    public void verificaMsgAlerta (){

        alertsFlows = new AlertsFlows();

        alertsFlows.goToAlertsPage();
        String mensagem = alertsFlows.VerificaMensagemAlerta();
        Assert.assertEquals("This is the alert message",mensagem);
    }

}
