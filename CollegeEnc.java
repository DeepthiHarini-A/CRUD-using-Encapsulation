class CollegeEnc{
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
	public void displayCollegeDetailsEnc(){
		System.out.println("College Details");
		System.out.println("-----------------");
		System.out.println("College Id : "+getId());
		System.out.println("College Name : "+getName());
		System.out.println("College MailId : "+getEmail());
		System.out.println("College Contact Number : "+getContact());
	}
}