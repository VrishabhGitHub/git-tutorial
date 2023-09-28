package com.api.book.service;
import com.api.book.entities.Book;

public interface BookService {

	
	public Iterable<Book> getAllBook();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public Book deleteById(int id);
	public Book updateById(int id, Book book);
}