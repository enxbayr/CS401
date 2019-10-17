package lab8.day2.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyClass {
	private String x;
	private int y;

	MyClass(String x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return x;
	}

	public int getAge() {
		return y;
	}

	public void setName(String name) {
		this.x = name;
	}

	public void setAge(int age) {
		this.y = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass m = (MyClass) obj;
		return m.getName().equals(x) && m.getAge() == y;
	}

	public void myMethod(MyClass cl) {
		Function<MyClass, Boolean> comp = this::equals;
		if (comp.apply(cl))
			System.out.println("This is Greater");
		else
			System.out.println("This is lesser");
	}

	public static void main(String[] args) {
		MyClass m1 = new MyClass("abc", 1);
		MyClass m2 = new MyClass("def", 1);

		m1.myMethod(m2);
	}

}
