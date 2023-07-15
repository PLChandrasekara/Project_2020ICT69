class Magazine extends LibraryItem{
	public String issueDate;
	public String publisher;
	
	public Magazine(String title,String itemID,String issueDate,String publisher){
		super(title,itemID);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	public String getIssueDate(){
		return issueDate;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setIssueDate(String issueDate){
		this.issueDate=issueDate;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("IssueDate: "+issueDate);
		System.out.println("Publisher:"+publisher);
		
	}
}