package de.bht.pr2.lab03.Parser;

import de.bht.pr2.lab03.BookTypes.AudioBook;
import de.bht.pr2.lab03.BookTypes.Book;
import de.bht.pr2.lab03.BookTypes.EBook;
import de.bht.pr2.lab03.store.BookStore;


import java.util.ArrayList;
import java.util.List;

public class ParseBookTypes {

    public static List<Book> bookParser(){

        List<Book> bookList = new ArrayList<>();

        List<String> bookData = BookStore.getSoldBooks();

        for (String para: bookData){
            String[] split = para.split(";");
            if(split[1].equals("Buch")){
                Book book = new Book(split[0], split[1], Double.parseDouble(split[2]),Integer.parseInt(split[3]));
                bookList.add(book);
            }
            if(split[1].equals("Ebuch")){
                Book eBook = new EBook(split[0],split[1], Double.parseDouble(split[2]), Integer.parseInt(split[3]),(split[4]));
                bookList.add(eBook);
            }
            if(split[1].equals("Hoerbuch")){
                Book audioBook =  new AudioBook(split[0],split[1], Double.parseDouble(split[2]), Integer.parseInt(split[3]),split[4]);
                bookList.add(audioBook);
            }
        }

        return bookList;



    }
}
