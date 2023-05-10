package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@name=\"Password\"]");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.name("register-button");


    public void enterRegistrationDetails() {
        // Type first name
        typeText(_firstName,"TestFirstName");
        // Type last name
        typeText(_lastName, "TestLastName");
        // Type email
        typeText(_email, "TestEmail" + timestamp() + "@gmail.com");
        // Type password
        typeText(_password, "test1234");
        // Type confirm password
        typeText(_confirmPassword, "test1234");
        // Click on register button
        clickTheElement(_registerButton);
    }
}
