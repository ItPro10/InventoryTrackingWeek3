package FactoryPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Factory Design Pattern
public class BookNotification extends InventoryNotification{

	//constructor
	public BookNotification()
	{

	}
	//display low inventory message
	public void notifyLowInventory()
	{
		System.out.println("Book Inventory is low!\nBook quantities are below 50.");
	}
}
