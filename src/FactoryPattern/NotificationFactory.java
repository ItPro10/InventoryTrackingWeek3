package FactoryPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Factory Design Pattern
public class NotificationFactory {

	//create factories
	public InventoryNotification getNotification(String type ){
		if(type == null){
			return null;
		}	
		//book notification factory
		if(type.equalsIgnoreCase("BOOK")){
			return new BookNotification();
			//movie notification factory 
		} else if(type.equalsIgnoreCase("MOVIE")){
			return new MovieNotification();
		}
		return null;
	}
}
