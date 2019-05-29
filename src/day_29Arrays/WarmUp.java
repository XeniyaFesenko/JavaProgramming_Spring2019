package day_29Arrays;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		String[][] countriesArray = { { "USA", "Washington, DC" },
				{ "Canada", "Ottawa" },
				{ "Mexico" ,"Mexico City" },
				{ "Brasil" ,"Brasilia" }, 
				{ "Peru" , "Lima" },
				{ "Argentina" ,"Buenos Aires" },
				{ "Bolivia" ,"La Paz" },
				{ "Macedonia" ,"Skopje" }, 
				{ "Kazakhstan" ,"Nursultan" }
				};

		System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);

		System.out.println(Arrays.deepToString(countriesArray));

		// Print all the countries in same line separated by |

		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");
		}

		// 2) for each loop
		System.out.println();
		for (String[] country : countriesArray) {
			System.out.print(country[0] + "|");

		// get all the cities and add to cities array;	
		String [] cities = new String [countriesArray.length];
		
		// null means no object
		System.out.print(Arrays.toString(cities));
				
		for (int i = 0; i < countriesArray.length; i++)	{
		cities [i] = countriesArray[i][1];
		
		System.out.println(Arrays.toString(cities));
		
		
		//look for Bolivia in countries array, test if Capital city is La Pas;
		
		for (int row = 0; row < countriesArray.length; row++) {
			if (countriesArray[row][0].equals("Bolivia")) {
				//System.out.println(countriesArray[row][i]);
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
					break;
				}
			}
		}
		
		}
			
		}
		
		

	}
}
