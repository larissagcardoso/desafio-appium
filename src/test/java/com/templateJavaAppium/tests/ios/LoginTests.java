package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.flows.LoginFlows;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginTests extends TestBaseIOS {

    LoginFlows loginFlow;
    ExcelUtils excelUtils;

   @DataProvider(name = "Users")
    public Object[][] loginValidoXlsx() throws Exception {
        String separator = System.getProperty("file.separator");
        excelUtils = new ExcelUtils(System.getProperty("user.dir")+separator+"src"+separator+"test"+separator+"java"+separator+"com"+separator+"templateJavaAppium"+separator+"resources"+separator+"loginInvalido.xlsx","Users");
        ArrayList<Object[]> dataList = new ArrayList<Object[]>();

        int i = 1;// excluding header row
        int totalRows = 3;// the row number of data in the sheet
        while (i < totalRows) {
            System.out.println("Users : line : " + i);

            Object[] dataLine = new Object[2];

            dataLine[0] = excelUtils.getCell(i, 0);// nome
            dataLine[1] = excelUtils.getCell(i, 1);// senha

            dataList.add(dataLine);

            i++;
        }

        Object[][] data = new Object[dataList.size()][];
        for (i = 0; i < dataList.size(); i++)
            data[i] = dataList.get(i);

        return data;

    }



    @Test(priority = 1, description = "teste de login valido")
    public void loginTest() {
        String username = "admin";
        String password = "password";

        loginFlow = new LoginFlows();
        loginFlow.goToLoginPage();
        String message = loginFlow.login(username, password);

        Assert.assertEquals("Logged in as admin", message);
    }

    @Test(dataProvider = "Users", description = "teste de login invalido pegando valores do Excel")
    public void loginInvalido(String nome, String senha) {

        loginFlow = new LoginFlows();
        loginFlow.goToLoginPage();
        String message = loginFlow.login(nome, senha);

        Assert.assertEquals("PERMISSION DENIED", message);
    }


}