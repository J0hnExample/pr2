package de.bht.pr2.lab03.BookTypes;

import java.util.Objects;

public class AudioBook extends Book{
    private String abspielmodus = "";


    public AudioBook(String titel, String buchTyp, double preis, int auflage, String abspielmodus) {
        super(titel, buchTyp, preis, auflage);
        this.abspielmodus = abspielmodus;

    }

    public String getAbspielmodus() {
        return abspielmodus;
    }

    public void setAbspielmodus(String abspielmodus) {
        this.abspielmodus = abspielmodus;
    }


}
