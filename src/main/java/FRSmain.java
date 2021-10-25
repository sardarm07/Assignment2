import java.util.InputMismatchException;
import java.util.Scanner;





public class FRSmain {

	public static void main( String[] args ) 
    {
		    Menu m = new Menu();
		    int choice1=1; int mode; 	boolean flag=false;
		    Admin a=new Admin();
		    while(choice1!=0)
		    {
		    System.out.println("Do you want to use system as admin. [1/0].Press 2 to exit");
		    Scanner s1=new Scanner(System.in);
		    mode=s1.nextInt();
		    if(mode==1)
		    {
		    
		    	m.displaytoadmin(); int choice;
		    	   Scanner s2=new Scanner(System.in);
		    	   choice=s2.nextInt();
		    	   if(choice==1)
		    	   {
		    		 
		    		   a.setflight();
		    		   flag=true;
		    	   }
		    	   if(choice==2)
		    	   {
		    		   if(flag==true)
		    		   {
		    			   a.printflights();
		    		   }
		    		   else 
		    		   {
		    			   System.out.println("Please create flights first");
		    			   continue;
		    		   }
		    			   
		    	   }
		    	   
		    }
		    else if(mode==0)
		    {
		    	m.displaytocustomer(); int choice=0;
		    	Scanner s3=new Scanner(System.in);
		    	   choice=s3.nextInt();
		    	   if(choice==1)
		    	   {
		    		   String name,address,gender;
					   
		  			 name=""; address=""; int age=0, passport=0; gender="";
		  				
		  			    Scanner sc1= new Scanner(System.in);
		  			   
		  				System.out.println("Enter your details");
		  				System.out.println("Enter name: ");
		  			
		  				name=sc1.nextLine();
		  				System.out.println("Enter gender: ");
		  				
		  				gender=sc1.nextLine();
		  				
		  				System.out.println("Enter address: ");
		  				
		  					address=sc1.nextLine();
		  				
		  				System.out.println("Enter age: ");
		  				try
		  				{
		  					age=sc1.nextInt();
		  				}
		  				catch (InputMismatchException e)
		  				{
		  					System.out.println("Please enter numerical value. Start Reservation Again");
		  					continue;
		  				}
		  				System.out.println("Enter Passport: ");
		  				try
		  				{
		  					passport=sc1.nextInt();
		  				}
		  				catch (InputMismatchException e)
		  				{
		  					System.out.print("Please enter numerical value.Start Reservation Again");
		  					continue;
		  					
		  				}
		  				Passenger p=new Passenger(name,address,passport,age,gender);
			    		   a.setorigin();
		  				 
		    	   }
		    }
		    else if(mode==2)
		    {
		    	choice1=0;
		    }
    }
    }
    }
	

