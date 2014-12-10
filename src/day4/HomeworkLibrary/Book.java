package day4.HomeworkLibrary;

public class Book {

	private String name;
	private String author;
	private Category category;

	public Book() {

	}
	public Book(String name, String author, Category category) {
		this.name= name;
		this.author = author;
		this.category = category;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
