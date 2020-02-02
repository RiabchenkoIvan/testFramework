package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;

    @FindBy(css = ".make_message")
    private WebElement createLetter;

    @FindBy(css = "a[href*='INBOX']")
    private WebElement buttonInbox;

	@FindBy(xpath="//*[@id='mesgList']//div[@class='row new'][1]")
	private WebElement rowFirstNewLetter;

    public String getLbUserEmail() {
        driver.BASE_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(lbUserEmail));
    return lbUserEmail.getText();
    }

    public void clickCreateLetterButton() {
        createLetter.click();
    }

    public void clickInboxButton() {
        buttonInbox.click();
    }

    public void clickRowFirstNewLetter() {
        rowFirstNewLetter.click();
    }
}
