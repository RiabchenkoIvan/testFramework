package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewLetterPage extends BasePage{
	@FindBy(css=".message_container .message_header.clear h3")
	private WebElement letterSubject;
	@FindBy(css=".to .field_value")
	private WebElement letterReceiverAddress;
	@FindBy(css=".message_body pre")
	private WebElement letterBody;

    public String getLetterSubject() {
        return letterSubject.getText();
    }

    public String getLetterReceiverAddress() {
        return letterReceiverAddress.getText();
    }

    public String getLetterBody() {
        return letterBody.getText();
    }
}
