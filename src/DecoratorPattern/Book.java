package DecoratorPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Decorator Design Pattern
public class Book extends Item {

	//constructor
	//type of item
	public Book()
	{
		type = "Book Items in stock";
	}

	//get total quantity of book items in stock
	@Override
	public int quantity() {
		return 1000;
	}

}
