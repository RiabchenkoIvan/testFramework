package com.it.letters;

import java.util.ResourceBundle;

public class LetterFactory {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("letter");

    public static Letter getLetterToMyself() {
        return new Letter(resourceBundle.getString("letterReceiverAddress"),
                resourceBundle.getString("letterSubject"),
                resourceBundle.getString("letterBody"));
    }
}
