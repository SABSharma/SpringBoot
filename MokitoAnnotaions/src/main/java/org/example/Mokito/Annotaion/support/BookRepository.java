package org.example.Mokito.Annotaion.support;

import java.util.List;

public interface BookRepository {
    public List<Book> findnewBooks(int greatethanprice);
}
