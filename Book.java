public class Book extends TangibleAsset{
	private String isbn;
	public Book(String name, int price, String color, String isbn){
		super(name, price, color);
		this.isbn = inbn;
	}
	public String getIsbn(){
		return this.isbn;
	}
}
