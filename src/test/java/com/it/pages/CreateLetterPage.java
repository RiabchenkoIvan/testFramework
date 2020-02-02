package com.it.pages;

import com.it.letters.Letter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateLetterPage extends BasePage {
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement letterReceiverAddress;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement letterSubject;

    @FindBy(xpath = "//div[@class='text_editor_browser']//textarea[@name='body']")
    private WebElement letterBody;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonSubmitLetter;

    public void create(Letter letter) {
        letterReceiverAddress.sendKeys(letter.letterReceiverAddress);
        letterSubject.sendKeys(letter.letterSubject);
        letterBody.sendKeys(letter.letterBody);
        buttonSubmitLetter.click();
    }
}
