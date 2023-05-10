package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){

        //Click on register button
        homePage.clickOnRegisterButton();
        // Fill registration details
        registerPage.enterRegistrationDetails();
        // Verify registration successful or not
        registerResultPage.verifyUserRegisteredSuccessfully();


    }


}
