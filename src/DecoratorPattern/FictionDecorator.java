package DecoratorPattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Decorator Design Pattern
public class FictionDecorator extends ItemDecorator{
	//declare instance variable
	Item itemDecorator;

	//constructor
	//create item type to decorate of base class Item
	public FictionDecorator(Item itemDecorator) {
		this.itemDecorator = itemDecorator;
	}

	//display item type decorator
	public String getItemType()
	{
		return itemDecorator.getItemType() + " of type Fiction";
	}


	//display quantity in stock
	@Override
	public int quantity() {
		if(itemDecorator.getItemType().contains("Book"))
		{
			return itemDecorator.quantity() - 400;
		}
		else if(itemDecorator.getItemType().contains("Movie"))
		{
			return itemDecorator.quantity() - 200;
		}
		return 0;
	}
}
