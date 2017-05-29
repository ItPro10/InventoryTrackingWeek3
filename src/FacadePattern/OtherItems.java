package FacadePattern;
/*
 * This is console demo to show the use of the different design patterns. 
 * by Nalinie Nybo
 * Assignment 3 - MET CS 665 
 */
//Facade Design Pattern
public abstract class OtherItems {
	//declare instance variables
	private String title;
	private String description;

	//constructor
	//pass title, description
	public OtherItems(String title, String descr){
		this.title = title;
		this.description = descr;
	}


	//set methods
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}


	//get methods
	public String getTitle()
	{
		return	this.title;
	}
	public String getDescription()
	{
		return this.description;
	}

	//display  info
	public void getOtherItems()
	{
		System.out.println("OtherItems: \n Item Title: " + getTitle() + "\n Description: " + getDescription());
	}


}
