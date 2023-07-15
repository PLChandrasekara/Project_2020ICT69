abstract class LibraryItem{
	public String title;
	public String itemID;
	private boolean checkOut;
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.checkOut=false;
	}
	public String getTitle(){
		return title;
	}
	public String getItemID(){
		return itemID;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setItemID(String itemID){
		this.itemID=itemID;
	}
	
	public void checkOut(){
		checkOut=true;
	}
	public void checkIn(){
		checkOut=false;
	}
	public void displayItemDetails(){
		System.out.println("Title: "+title);
		System.out.println("Item ID:"+itemID);
		System.out.println("Checked Out:"+checkOut);
	}
}
