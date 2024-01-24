package de.bht.pr2.lab03.BookTypes;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String titel = "";
    private String buchTyp = "";
    private double preis = 0;
    private int auflage = 0;

    public Book(String titel, String buchTyp, double preis, int auflage) {
        this.titel = titel;
        this.buchTyp = buchTyp;
        this.preis = preis;
        this.auflage = auflage;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBuchTyp() {
        return buchTyp;
    }

    public void setBuchTyp(String buchTyp) {
        this.buchTyp = buchTyp;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAuflage() {
        return auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return auflage == book.auflage && Objects.equals(titel, book.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, auflage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", buchTyp='" + buchTyp + '\'' +
                ", preis=" + preis +
                ", auflage=" + auflage +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        final int i = this.getTitel().compareTo(o.getTitel());
        if(i != 0){
            return i;
        }

        final int j = Integer.compare(this.getAuflage(), o.getAuflage());
        if ( j != 0){
            return j;
        }
        else {
            return 0;
        }

    }
}
