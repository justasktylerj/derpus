package derfus;

import java.util.Scanner;

public class dertusController
{
    //Declaration section for instance varibles.
	//data members are always private.
	private Scanner inputScanner;
	
	public dertusController()
	{
      inputScanner = new Scanner(System.in);
	}
	public void start()
     
	{
          questions();
	}	
		
	public void questions()
	{
	     System.out.println("Please type your name");
         String myInput;
         myInput = inputScanner.next();
         System.out.println("hello there "+ myInput + ", do you like plums?");
	     System.out.println("Did you type more than one name? I am sorry, please type your full name");
	     String fullName = inputScanner.nextLine();
	     System.out.println("you full name is: " + fullName);
	     System.out.println("my name is java (pronounced yava)");
	     System.out.println("how old are you");
	     int age = inputScanner.nextInt();
	     System.out.println("you are " + age + " YEARS old!? Oh;");
	     
	}
	
}
