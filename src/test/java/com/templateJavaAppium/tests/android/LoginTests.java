package com.templateJavaAppium.tests.android;
import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.LoginFlows;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginTests extends TestBaseAndroid {

    LoginFlows loginFlow;
    ExcelUtils excelUtils;

    @DataProvider(name = "Users")
    public Object[][] loginValidoXlsx() throws Exception {

        excelUtils = new ExcelUtils(System.getProperty("user.dir")+"\\src\\test\\java\\com\\templateJavaAppium\\resources\\loginInvalido.xlsx","Users");
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

        Assert.assertEquals("You are logged on as admin", message);
    }

    @Test(dataProvider = "Users",priority = 1, description = "teste de login invalido pegando valores do Excel")
    public void loginInvalido(String nome, String senha) {

        loginFlow = new LoginFlows();
        loginFlow.goToLoginPage();
        String message = loginFlow.login(nome, senha);

        Assert.assertEquals("You gave me the wrong username and password", message);
    }


}