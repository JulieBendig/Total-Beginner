package org.totalbeginner.tutorial;

public class Person {
	private String name;
	private int maximumBooks;
	
	// Need to have a class constructor. Define any parameters to the class here.
	// If class is entry point for program then constructor is "main"
	public Person() { 
		name = "unknown name";
		maximumBooks = 20;		
	}
	
	// these are the methods
	public String getName() {
		return (name);
	}
	public void setName(String anyname) {
		name = anyname;
		
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		// this pointer is optional, as proven in the setName procedure
		this.maximumBooks = maximumBooks;
	}
	public String toString () {
		return name + " (" + maximumBooks + " books)";
		
		
	}
}

