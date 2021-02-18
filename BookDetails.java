package assignment3Problem2;

public class BookDetails {

	public static void main(String[] args)
	{
		
		Book book=new Book();
		book.setBookNo(1);
		book.setTitle("Gate");
		book.setAuthor("GKP");
		book.setPrice(500);
		System.out.println(book.getBookNo());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		System.out.println();
		
		
		
		class EngineeringBook extends Book
		{
			private String category;

			public String getCategory()
			{
				return category;
			}

			public void setCategory(String category)
			{
				this.category = category;
			}
			
		}
		
		
		EngineeringBook engineeringBook =new EngineeringBook();
		engineeringBook.setBookNo(5645);
		engineeringBook.setCategory("EEE");
		engineeringBook.setTitle("Basic Electrical Engineering");
		engineeringBook.setAuthor("Chakrasali");
		engineeringBook.setPrice(300);
		System.out.println(engineeringBook.getBookNo());
		System.out.println(engineeringBook.getCategory());
		System.out.println(engineeringBook.getTitle());
		System.out.println(engineeringBook.getAuthor());
		System.out.println(engineeringBook.getPrice());
	}

}
