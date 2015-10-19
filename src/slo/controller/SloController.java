package slo.controller;

public class SloController
{
	private String stringLength = "lalalalla"; 
	private int mathFirstnumber = 1;
	private int mathSeconedNumber = 2;
	private double compareFirstDouble = 4.5;
	private double compareSeconedDouble = 5.0;
	private boolean thisIsAlwaysTrue = true;
	
	
	public void start()
	{
		System.out.println("String Str1's length is  " + stringLength.length());
		
		System.out.println(mathFirstnumber + mathSeconedNumber);
		
		if(compareFirstDouble > compareSeconedDouble)
		{
			System.out.println("Hooray!");
		}
		else
		{
			System.out.println("BOOOOOOO 3 SPOOPY 5 ME!!");
		}
		
		if(thisIsAlwaysTrue == true)
		{
			System.out.println("Death to fake metal!!!!");	
		}
		else
		{
			System.out.println("uh oh looks like java is broken");
		}
		
		
		
		
	}
		
	
	

}

