package competetion;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class PizzaShop {
	private Set<String> pizzaSet;
	private PriorityQueue<Map.Entry<String, Integer>> mostDisliked;

	public PizzaShop() {
		super();
		mostDisliked = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
	}

	void addLikedIngredents(String[] ingredents) {

	}

	void disLikedIngredent(String[] ingredents) {

	}

	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		maxHeap.add(100);
		maxHeap.add(10);
		maxHeap.add(100);

		while (!maxHeap.isEmpty())
			System.out.println(maxHeap.poll());

	}

}
