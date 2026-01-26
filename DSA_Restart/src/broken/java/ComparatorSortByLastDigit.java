package broken.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortByLastDigit {

	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {

				return (o1 % 10 > o2 % 10) ? 1 : -1;
			}

		};

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(31);
		ls.add(56);
		ls.add(67);
		ls.add(43);
		ls.add(82);

		System.out.println(ls);
		System.out.println("Post sort:");
		Collections.sort(ls, com);
		System.out.println(ls);

	}

}
