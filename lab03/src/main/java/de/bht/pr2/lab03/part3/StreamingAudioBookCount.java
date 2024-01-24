package de.bht.pr2.lab03.part3;

import de.bht.pr2.lab03.BookTypes.AudioBook;
import de.bht.pr2.lab03.BookTypes.Book;
import de.bht.pr2.lab03.Parser.ParseBookTypes;

import java.util.List;

public class StreamingAudioBookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Hoerbuecher per Streaming: 5

     */


    List<Book> audioBookList = ParseBookTypes.bookParser();

    int count = 0;

    for(Book b : audioBookList){
      if(b instanceof AudioBook){
        if(((AudioBook) b).getAbspielmodus().equals("Streaming")){
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
