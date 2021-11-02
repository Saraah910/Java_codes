import java.util.Scanner;
public class Emp {
	static int id;
	int gr_no;
	String name ;
	int salary;
	String address;
	long  phone_no;
    String dob;
	Emp() {
		id++;
		System.out.println("EMP ID is-> " + id);
	}
	void getdata() {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter employee's GR NO.");
		gr_no = SC.nextInt();
		SC.nextLine();
		System.out.println("Enter employee's Name");
		name = SC.nextLine();
		System.out.println("Enter employee's address");
		address = SC.nextLine();
		System.out.println("Enter employee's Date of birth");
		dob = SC.nextLine();
		System.out.println("Enter employee's salary");
		salary = SC.nextInt();
		System.out.println("Enter employee's phone number");
		phone_no = SC.nextLong();		
	}
	
	void displaydata() {
		System.out.println("Employee's GR no is-> " + gr_no);
		System.out.println("Employee's name is-> " + name);
		System.out.println("Employee's address is-> " + address);
		System.out.println("Employee's Date of birth is-> " + dob);
		System.out.println("Employee's salary is-> " + salary);
		System.out.println("Employee's phone number is-> " + phone_no);	
	}
	
    void UpdateEMPdetails(){
    Scanner SC = new Scanner(System.in);
    //SC.nextLine();
    String c;
    System.out.println("DO u want to update the complete information of the employee,if so press y,For a specific data press s ");
    c= SC.nextLine();
    if (c.equals("y")){
    {
    	System.out.println("Enter employee's new GR NO.");
		gr_no = SC.nextInt();
		SC.nextLine();
		System.out.println("Enter employee's new Name");
		name = SC.nextLine();
		System.out.println("Enter employee's new address");
		address = SC.nextLine();
		System.out.println("Enter employee's new Date of birth");
		dob = SC.nextLine();
		System.out.println("Enter employee's new salary");
		salary = SC.nextInt();
		System.out.println("Enter employee's new phone number");
		phone_no = SC.nextLong();	
    }
    }
    if(c.equals("s")){
        int x;
        String j;
        do{
        System.out.println("Which data do u want to update:- \\n 1.GR no \\n 2.name \\n 3.address \\n 4.Date of birth \\n 5.salary \\n 6.phone number");
    x=SC.nextInt();
    switch(x){
case 1:
    { System.out.println("Enter employee's new GR NO.");
	gr_no = SC.nextInt();
	SC.nextLine();
    }break;
case 2:
    {
    	
		System.out.println("Enter employee's new Name");
		name = SC.nextLine();
		//SC.nextLine();
    }break;
case 3:
    { 
    System.out.println("Enter employee's new address");
	address = SC.nextLine();
        }break;
case 4:
    {
    System.out.println("Enter employee's new Date of birth");
	dob = SC.nextLine();
    }break;
case 5:
    {
    	System.out.println("Enter employee's new salary");
		salary = SC.nextInt();
    }break;
case 6:
    {
    	System.out.println("Enter employee's new phone number");
		phone_no = SC.nextLong();
    }break;
    }
    SC.nextLine();
    System.out.println("Do u want to update again? if so press y");
    j=SC.nextLine();
    }while(j.equals("y"));
    }
    }
    
    void DeleteEMPdetails(){
        {
     gr_no = 0;
	 name = "NA";
	 salary = 0;
	 address = "NA";
	  phone_no = 0;
     dob = "NA";
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
	    String f;
		int n;
		System.out.println("How many emplo do u want to create?");
		n = SC.nextInt();

		Emp[] ep = new Emp[n];
		for(int i=0;i<n;i++) {
			
			System.out.println("For emp " + (i+1));
			ep[i]=new Emp();
			ep[i].getdata();
		}
		for(int i=0;i<n;i++) {
			System.out.println("For emp " + (i+1));
			ep[i].displaydata();
		}
		SC.nextLine();
		System.out.println("do u want to search for a specific Employee , if yes press y");
		f = SC.nextLine();
		//SC.nextLine();
		if(f.equals("y")) {
			String l = "y";
			do{
			    int ID;
			    int j=0;
			    System.out.println("Enter the Employee's ID which you want to search ");
			    ID = SC.nextInt();
			    for(int i=0;i<n;i++){
			        int b= ep[i].gr_no;
			    if(ID == b){
			    System.out.println("Employee Found");
			    ep[i].displaydata();
			     break;
			    }else{
			        j++;
			    }
			    }
			    if(j==n){
			    	System.out.println("Employee NOT Found");
			    	
			    }
			    SC.nextLine();
			    System.out.println("Do u want to search for any more employee's? If so press y ");
			    l=SC.nextLine();
			    }while(l.equals("y"));
		}
		//SC.nextLine();
		String g;
		
		System.out.println("do u want to update the data for a specific Employee , if yes press y ");
		g=SC.nextLine();
		if(g.equals("y")){
		    String h;
		    do{int da;
		    System.out.println("Which employee's data do u want to update? ");
		    da=SC.nextInt();
		    System.out.println("For Employee "+ da);
		    ep[da-1].UpdateEMPdetails();
		    ep[da-1].displaydata();
		    SC.nextLine();
		    System.out.println("Do u want to update data for any more employee's? If so press y ");
		    h=SC.nextLine();
		    }while(h.equals("y"));
		}
		//SC.nextLine();
		String k;
		System.out.println("do u want to delete the data for a specific Employee , if yes press y ");
		k= SC.nextLine();
		if(k.equals("y")){
		    String h;
		    do{int da;
		    System.out.println("Which employee's data do u want to delete? ");
		    da = SC.nextInt();
		    System.out.println("For Employee "+ da);
		    ep[da-1].DeleteEMPdetails();
		    ep[da-1].displaydata();
		    SC.nextLine();
		    System.out.println("Do u want to delete data for any more employee's? If so press y ");
		    h=SC.nextLine();;
		    }while(h.equals("y"));
		}


	}

}

