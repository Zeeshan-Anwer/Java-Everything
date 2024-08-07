/*Alice is a kindergarten teacher. 
 * She wants to give some candies to the children in her class.  
 * All the children sit in a line and each of them has a rating score according to his or her performance in the class. 
 *  Alice wants to give at least 1 candy to each child.
 *   If two children sit next to each other, then the one with the higher rating must get more candies.
 *    Alice wants to minimize the total number of candies she must buy
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	private static int countMinCandies(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		
		for (int i = 0; i < candies.length;) {
			if (i > 0 && ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]) { 
				candies[i] = candies[i-1] + 1;
				i--;
			}
			
			else 
			
			if (i < candies.length - 1 && ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) { 
				candies[i] = candies[i+1] + 1;
				if (i > 0) i--;
			} 
			
			else i++;
		}
		
		int totalCandies = 0;
		for (int c: candies) {
			totalCandies += c;
		}
		
		return totalCandies;
	}
	
	private static int[] readRatings() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			int ratingsExpected = scanner.nextInt();
			
			if (ratingsExpected <= 0) throw new RuntimeException("Input: first line is a negative number");
			
			int[] ratings = new int[ratingsExpected];
			int i = 0;
			while (i < ratingsExpected) {
				int rating = scanner.nextInt();
				ratings[i] = rating;
				i++;
			}
		
			return ratings;
		} catch (NumberFormatException e) {
			throw new RuntimeException("Input corrupt: " + e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		int[] ratings = readRatings();
		int minCandies = countMinCandies(ratings);
		System.out.println(minCandies);
	}

}
