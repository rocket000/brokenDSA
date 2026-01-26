package broken.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortByLength {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		ls.add("s");
		ls.add("1234");
		ls.add("three");
		ls.add("12");
		ls.add("123");

		// ls.stream().sorted(Comparator.)
		Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1.length() > o2.length()) ? 1 : -1;
			}
		};

		System.out.println(ls);
		System.out.println("Post sort:");
		Collections.sort(ls, com);
		System.out.println(ls);

	}

}
