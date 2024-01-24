package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.BookTypes.AudioBook;
import de.bht.pr2.lab03.BookTypes.Book;
import de.bht.pr2.lab03.BookTypes.EBook;
import de.bht.pr2.lab03.Parser.ParseBookTypes;

import java.util.List;

public class SumPrices {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */

    List<Book> sumPriceList = ParseBookTypes.bookParser();

    double sumBook = 0;
    double sumEbook = 0;
    double sumAudioBook = 0;
    double sumAll = 0;

    for(Book b : sumPriceList ){
      sumAll += b.getPreis();
      if ( b instanceof EBook){
        sumEbook += b.getPreis();
      }
      if ( b instanceof AudioBook){
        sumAudioBook += b.getPreis();
      }
      if(!(b instanceof EBook) && !( b instanceof AudioBook)){
        sumBook += b.getPreis();
      }
    }

    System.out.println(sumBook);
    System.out.println(sumEbook);
    System.out.println(sumAudioBook);
    System.out.println(sumAll);


  }
}
