package DecoratorPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Decorator Design Pattern
public class NonFictionDecorator extends ItemDecorator{
	//declare instance variable
	Item itemDecorator;

	//constructor
	//create item type to decorate of base class Item
	public NonFictionDecorator(Item itemDecorator) {
		this.itemDecorator = itemDecorator;
	}

	//display item type decorator
	public String getItemType()
	{
		return itemDecorator.getItemType() + " of type Non-Fiction";
	}

	//display quantity in stock
	@Override
	public int quantity() {
		if(itemDecorator.getItemType().contains("Book"))
		{
			return itemDecorator.quantity() - 600;
		}
		else if(itemDecorator.getItemType().contains("Movie"))
		{
			return itemDecorator.quantity() - 300;
		}
		return 0;
	}
}
