class Book extends LibraryItem{
	public String author;
	public int numPages;
	
	public Book(String title,String itemID,String author,int numPages){
		super(title,itemID);
		this.author=author;
		this.numPages=numPages;
	}
	public String getAuthor(){
		return author;
	}
	public int getNumPages(){
		return numPages;
	}
	public void setAuthor(String  author){
		this.author=author;
	}
	public void setNumPages(int numPages){
		this.numPages=numPages;
	}
	
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("Author: "+author);
		System.out.println("No of Pages:"+numPages);
		
	}
}