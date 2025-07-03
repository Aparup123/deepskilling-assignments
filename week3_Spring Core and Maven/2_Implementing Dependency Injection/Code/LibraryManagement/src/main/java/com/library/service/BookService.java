package com.library.service;



import com.library.LibraryManagement.Book;
import com.library.repository.BookRepository;

public class BookService {

	private BookRepository bookRepo;
	
	public void setBookRepo(BookRepository bookRepo) {
		this.bookRepo=bookRepo;
	}
	
	public Book getBookById(int id) {
		if(id<=0) {
			throw new RuntimeException("Invalid book id!");
		}
		
		return bookRepo.getById(id);
	}
	
	public void saveBook(Book book) {
		if(book==null) {
			throw new RuntimeException("No book is specified.");
		}
		
		bookRepo.save(book);
		System.out.println("Saved book: " + book);
	}
}
