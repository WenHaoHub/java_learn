package com.msb.mapper;

import com.msb.pojo.Book;

import java.util.List;

public interface BookMapper {
    public abstract List selectAllBooks();
    public abstract Book selectOneBook(String name);
    public abstract Book selectOneBookObj(Book book);
    public abstract int insertBook(Book book);
    public abstract int deleteBookById(int id);

}
