package DecoratorPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Decorator Design Pattern
public class Movie extends Item {

	//constructor
	//type of item
	public Movie()
	{
		type = "Movie Items in stock";
	}

	//get total quantity of movie items in stock
	@Override
	public int quantity() {
		return 500;
	}

}
