package lab8.day1.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {

	public static void sortByPrice(List<Product> products) {

		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if (p1.price == p2.price)
					return 0;
				else if (p1.price < p2.price)
					return -1;
				else
					return 1;

			}
		}
		Collections.sort(products, new ProductComparator());
	}

	public static void sortByTitleModelLambda(List<Product> products) {

		Collections.sort(products, (p1, p2) -> {

			return (p1.title.compareTo(p2.title) == 0) ? p1.model - p2.model : p1.title.compareTo(p2.title);

		});

	}

	public static void main(String[] args) {
		List<Product> products1 = new ArrayList<>();
		products1.add(new Product("Apple", 200.0, 1));
		products1.add(new Product("Dell", 100.0, 2));
		products1.add(new Product("Asus", 50.0, 2));
		products1.add(new Product("Asus", 60.0, 1));

		Collections.sort(products1, new ProductTitleComparator());
		System.out.println("##### TASK A: Sort by Title #####");
		System.out.println(products1);

		Collections.sort(products1, new ProductPriceComparator());
		System.out.println("##### TASK B: Sort by Price#####");
		System.out.println(products1);

		List<Product> products2 = new ArrayList<>();
		products2.add(new Product("Apple", 200.0, 1));
		products2.add(new Product("Dell", 100.0, 2));
		products2.add(new Product("Asus", 50.0, 2));
		products2.add(new Product("Asus", 60.0, 1));

		System.out.println("##### TASK C: Sort by Price #####");

		sortByPrice(products2);
		System.out.println(products2);

		List<Product> products3 = new ArrayList<>();
		products3.add(new Product("Apple", 200.0, 1));
		products3.add(new Product("Dell", 100.0, 2));
		products3.add(new Product("Asus", 50.0, 2));
		products3.add(new Product("Asus", 60.0, 1));

		System.out.println("##### TASK D: Sort by Title and Model #####");

		sortByTitleModelLambda(products3);
		System.out.println(products3);

	}

}
