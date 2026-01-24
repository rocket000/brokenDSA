package broken.java;

import java.util.ArrayList;
import java.util.List;

public class BasicCodes {

	public static void main(String[] args) {
		// Q1-----
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> b = new ArrayList<String>();
		// System.out.println(a.getClass()==b.getClass());//true

		// Q2-----
		Integer a1 = 128;
		Integer b1 = 128;
		// System.out.println(a1==b1); // false

		// Q3-----
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		// System.out.println(list1.getClass() == list2.getClass()); // true

		// Q4-----
//		Parent obj = new Child();
//		obj.staticMethod();
//		obj.instanceMethod();

		// Q5-----
		// print(null); //ambigous only if both string and integer are present

		// Q6----
		// printMe(10);

		// Q7
		// new Child2();

		// Q8
		Parent3 p = new Child3();
		p.method();

		// Q9
		Parent4 p4 = new Child4();
		p4.method(10);

	}

	static void print(Integer x) {
		System.out.println("Integer");
	}

	static void print(String x) {
		System.out.println("String");
	}

	static void print(Object x) {
		System.out.println("Object");
	}

	static void printMe(int x) {
		System.out.println("int");
	}

	static void printMe(int... x) {
		System.out.println("varargs");
	}
}

class Parent {
	static void staticMethod() {
		System.out.println("Parent static");
	}

	void instanceMethod() {
		System.out.println("Parent instance");
	}
}

class Child extends Parent {
	static void staticMethod() {
		System.out.println("Child static");
	}

	@Override
	void instanceMethod() {
		System.out.println("Child instance");
	}
}

class Parent2 {
	static {
		System.out.println("Parent2 static block");
	}

	{
		System.out.println("Parent2 instance block");
	}

	Parent2() {
		System.out.println("Parent2 constructor");
	}

}

class Child2 extends Parent2 {

	static {
		System.out.println("Child2 static block");
	}

	{
		System.out.println("Child instance block");
	}

	Child2() {
		System.out.println("Child constructor");
	}

}

class Parent3 {

	void method() {
		System.out.println("Parent3 method");
	}

}

class Child3 extends Parent3 {

	@Override
	void method() {
		System.out.println("Child3 method");
		super.method();
	}
}

class Parent4 {

	void method(int x) {
		System.out.println("Parent4 int");
	}

}

class Child4 extends Parent4 {

	void method(double x) {
		System.out.println("Child4 double");
	}

}
