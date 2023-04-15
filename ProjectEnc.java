class ProjectEnc{
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
	public void displayProjectDetailsEnc(){
		System.out.println("Project Details");
		System.out.println("-----------------");
		System.out.println("Project Id : "+getId());
		System.out.println("Project Name : "+getName());
	}
}