package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.GesturesPage;


public class GesturesFlows {

    private GesturesPage gesturesPage;

    public GesturesFlows (){
        gesturesPage = new GesturesPage();

    }

    public String realizarFling(){
        gesturesPage.flingGesture();
        return gesturesPage.getUltimaAcao();

    }

    public String realizarLong(){
        gesturesPage.longPress();
        return gesturesPage.getUltimaAcao();

    }

    public String realizarTap(){
        gesturesPage.singlePress();
        return gesturesPage.getUltimaAcao();

    }
}
