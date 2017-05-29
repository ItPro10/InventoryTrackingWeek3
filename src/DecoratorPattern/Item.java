package DecoratorPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Decorator Design Pattern
//base class
public abstract class Item {
	//declare  variables
	String type = "Items";

	//get item type
	public String getItemType()
	{
		return type;
	}

	//abstract method get quantity
	public abstract int quantity();
}
