package com.it.tests;

import com.it.letters.Letter;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyTest extends BaseTest {
    @Test
    public void test1() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);

        app.dashboard.clickCreateLetterButton();
        app.createLetter.create(letterToMyself);

        app.dashboard.clickInboxButton();
        app.dashboard.clickRowFirstNewLetter();
        Assert.assertEquals(app.viewLetter.getLetter(), letterToMyself);
    }
}
