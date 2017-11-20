import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambadTestMain {

	public static void main(String[] args) {
		BookCollection bc = new BookCollection();
		List<Book> books = bc.getAllBooks();
		List<String> names = new ArrayList<String>();
		names.add("11111111111");
		names.add("22222222222222");
		names.add("33333333333");
		names.add("4444444444444");

		Collections.sort(books, (s1,s2)->s1.getTitle().compareToIgnoreCase(s2.getTitle()));		
		Collections.sort(names);		

	}
	
//	public static <T extends Comparable<T>> int  countGreaterThan(T[] anArray, T elem) 
//	   int count =0;
//	for(T e: anArray) {
//		
//		
//	}

}
