package FactoryPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Factory Design Pattern
public abstract class InventoryNotification {

	//constructor
	public InventoryNotification()
	{

	}
	//display low inventory message
	public void notifyLowInventory()
	{
		System.out.println("Inventory is low!");
	}
}
