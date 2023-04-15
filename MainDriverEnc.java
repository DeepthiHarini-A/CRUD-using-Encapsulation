import java.util.Scanner;
class MainDriverEnc
{
	private static Scanner scn=new Scanner(System.in);
	private static boolean data=true;
	private static boolean data1=true;
	private static boolean data2=true;
	private static boolean data3=true;
	private static boolean data4=true;
	private static boolean data5=true;
	private static boolean data6=true;
	private static boolean data7=true;
	private static boolean data8=true;
	private static boolean data9=true;
	private static boolean data10=true;
	private static boolean data11=true;
	private static boolean data12=true;
	private static CompanyEnc company;
	private static BranchEnc branch;
	private static DepartmentEnc department;
	private static EmployeeEnc employee;
	private static ProjectEnc project;
	private static UniversityEnc university;
	private static CollegeEnc college;
	private static StudentEnc student;
	public static void main(String[] args){
		do{
			System.out.println("Select Your Choice!");
			System.out.println("-------------------");
			System.out.println("A.Mini Project Phase1 CRUD Operation!");
			System.out.println("B.Mini Project Phase2 CRUD Operation!");
			System.out.println("C.Exit");
			char choice=scn.next().charAt(0);
			switch(choice){
			case 'A':{
		    	System.out.println("You have Selected Mini Project Phase1 ");
		    	do
		    	{
		    		System.out.println("Select Your Choice!");
			        System.out.println("-------------------");
			        System.out.println("1.Create the company Details!");
			        System.out.println("2.Create the Branch Details!");
			        System.out.println("3.Create the Department Details!");
			        System.out.println("4.Create the Employee Details!");
			        System.out.println("5.Create the Project Details");
			        System.out.println("6.Exit");
                    int choice0=scn.nextInt();
			        switch(choice0){
			        case 1:{
			    	    System.out.println("You have selected company details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Company Details!");
			            System.out.println("2.Read the Company Details!");
			            System.out.println("3.Update the Company Details!");
			            System.out.println("4.Delete the Company Details!");
			            System.out.println("5.Exit!");
			            int choice1=scn.nextInt();
			            switch(choice1){
			            case 1: {
				        company =new CompanyEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        company.displayCompanyDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter company Id");
            	        int id=scn.nextInt();
            	        company.setId(id);
            	        System.out.println("Enter company Name");
            	        String name=scn.next();
            	        company.setName(name);
            	        System.out.println("Enter Mail Id");
            	        String mailId=scn.next();
            	        company.setEmail(mailId);
            	        System.out.println("Enter company Contact Number");
            	        long contactNumber=scn.nextLong();
            	        company.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        company =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data1=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data1);
			    }
			    break;
			    case 2: 
			    {
			    	System.out.println("You have selected Branch details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Branch Details!");
			            System.out.println("2.Read the Branch Details!");
			            System.out.println("3.Update the Branch Details!");
			            System.out.println("4.Delete the Branch Details!");
			            System.out.println("5.Exit!");
			            int choice2=scn.nextInt();
			            //System.out.println("The given choice: "+choice2);
			            switch(choice2){
			            case 1: {
				        branch =new BranchEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        branch.displayBranchDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Branch Id");
            	        int id=scn.nextInt();
            	        branch.setId(id);
            	        System.out.println("Enter Branch Name");
            	        String name=scn.next();
            	        branch.setName(name);
            	        System.out.println("Enter Branch Mail Id");
            	        String mailId=scn.next();
            	        branch.setEmail(mailId);
            	        System.out.println("Enter Branch Contact Number");
            	        long contactNumber=scn.nextLong();
            	        branch.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        company =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data2=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data2);
			        	
			    }
			    break;
			case 3: 
			    {
			    	System.out.println("You have selected Department details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Department Details!");
			            System.out.println("2.Read the Department Details!");
			            System.out.println("3.Update the Department Details!");
			            System.out.println("4.Delete the Department Details!");
			            System.out.println("5.Exit!");
			            int choice3=scn.nextInt();
			            switch(choice3){
			            case 1: {
				        department =new DepartmentEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        department.displayDepartmentDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Department Id");
            	        int id=scn.nextInt();
            	        department.setId(id);
            	        System.out.println("Enter Department Name");
            	        String name=scn.next();
            	        department.setName(name);
            	        System.out.println("Enter Department Mail Id");
            	        String mailId=scn.next();
            	        department.setEmail(mailId);
            	        System.out.println("Enter Department Contact Number");
            	        long contactNumber=scn.nextLong();
            	        department.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        department =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data3=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data3);
			        	
			    }
			    break;
			case 4: 
			    {
			    	System.out.println("You have selected Employee details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Employee Details!");
			            System.out.println("2.Read the Employee Details!");
			            System.out.println("3.Update the Employee Details!");
			            System.out.println("4.Delete the Employee Details!");
			            System.out.println("5.Exit!");
			            int choice4=scn.nextInt();
			            switch(choice4){
			            case 1: {
				        employee =new EmployeeEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        employee.displayEmployeeDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter employee Id");
            	        int id=scn.nextInt();
            	        employee.setId(id);
            	        System.out.println("Enter employee Name");
            	        String name=scn.next();
            	        employee.setName(name);
            	        System.out.println("Enter employee Mail Id");
            	        String mailId=scn.next();
            	        employee.setEmail(mailId);
            	        System.out.println("Enter employee Contact Number");
            	        long contactNumber=scn.nextLong();
            	        employee.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        employee =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data4=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data4);
			        	
			    }
			    break;
                case 5: 
			    {
			    	System.out.println("You have selected Project details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Project Details!");
			            System.out.println("2.Read the Project Details!");
			            System.out.println("3.Update the Project Details!");
			            System.out.println("4.Delete the Project Details!");
			            System.out.println("5.Exit!");
			            int choice5=scn.nextInt();
			            switch(choice5){
			            case 1: {
				        project =new ProjectEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        project.displayProjectDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Project Id");
            	        int id=scn.nextInt();
            	        project.setId(id);
            	        System.out.println("Enter Project Name");
            	        String name=scn.next();
            	        project.setName(name);
			            }
			            break;
		                case 4: {
				        project =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data5=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data5);
			        	
			    }
			    break;
			    case 6: 
			    {
			    	data6=false;
			    	System.out.println("You have exited A.Mini Project Phase1 CRUD Operation");
			    }
			    break;
			    default: {
				System.out.println("Invalid choice try again!");
			    }
			    }
			}while(data6);    
		    }	
			break;
		case 'B': {
			System.out.println("You have Selected Mini Project Phase2 ");
		    	do
		    	{
		    		System.out.println("Select Your Choice!");
			        System.out.println("-------------------");
			        System.out.println("1.Create the University Details!");
			        System.out.println("2.Create the College Details!");
			        System.out.println("3.Create the Department Details!");
			        System.out.println("4.Create the Student Details!");
			        System.out.println("5.Create the Project Details");
			        System.out.println("6.Exit");
                    int choice0=scn.nextInt();
			        switch(choice0){
			        case 1:{
			    	    System.out.println("You have selected University details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the University Details!");
			            System.out.println("2.Read the University Details!");
			            System.out.println("3.Update the University Details!");
			            System.out.println("4.Delete the University Details!");
			            System.out.println("5.Exit!");
			            int choice1=scn.nextInt();
			            switch(choice1){
			            case 1: {
				        university =new UniversityEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        university.displayUniversityDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter University Id");
            	        int id=scn.nextInt();
            	        university.setId(id);
            	        System.out.println("Enter University Name");
            	        String name=scn.next();
            	        university.setName(name);
            	        System.out.println("Enter Mail Id");
            	        String mailId=scn.next();
            	        university.setEmail(mailId);
            	        System.out.println("Enter University Contact Number");
            	        long contactNumber=scn.nextLong();
            	        university.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        university =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data7=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data7);
			    }
			    break;
			    case 2: 
			    {
			    	System.out.println("You have selected College details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the College Details!");
			            System.out.println("2.Read the College Details!");
			            System.out.println("3.Update the College Details!");
			            System.out.println("4.Delete the College Details!");
			            System.out.println("5.Exit!");
			            int choice2=scn.nextInt();
			            switch(choice2){
			            case 1: {
				        college =new CollegeEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        college.displayCollegeDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter College Id");
            	        int id=scn.nextInt();
            	        college.setId(id);
            	        System.out.println("Enter College Name");
            	        String name=scn.next();
            	        college.setName(name);
            	        System.out.println("Enter College Mail Id");
            	        String mailId=scn.next();
            	        college.setEmail(mailId);
            	        System.out.println("Enter College Contact Number");
            	        long contactNumber=scn.nextLong();
            	        college.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        college =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data8=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data8);
			        	
			    }
			    break;
			case 3: 
			    {
			    	System.out.println("You have selected Department details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Department Details!");
			            System.out.println("2.Read the Department Details!");
			            System.out.println("3.Update the Department Details!");
			            System.out.println("4.Delete the Department Details!");
			            System.out.println("5.Exit!");
			            int choice3=scn.nextInt();
			            switch(choice3){
			            case 1: {
				        department =new DepartmentEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        department.displayDepartmentDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Department Id");
            	        int id=scn.nextInt();
            	        department.setId(id);
            	        System.out.println("Enter Department Name");
            	        String name=scn.next();
            	        department.setName(name);
            	        System.out.println("Enter Department Mail Id");
            	        String mailId=scn.next();
            	        department.setEmail(mailId);
            	        System.out.println("Enter Department Contact Number");
            	        long contactNumber=scn.nextLong();
            	        department.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        department =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data9=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data9);
			        	
			    }
			    break;
			case 4: 
			    {
			    	System.out.println("You have selected Student details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Student Details!");
			            System.out.println("2.Read the Student Details!");
			            System.out.println("3.Update the Student Details!");
			            System.out.println("4.Delete the Student Details!");
			            System.out.println("5.Exit!");
			            int choice4=scn.nextInt();
			            switch(choice4){
			            case 1: {
				        student =new StudentEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        student.displayStudentDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Student Id");
            	        int id=scn.nextInt();
            	        student.setId(id);
            	        System.out.println("Enter Student Name");
            	        String name=scn.next();
            	        student.setName(name);
            	        System.out.println("Enter Student Mail Id");
            	        String mailId=scn.next();
            	        student.setEmail(mailId);
            	        System.out.println("Enter Student Contact Number");
            	        long contactNumber=scn.nextLong();
            	        student.setContact(contactNumber);
				        System.out.println("Update operation performed successfully!");
			            }
			            break;
		                case 4: {
				        student =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data10=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data10);
			        	
			    }
			    break;
                case 5: 
			    {
			    	System.out.println("You have selected Project details");
			        do{
			        	System.out.println("Select Your Choice!");
			            System.out.println("-------------------");
			            System.out.println("1.Create the Project Details!");
			            System.out.println("2.Read the Project Details!");
			            System.out.println("3.Update the Project Details!");
			            System.out.println("4.Delete the Project Details!");
			            System.out.println("5.Exit!");
			            int choice5=scn.nextInt();
			            switch(choice5){
			            case 1: {
				        project =new ProjectEnc();
				        System.out.println("Create operation performed successfully!");
			            }
			            break;
		                case 2: {
		    	        project.displayProjectDetailsEnc();
				        System.out.println("Read operation performed successfully!");
			            }
                        break;
                        case 3: {
            	        System.out.println("Enter Project Id");
            	        int id=scn.nextInt();
            	        project.setId(id);
            	        System.out.println("Enter Project Name");
            	        String name=scn.next();
            	        project.setName(name);
			            }
			            break;
		                case 4: {
				        project =null;
				        System.out.println("Delete operation performed successfully!");
			            }
			            break;
		                case 5: {
			            data11=false;
				        System.out.println("Thank you! visit Again!");
			            }
			            break;
		                default: {
		    	        System.out.println("Invalid Choice! Try Again");
		                }
			            }
		            }while(data11);
			        	
			    }
			    break;
			    case 6: 
			    {
			    	data12=false;
			    	System.out.println("You have exited B.Mini project phase-2 CRUD Operation");
			    }
			    break;
			    default: {
				System.out.println("Invalid choice try again!");
			    }
			    }
			}while(data12);    
		    }	
			break;
		case 'C':{
			data=false;
			System.out.println("Thank you! visit Again!");

		}
		break;
	    default: {
	    	System.out.println("Invalid choice try again!");
	    }
             
		}

    }while(data);
}
}





