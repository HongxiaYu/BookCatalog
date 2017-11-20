
public interface BookReadOnly {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	//
	Price getPrice();

	void setPrice(Double price);

}