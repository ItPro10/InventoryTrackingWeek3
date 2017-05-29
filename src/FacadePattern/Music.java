package FacadePattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Facade Design Pattern
public class Music extends OtherItems{
	//constructor
	public Music(String title, String descr)
	{
		//call super and pass parameters
		super(title, descr);
	}

	//display music info
	@Override
	public void getOtherItems()
	{
		System.out.println("Other items: \n Music Item Title: " + getTitle() + "\n Description: " + getDescription());
	}


}
