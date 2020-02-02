package com.it.helpers;

import com.it.letters.Letter;
import com.it.pages.ViewLetterPage;

public class ViewLetterHelper extends ViewLetterPage {
    public Letter getLetter() {
        return new Letter(
                getLetterReceiverAddress(),
                getLetterSubject(),
                getLetterBody()
        );
    }
}
