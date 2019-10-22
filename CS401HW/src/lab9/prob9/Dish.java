package lab9.prob9;

import java.util.*;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(
			new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), 
			new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), 
			new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), 
			new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), 
			new Dish("salmon", false, 450, Dish.Type.FISH));

	public static boolean isVegMealAv() {
		Optional<Dish> vd = menu.parallelStream()
				.filter(m -> m.isVegetarian())
				.findAny();
		return vd.isPresent();
	}

	public static boolean isHealthy() {
		Optional<Dish> hm = menu.parallelStream()
				.filter(m -> m.getCalories() < 1000)
				.findAny();
		return hm.isPresent();
	}

	public static boolean isUnHealthy() {
		Optional<Dish> hm = menu.parallelStream()
				.filter(m -> m.getCalories() > 1000)
				.findAny();
		return hm.isPresent();
	}

	public static Optional<Dish> getFirstMeat() {
		return menu.parallelStream()
				.filter(m -> m.getType().equals(Type.MEAT))
				.findFirst();
	}

	public static int calculateTotalCalories() {
		return menu.parallelStream()
				.map(m -> m.getCalories())
				.reduce(0, (c1, c2) -> c1 + c2);
	}
	
	public static int calculateTotalCaloriesMethodReference() {
		return menu.parallelStream()
				.map(Dish::getCalories)
				.reduce(0,Math::addExact);
	}
	
	public static void main(String[] args) {
		System.out.println("Is there vegan food? " + isVegMealAv());
		System.out.println("Is there healthy food? " + isHealthy());
		System.out.println("Is there unhealhy food? " + isUnHealthy());
		System.out.println("First meat item in menu: " + getFirstMeat().get());
		System.out.println("Total calories by Lambda: " + calculateTotalCalories());
		System.out.println("Total calories by method reference: " + calculateTotalCaloriesMethodReference());
	}
}