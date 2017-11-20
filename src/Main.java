import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		Runtime runtime = Runtime.getRuntime();
		
		long availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes/1024);
//		bc.printAllBooks();
		//get price of book called Tom Jones in EUR
//		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
		
		for(int i=0; i<1000; i++) {
			Book b;
			b = new Book(1,"Don Quixote","Miguel De Cervantes",3.99);
		}
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes/1024);
		System.gc();
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes/1024);
		
//		bc.printAllBooks();
		
	}
}
