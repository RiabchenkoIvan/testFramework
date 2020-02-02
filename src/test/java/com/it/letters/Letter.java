package com.it.letters;

import java.util.Objects;

public class Letter {
    public String letterReceiverAddress;
    public String letterSubject;
    public String letterBody;

    @Override
    public String toString() {
        return "Letter{" +
                "letterReceiverAddress='" + letterReceiverAddress + '\'' +
                ", letterSubject='" + letterSubject + '\'' +
                ", letterBody='" + letterBody + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(letterReceiverAddress, letter.letterReceiverAddress) &&
                Objects.equals(letterSubject, letter.letterSubject) &&
                Objects.equals(letterBody, letter.letterBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterReceiverAddress, letterSubject, letterBody);
    }

    public Letter(String letterReceiverAddress, String letterSubject, String letterBody) {
        this.letterReceiverAddress = letterReceiverAddress;
        this.letterSubject = letterSubject;
        this.letterBody = letterBody;
    }
}
