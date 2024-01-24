package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.BookTypes.Book;
import de.bht.pr2.lab03.BookTypes.EBook;
import de.bht.pr2.lab03.Parser.ParseBookTypes;

import java.util.List;

public class Tolino3BookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */
    int count = 0;

    List<Book> tolino3List = ParseBookTypes.bookParser();

    for(Book b : tolino3List ){
      if(b instanceof EBook){
        if((((EBook) b).geteBookVersion().equals("3"))){
          count++;
        }
      }
    }

    System.out.println(count);

  }
}
