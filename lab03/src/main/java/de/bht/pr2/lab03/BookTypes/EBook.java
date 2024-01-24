package de.bht.pr2.lab03.BookTypes;

import java.util.Objects;

public class EBook extends Book{

    private String eBookVersion = "";

    public EBook(String titel, String buchTyp, double preis, int auflage, String eBookVersion) {
        super(titel, buchTyp, preis, auflage);
        this.eBookVersion = eBookVersion;
    }

    public String geteBookVersion() {
        return eBookVersion;
    }

    public void seteBookVersion(String eBookVersion) {
        this.eBookVersion = eBookVersion;
    }



}
