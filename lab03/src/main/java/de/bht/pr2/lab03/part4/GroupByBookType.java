package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.BookTypes.AudioBook;
import de.bht.pr2.lab03.BookTypes.Book;
import de.bht.pr2.lab03.BookTypes.EBook;
import de.bht.pr2.lab03.Parser.ParseBookTypes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupByBookType {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

Buecher Anzahl: 6
	Buch: 7 Minuten am Tag (2016)
	Buch: Der Heimweg (2016)
	Buch: Ohne Schuld (2020)
	Buch: Escape Room (2020)
	Buch: Der Heimweg (2020)
	Buch: Ohne Schuld (2016)
Ebuecher Anzahl: 4
	Ebuch: Ohne Schuld (2020)
	Ebuch: Der Heimweg (2020)
	Ebuch: Zwei Handvoll Leben (2020)
	Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
Hoerbuecher Anzahl: 5
	Hoerbuch: QualityLand 2.0 (2019)
	Hoerbuch: Funken Mord (2018)
	Hoerbuch: QualityLand 2.0 (2018)
	Hoerbuch: Funken Mord (2019)
	Hoerbuch: Harry Potter - alle 7 Baende (2018)

     */

    List<Book> bookList = ParseBookTypes.bookParser();

    Set<Book> bookSet = new HashSet<>();
    Set<EBook> ebookSet = new HashSet<>();
    Set<AudioBook> audioSet = new HashSet<>();


    Collections.sort(bookList);

    for(Book b : bookList){
      if(b instanceof EBook){
        ebookSet.add((EBook) b);
      } else if (b instanceof AudioBook) {
        audioSet.add((AudioBook) b);
      } else{
        bookSet.add(b);
      }
    }

    for ( Book b : bookSet){
      System.out.println("Buch : " + b.getTitel() + ", "  + b.getAuflage() );
    }
    for ( EBook b : ebookSet){
      System.out.println("Ebuch : " + b.getTitel() + ", " + b.getAuflage());
    }
    for ( AudioBook b : audioSet){
      System.out.println("Audiobuch : " + b.getTitel() + ", " + b.getAuflage());
    }

  }
}
