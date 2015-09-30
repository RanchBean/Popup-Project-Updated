package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
/**
 * Lets the user put data into Popup boxes.
 */
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		
		String tempAge = myPopups.getAnswer("You typed in " + name);
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -123;
		}
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -.123;
		}
		
		weight = Double.parseDouble(tempWeight);
		
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
	}
			
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		}
			int vaildInteger = Integer.parseInt(input);
			isInt = true;
		{
		catch(NumberFormatException)
		
		}
		return isInt;
		{
		myPopups.displayResponse("You did not type in a vaild integer.");
		}
		
		
	}
	
	
	
	private boolean isDouble(String input)	
	}
	boolean isDouble = false;
	
	try
	{
		double vaildDouble = Double.parseDouble();
		isDouble = true;
	}
		catch(NumberFormatException error)
	{
		myPopups.displayResponse("You did not put in a vaild double.");
	}
	
	return isDouble;
}
