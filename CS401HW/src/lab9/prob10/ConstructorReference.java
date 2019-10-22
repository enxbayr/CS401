package lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), 
					 new Human("Jane",45,"Female"), 
					 new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditate's name
		System.out.println("QUARY1:");
		Arrays.stream(list)
				.filter(h -> h.getGender().equals("Female"))
				.map(Human::getName)
				.forEach(System.out::println);

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors
	//			 (Totally 3 constructors) using fourth type of Method Reference 
	//		   	ClassName::new. Then print the object status 
		System.out.println("QUARY2:");
		Arrays.asList("Galt","Jane","Lisa").stream()
					.map(Human::new)
					.forEach(System.out::println);
		
		HumanInterface<String, Integer, String, Human> hm = Human::new;
		
		System.out.println("Hew Human: " + hm.apply("Bold", 25, "Male"));
		
	// Query 3 : Count the male candidates whose age is more than 30
		System.out.println("QUARY3:");
		System.out.println("Number of male candidate whose age is more than 30: " +
				 Arrays.stream(list)
							.filter(h -> h.getGender().equals("Male"))
							.filter(h -> h.getAge() > 30)
							.count());
   }



}
