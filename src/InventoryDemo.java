/*
 * This is console demo to show the use of 5 different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */

/*
 * PROMPTS
 * This class prompts the user for input
 * 1. User can select A to see a demo of the Singleton Pattern
 * 2. User can select B to see a demo of the Decorator Pattern
 * 3. User can select C to see a demo of the Facade Pattern
 * 4. User can select D to see a demo of the Composite Pattern
 * 5. User can select E to see a demo of the Factory Pattern
 */

/*
 * Additional Info
 * Each pattern separated into packages
 * default package contains the demo class - InventoryDemo.java
 */

import javax.swing.JOptionPane;

import CompositePattern.Associate;
import CompositePattern.Supervisor;
import DecoratorPattern.Book;
import DecoratorPattern.FictionDecorator;
import DecoratorPattern.Item;
import DecoratorPattern.Movie;
import DecoratorPattern.NonFictionDecorator;
import FacadePattern.OtherItemsInterface;
import FactoryPattern.InventoryNotification;
import FactoryPattern.NotificationFactory;
import SingletonPattern.DataAccessSingleton;

public class InventoryDemo {

	public static void main(String[] args) {

		//prompt for string input
		String input = JOptionPane.showInputDialog("Please enter A for Singleton, B for Decorator, C for Facade, D for Composite, E for Factory: ");
		//run demos based on input

		if(input.equalsIgnoreCase("A"))
		{
			/*
			 * *******************************SINGLETON****************************************************************
			 */
			// Singleton Pattern for data access
			//get instance
			DataAccessSingleton das = DataAccessSingleton.getInstance();
			//call methods
			//retrieve data
			das.getBookData();
			das.getMovieData();
			//insert data
			das.addBookData("Murder on the Orient Express", "Agatha Christie");
			das.addMovieData("Star Trek", "William Shatner");
			//edit data
			das.editBookData("Harry Potter", "JK Rowling", 30);
			das.editMovieData("Star Wars", "George Lucas", 15);
		}


		/*
		 ********************************DECORATOR****************************************************************
		 */
		else if(input.equalsIgnoreCase("B"))
		{
			//Decorator demo
			//Books
			System.out.println("Decorator Pattern demo");
			Item books = new Book();
			System.out.println(books.getItemType() + ": " + books.quantity());

			//Fiction books
			Item bookItemFiction = new Book();
			bookItemFiction = new FictionDecorator(bookItemFiction);
			System.out.println(bookItemFiction.getItemType() + ": " + bookItemFiction.quantity());

			//NonFiction books
			Item bookItemNonFiction = new Book();
			bookItemNonFiction = new NonFictionDecorator(bookItemNonFiction);
			System.out.println(bookItemNonFiction.getItemType() + ": " + bookItemNonFiction.quantity());

			//Movies
			Item movies = new Movie();
			System.out.println(movies.getItemType() + ": " + movies.quantity());

			//Fiction movies
			Item movieItemFiction = new Movie();
			movieItemFiction = new FictionDecorator(movieItemFiction);
			System.out.println(movieItemFiction.getItemType() + ": " + movieItemFiction.quantity());

			//NonFiction movies
			Item movieItemNonFiction = new Movie();
			movieItemNonFiction = new NonFictionDecorator(movieItemNonFiction);
			System.out.println(movieItemNonFiction.getItemType() + ": " + movieItemNonFiction.quantity());
		}	
		/*
		 ********************************FACADE****************************************************************
		 */			
		else if(input.equalsIgnoreCase("C"))
		{	
			//Facade demo
			System.out.println("Facade Pattern demo");
			OtherItemsInterface otherItems = new OtherItemsInterface("Batman", "Lego", "Fleetwood Mac", "Rock");
			otherItems.getToyItems();
			otherItems.getMusicItems();
		}
		/*
		 ********************************COMPOSITE****************************************************************
		 */			

		else if(input.equalsIgnoreCase("D"))
		{
			//Composite Demo
			System.out.println("Composite Pattern demo");
			Associate tom = new Associate("Tom Thompson", "Associate");
			Associate john =  new Associate("John Smith", "Associate");
			Supervisor jim = new Supervisor("James Kirk", "Supervisor");
			jim.add(tom);
			jim.add(john);
			jim.getDetails();
		}
		/*
		 ********************************FACTORY****************************************************************
		 */			
		else if(input.equalsIgnoreCase("E"))
		{
			//Factory Demo
			System.out.println("Factory Pattern demo");
			NotificationFactory notifyFactory = new NotificationFactory();
			InventoryNotification bookNotify = notifyFactory.getNotification("BOOK");
			InventoryNotification movieNotify = notifyFactory.getNotification("MOVIE");
			bookNotify.notifyLowInventory();
			movieNotify.notifyLowInventory();
		}
	}
}
