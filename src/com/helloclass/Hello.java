package com.helloclass;

public class Hello 
{
	public static void main(String[] args) 
	{
		String Bob = "Hello World";
		int year = 1492;
		boolean dogAtHome = true;
		String date = "August 2, 2016";
		float price = 5.45f;
		char alpha = 'X';

		System.out.println(Bob);
		System.out.println("Columbus sailed the world in " + year);
		System.out.println("It is " + dogAtHome + " that I have a dog at home.");
		System.out.println("Today is " + date);
		System.out.println("I spent " + price + " on a cheeseburger.");
		System.out.println(alpha + " marks the spot");

		String[] movies = { "Scream", "A Nightmare on Elm Street", "Almost Famous", "Whip It", "It Follows",
				"Indian Summer", "Tommy Boy", "Easy A", "The Duff", "Bridesmaids" };
		String[] bands = { "Grace Potter and the Nocturnals", "Ray Lamontagne", "Dixie Chicks",
				"Florence + the Machine", "The Lumineers", "Aerosmith", "Spoon", "Sia", "Bastille", "No Doubt" };
		String[][] aboutMe = new String[4][6];
		
		aboutMe [0][0] = "\nFavorite Foods";
		aboutMe [0][1] = "Pizza";
		aboutMe [0][2] = "Peanut Butter";
		aboutMe [0][3] = "Apples";
		aboutMe [0][4] = "Popcorn";
		aboutMe [0][5] = "Mangoes";

		aboutMe [1][0] = "Favorite Albums";
		aboutMe [1][1] = "The Lion, The Beast, The Beat";
		aboutMe [1][2] = "Ceremonials";
		aboutMe [1][3] = "Living With Ghosts";
		aboutMe [1][4] = "The Dance";
		aboutMe [1][5] = "Bella Donna";

		aboutMe [2][0] = "Favorite Books";
		aboutMe [2][1] = "Wild";
		aboutMe [2][2] = "The Circle";
		aboutMe [2][3] = "Tiny Beautiful Things";
		aboutMe [2][4] = "Under the Dome";
		aboutMe [2][5] = "The Passage";

		aboutMe [3][0] = "Favorite Movies";
		aboutMe [3][1] = "Superbad";
		aboutMe [3][2] = "Halloween";
		aboutMe [3][3] = "Bridesmaids";
		aboutMe [3][4] = "Scream";
		aboutMe [3][5] = "A Nightmare on Elm Street 3: Dream Warriors";

		int rows = 4;
		int columns = 6;
		int i, j;

		for (i = 0; i < rows; i++) 
		{
			for (j = 0; j < columns; j++) 
			{
	        
				System.out.println(aboutMe[i][j] + " ");
			
			}
	    
			System.out.println("");
		}
	}

	public void dogs(int feet, int age) 
	{
		// do stuff here
	}

	public boolean timeToLeave() 
	{
		return false;
	}

	public int year() 
	{
		return 2016;
	}

	public void teeth() 
	{
		System.out.println("CHOMPERS");
	}

	private int soccerBalls(int size, int volume) 
	{
		return size;
	}

	protected double foo() 
	{
		return 3.00d;
	}

	public String playerName()
	{
		return "playerName"; 
	}

	private String lunchMenu(String itemA, String itemB, String itemC) 
	{
		return "foods";
	}

	private boolean isAGoal() 
	{
		return true;
	}

	public float wam(float age, float height) 
	{
		return age;
	}

}
