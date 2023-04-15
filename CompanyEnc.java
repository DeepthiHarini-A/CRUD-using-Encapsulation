class CompanyEnc{
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getEmail(){
		return mailId;
	}
	public void setEmail(String mailId){
		this.mailId=mailId;
	}
	public long getContact(){
		return contactNumber;
	}
	public void setContact(long contactNumber){
		this.contactNumber=contactNumber;
	}
	public void displayCompanyDetailsEnc(){
		System.out.println("Company Details");
		System.out.println("-----------------");
		System.out.println("Company Id : "+getId());
		System.out.println("Company Name : "+getName());
		System.out.println("Company MailId : "+getEmail());
		System.out.println("Company Contact Number : "+getContact());
	}
}