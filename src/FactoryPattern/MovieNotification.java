package FactoryPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Factory Design Pattern
public class MovieNotification extends InventoryNotification{
	//constructor
	public MovieNotification()
	{

	}
	//display low inventory message
	public void notifyLowInventory()
	{
		System.out.println("Movie Inventory is low!\nMovie quantities are below 25.");
	}
}
