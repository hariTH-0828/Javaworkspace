package competetion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PizzaSell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		HashSet<String> items = new HashSet<>();


		ArrayList<HashSet<String>> likes = new ArrayList<HashSet<String>>();

		ArrayList<HashSet<String>> dislikes = new ArrayList<HashSet<String>>();
		while (testcase-- > 0) {
			int like = sc.nextInt();
			HashSet<String> likeItems = new HashSet<>();
			HashSet<String> dislikeItems = new HashSet<>();
			for (int i = 0; i < like; i++) {
				String in = sc.nextLine();
				if (!items.contains(in)) {
					items.add(in);
				}
				likeItems.add(in);
			}
			int dislike = sc.nextInt();
			for (int i = 0; i < dislike; i++) {
				String in = sc.nextLine();
				if (!items.contains(in)) {
					items.add(in);
				}
				dislikeItems.add(in);
			}
			likes.add(likeItems);
			dislikes.add(dislikeItems);
		}
		HashSet<String> hs = new HashSet<>();
		PizzaSell ps=new PizzaSell();
		ArrayList<String>al=new ArrayList<>();
		for(String s:items) {
			al.add(s);
		}
		ArrayList<String> removeItems = new ArrayList<>();
		ps.check(0, 0, 0, likes, dislikes, hs, al, removeItems);
		System.out.print(hs.size() + " ");
		for (String h : hs) {
			System.out.print(h + " ");
		}

		System.out.println();
		sc.close();
	}

	void check(int i, int max, int count, ArrayList<HashSet<String>> likes, ArrayList<HashSet<String>> dislikes,
			HashSet<String> hs, ArrayList<String> al, ArrayList<String> removeItems) {

		for (; i < al.size(); i++) {
			for (int j = 0; j < likes.size(); j++) {
				if (!likes.get(j).contains(i) && dislikes.get(j).contains(i)) {
					dislikes.get(j).remove(i);
					if (dislikes.get(j).size() == 0)
						count++;
				}
			}
			if (count > max) {
				max = count;
				hs.remove(i);
			}
		}
	}

}
