package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {

    private By _registerButton = By.className("ico-register");
    private By _communityPollGoodButton = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _communityPollVoteButton = By.xpath("//button[@id=\"vote-poll-1\"]");
    private By _actualCommunityPollExcellentVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[1])");
    private By _actualCommunityPollGoodVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[2])");
    private By _actualCommunityPollPoorVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[3])");
    private By _actualCommunityPollVeryBadVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[4])");
    private By _actualCommunityPollVoteCountMessage = By.xpath("//span[contains(@class,\"poll-total\")]");


    //Click on register button
    public void clickOnRegisterButton() {
        clickTheElement(_registerButton);

    }

//    public void captureActualVoteMessage_RegisteredUser() {
//        String expectedTotalVoteCountMessage = "18 votes";
//        // Capturing the text on Vote poll for registered customers
//        explicitWait_InvisibilityOfElementLocated(_communityPollVoteButton);
//        explicitWait_VisibilityOfElementLocated(_actualCommunityPollVoteCountMessage);
//        explicitWait_ElementToBeClickable(_actualCommunityPollExcellentVoteMessage);
//        String actualVoteExcellentMessage = getTextFromElement(_actualCommunityPollExcellentVoteMessage);
//        String actualVoteGoodMessage = getTextFromElement(_actualCommunityPollGoodVoteMessage);
//        String actualVotePoorMessage = getTextFromElement(_actualCommunityPollPoorVoteMessage);
//        String actualVoteVeryBadMessage = getTextFromElement(_actualCommunityPollVeryBadVoteMessage);
//        String actualCountMessage = getTextFromElement(_actualCommunityPollVoteCountMessage);
//
//        // Printing the message displayed to registered user on vote poll
//        System.out.println("Message displayed to registered user after vote poll: ");
//        System.out.println("Actual message for Excellent Vote: " + actualVoteExcellentMessage) ;
//        System.out.println("Actual message for Good Vote: " + actualVoteGoodMessage);
//        System.out.println("Actual message for Poor Vote: " + actualVotePoorMessage);
//        System.out.println("Actual message for Very bad Vote: " + actualVoteVeryBadMessage);
//        System.out.println("Total no of votes: " + actualCountMessage);
//        Assert.assertEquals(actualCountMessage, expectedTotalVoteCountMessage, "Community poll is not giving the correct count for registered users vote");

//    }

}
