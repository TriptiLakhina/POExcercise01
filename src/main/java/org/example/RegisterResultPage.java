package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    static String expectedRegistrationCompleteMsg = "Registration Completed";
    private By _registerConfirmationMessage = By.xpath("//div[@class=\"result\"]");


    public void verifyUserRegisteredSuccessfully(){
        // Get text from Element
        String actualRegistrationCompleteMessage = getTextFromElement(_registerConfirmationMessage);
        // Assert to verify the actual message and expected message
        Assert.assertEquals(actualRegistrationCompleteMessage, expectedRegistrationCompleteMsg, "Your registration is not working");


    }
}
