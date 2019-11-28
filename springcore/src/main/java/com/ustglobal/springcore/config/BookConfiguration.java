package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
@Configuration
public class BookConfiguration {
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("java");
		book.setPrice(455);
		return book;
	}
	
	
	@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("raju");
		author.setPenName("black");
		return author;
	}
	

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
