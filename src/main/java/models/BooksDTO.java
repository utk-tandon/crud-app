package models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;


public class BooksDTO {

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@NotEmpty(message = "Author name required")
	private String author;

	@NotEmpty(message = "Name required")
	private String title;
	
	@Min(0)
	private double price;
	
	@NotEmpty(message = "Isbn required")
	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

	
}
