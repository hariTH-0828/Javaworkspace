package array;

import java.util.Arrays;
import java.util.Stack;

class Asteroid extends AsteroidCollision {

	// Using Data structure
	@Override
	public int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<Integer>();
		
		

		return asteroids;
	}
}

public class AsteroidCollision {

	// Without using Data structure - Space complexity O(1);
	public int[] asteroidCollision(int[] asteroids) {

		int positive = 0;
		int negative = 1;
		while (positive < asteroids.length && negative < asteroids.length && positive >= 0 && negative >= 0) {

			if (asteroids[positive] > 0 && asteroids[negative] < 0) {

				asteroids[positive] = asteroids[positive] + asteroids[negative] == 0 ? 0
						: asteroids[positive] + asteroids[negative] > 0 ? asteroids[positive]
						: asteroids[negative];

				asteroids[negative] = 0;

				if (asteroids[positive] < 0) {
					negative = (positive > 0) ? positive : 1;
					positive = (positive > 0) ? positive - 1 : 0;
				} else {
					negative += 1;
				}
			} else {
				positive += 1;
				negative += 1;
			}
		}
		return asteroids;
	}

	public static void main(String[] args) {
	
		int[] asteroids = { 8, -8 };
		System.out.println(Arrays.toString(new Asteroid().asteroidCollision(asteroids)));
	}
}
