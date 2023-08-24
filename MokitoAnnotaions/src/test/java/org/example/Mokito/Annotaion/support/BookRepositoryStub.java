package org.example.Mokito.Annotaion.support;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {


    @Override
    public List<Book> findnewBooks(int greatethanprice) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("124","JAVA",400));
        books.add(new Book("123","Pythonm",600));

        return books;
    }
}
