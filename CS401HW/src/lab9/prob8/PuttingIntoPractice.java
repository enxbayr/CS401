package lab9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
													   new Transaction(raoul, 2012, 1000), 
													   new Transaction(raoul, 2011, 400),
													   new Transaction(mario, 2012, 710), 
													   new Transaction(mario, 2012, 700), 
													   new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		System.out.println("QUERY1:");
		transactions.stream()
					.filter(e -> e.getYear() > 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);

		// Query 2: What are all the unique cities where the traders work?
		System.out.println("QUERY2:");
		transactions.stream()
					.map(e -> e.getTrader().getCity())
					.distinct()
					.forEach(System.out::println);

		// Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("QUERY3:");
		transactions.stream()
					.filter(e -> e.getTrader().getCity().equals("Cambridge"))
					.map(t -> t.getTrader())
					.sorted(Comparator.comparing(Trader::getName))
					.forEach(System.out::println);
		// Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("QUERY4:");
		String sortedNames = transactions.stream()
								   .map(e -> e.getTrader().getName())
								   .sorted(Comparator.comparing(String::toString))
								   .collect(Collectors.joining(","));
		System.out.println(sortedNames);
		// Query 5: Are there any trader based in Milan?
		System.out.println("QUERY5:");
		Optional<Trader> fromMilan = transactions.stream()
									.filter(e -> e.getTrader().getCity().equals("Milan"))
									.map(e -> e.getTrader())
									.findFirst();								
		System.out.println("Are there any trader based in Milan? " +(fromMilan.isPresent()?"True":"False"));
		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		System.out.println("QUERY6:");
		transactions.stream()
					.filter(t -> t.getTrader().getCity().equals("Milan"))
					.forEach(t -> {t.getTrader().setCity("Cambridge");
									System.out.println(t);});
		
		// Query 7: What's the highest value in all the transactions?
		System.out.println("QUERY7:");
		System.out.println(transactions.stream()
				//	.sorted(Comparator.comparing(Transaction::getValue).reversed())
				//	.map(Transaction::getValue)
				//	.findFirst()
				//	.get());
				.mapToInt(Transaction::getValue)
                .max());

	}
}
