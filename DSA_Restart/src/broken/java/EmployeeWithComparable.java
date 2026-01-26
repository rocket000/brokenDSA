package broken.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeWithComparable {

	public static void main(String[] args) {

		List<MyEmployee> ls = new ArrayList<MyEmployee>();
		ls.add(new MyEmployee(17, "a"));
		ls.add(new MyEmployee(19, "a1"));
		ls.add(new MyEmployee(26, "a2"));
		ls.add(new MyEmployee(54, "a3"));
		ls.add(new MyEmployee(16, "a4"));
		ls.add(new MyEmployee(10, "a5"));

		StringBuffer sb = new StringBuffer("Java Code");

		System.out.println(sb.capacity());

		sb.trimToSize();

		System.out.println(sb.capacity());
		printlist(ls);
		System.out.println("Post sort:");
		Collections.sort(ls);
		printlist(ls);

	}

	static void printlist(List<MyEmployee> ls) {
		for (MyEmployee e : ls) {
			System.out.println(e);
		}
	}

}

class MyEmployee implements Comparable<MyEmployee> {

	private int age;
	private String name;

	public MyEmployee(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(MyEmployee o) {
		return (this.age > o.getAge()) ? 1 : -1;
	}


}