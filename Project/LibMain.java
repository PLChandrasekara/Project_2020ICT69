public class LibMain{
	public static void main (String[] args){

		Book book1= new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
		Book book2= new Book("To Kill a Mockingbid","B002","Happer Lee",281);
		Book book3= new Book("1984","B003","George Orwell",328);
		Book book4= new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book book5= new Book("The Hobbit","B005","J.R.R.Tolkien",320);
		
		Magazine magazine1=new Magazine("National Georaphic","M001","August 2023","National Geographic Society");
		Magazine magazine2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		Magazine magazine3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine magazine4=new Magazine("Vogue","M004","July 2023","Conde Nast");
		Magazine magazine5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember member1=new LibraryMember("L001","John Doe");
		LibraryMember member2=new LibraryMember("L002","Jane Smith");
		LibraryMember member3=new LibraryMember("L003","David Johnson");
		LibraryMember member4=new LibraryMember("L004","Sarah Williams");
		LibraryMember member5=new LibraryMember("L005","Micheal Brown");
	
	book1.checkOut();
	book3.checkIn();
	magazine2.checkOut();
	
	System.out.println(" " );
	System.out.println(" " );
	
	
	System.out.println("Books");
	System.out.println(" " );
	book1.displayItemDetails();
	System.out.println(" " );
	book2.displayItemDetails();
	System.out.println(" " );
	book3.displayItemDetails();
	System.out.println(" " );
	book4.displayItemDetails();
	System.out.println(" " );
	book5.displayItemDetails();
	
	System.out.println(" " );
	System.out.println(" " );
	
	System.out.println("Magazine");
	System.out.println(" " );
	magazine1.displayItemDetails();
	System.out.println(" " );
	magazine2.displayItemDetails();
	System.out.println(" " );
	magazine3.displayItemDetails();
	System.out.println(" " );
	magazine4.displayItemDetails();
	System.out.println(" " );
	magazine5.displayItemDetails();
	
	System.out.println(" " );
	System.out.println(" " );
	
	System.out.println("Library Member");
	System.out.println(" " );
	
	member1.displayMemberDetails();
	System.out.println(" " );
	member2.displayMemberDetails();
	System.out.println(" " );
	member3.displayMemberDetails();
	System.out.println(" " );
	member4.displayMemberDetails();
	System.out.println(" " );
	member5.displayMemberDetails();
}
}