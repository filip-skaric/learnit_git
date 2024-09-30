package com.itbulls.fskaric.example012;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
    	
		if ( (books == null) ) {
			return new Book[0];
		} else if (author == null ) {
			return new Book[0];
		}
    	
    	// Use a list to collect books by the given author
        List<Book> filteredBooks = new ArrayList<>();

        // Iterate through the books and add those by the given author to the list
        for (Book book : books) {
        	
        	for (Author authotTemp : book.getAuthors()) {
        		
        		if (authotTemp.equals(author)) {
        			filteredBooks.add(book);
        		}
        	}
        }

        // Convert the list back to an array
        return filteredBooks.toArray(new Book[0]);
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		if ( (books == null) ) {
			return new Book[0];
		} else if (publisher == null ) {
			return new Book[0];
		}
		
		List<Book> filteredPublisher = new ArrayList<>();
		for (Book book : books) {
			
			if (book.getPublisher().equals(publisher)) {
				filteredPublisher.add(book);
    		}
        }

        // Convert the list back to an array
        return filteredPublisher.toArray(new Book[0]);
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		if ( (books == null) ) {
			return new Book[0];
		} else if (yearFromInclusively == 0 ) {
			return new Book[0];
		}
		
		List<Book> filteredPublisher = new ArrayList<>();
		for (Book book : books) {
			
			if (book.getPublishingYear() > yearFromInclusively) {
				filteredPublisher.add(book);
    		}
        }

        // Convert the list back to an array
        return filteredPublisher.toArray(new Book[0]);
	}
	
}