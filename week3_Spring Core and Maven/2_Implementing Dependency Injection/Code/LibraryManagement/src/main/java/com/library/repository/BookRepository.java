package com.library.repository;

import java.util.List;

import com.library.LibraryManagement.Book;

import java.util.ArrayList;

public class BookRepository {
	List<Book> bookList=new ArrayList<>();
	
	public void save(Book book) {
		bookList.add(book);
	}
	
	public Book getById(int id) {
		for(Book book : bookList) {
			if(book.getId()==id) {
				return book;
			}
		}
		return null;
	}
	
	public Book getByName(String name) {
		for(Book book:bookList) {
			if(book.getName()==name) {
				return book;
			}
		}
		return null;
	}
}
