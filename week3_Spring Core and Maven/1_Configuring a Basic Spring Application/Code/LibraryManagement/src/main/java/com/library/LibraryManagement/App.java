package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
        
        // IOC container
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // fetching bean from the IOC container
        BookService bookService=context.getBean("bookService", BookService.class);
        
        // creating books
        Book book1=new Book(1, "The Alchemist", "Paulo Coelho", 349);
        Book book2=new Book(2, "The Three Musketeers", "Alexandre Dumas", 542);
        Book book3=new Book(3, "Beloved", "Toni Morrison", 620);
        
        
        // saving books
        System.out.println("Storing books:");
        bookService.saveBook(book1);
        bookService.saveBook(book2);
        bookService.saveBook(book3);
        
        // fetching book from library
        System.out.println("\nFetching book:");
        System.out.println("Book with id 2 is: "+ bookService.getBookById(2));
        
        
    }
}
