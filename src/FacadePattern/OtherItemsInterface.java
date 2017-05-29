package FacadePattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Facade Design Pattern
public class OtherItemsInterface {
	//declare private instances
	private OtherItems toys;
	private OtherItems music;

	//constructor to create each object
	//pass parameters to each object
	public OtherItemsInterface(String titleToy, String descrToy, String titleMusic, String descrMusic)
	{
		toys = new Toys(titleToy, descrToy);
		music = new Music(titleMusic, descrMusic);
	}
	//display toy info
	public void getToyItems()
	{
		toys.getOtherItems();
	}
	//display music info
	public void getMusicItems()
	{
		music.getOtherItems();
	}

}
