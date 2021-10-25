import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {

	private Flight[] f;
	
	public Admin()
	{
		f=new Flight[10];
	}
	public void setflight()
	{
		 int choice=-1; int index=0;
		while(choice!=0) {
		String origin, Destination = null, type, date; int sleft;
		System.out.println("Do you want to create flight 1 for yes 0 for no");
		Scanner s1=new Scanner(System.in);
		choice=s1.nextInt();
		if(choice==0)
			continue;
		else if(choice==1)
		{
		System.out.println("Creating flight.You can create 10 flights at a time");
		System.out.println("Enter Origin.");
		Scanner s7=new Scanner(System.in);
		origin=s7.nextLine();
		System.out.println("Enter Destination.");
		Scanner s8=new Scanner(System.in);
		origin=s8.nextLine();
		System.out.println("Enter Date.");
		Scanner s3=new Scanner(System.in);
		date=s3.nextLine();
		System.out.println("Enter flighttype.");
		Scanner s4=new Scanner(System.in);
		type=s4.nextLine();
		System.out.println("Enter Seatsleft.");
		Scanner s5=new Scanner(System.in);
		sleft=s5.nextInt();
		try {
		f[index]=new Flight(origin,Destination,sleft,type,date);
		index+=1;
		}catch(InvalidDestination id)
		{
			System.out.println(id.getMessage());
		}
		if(index==9)
			choice=0;
		}
	}
	}
	public void printflights()
	{
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println("Flight Details are as follows");
				System.out.println(i+1+"   Origin   "+f[i].getOrigin()+" ");
				System.out.println(i+1+"   Destination   "+f[i].getDestination()+" ");
				System.out.println(i+1+"   Date   "+f[i].getDate()+" ");
				System.out.println(i+1+"   Type   "+f[i].getType()+" ");
				System.out.println(i+1+"   Sleaft   "+f[i].getSeatsleft()+" ");
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception");
			}
		}
	}
	public void setorigin()
	{
		String origin,destination;
		System.out.println("Enter Origin");
		Scanner s5=new Scanner(System.in);
		origin=s5.nextLine();
		System.out.println("Enter Destination");
		Scanner s6=new Scanner(System.in);
		destination=s6.nextLine();
		
		for(int i=0;i<10;i++)
		{
			try {
			if(f[i].getOrigin()==origin && f[i].getDestination()==destination)
			{
				System.out.println("Following flight will be reserved for you");
				System.out.println("Origin:  "+f[i].getOrigin()+"   "+"Destination "+f[i].getDestination()+" ");
				System.out.println("Date:  "+f[i].getDate()+"   "+"Type "+f[i].getType()+" ");
				int slefts=f[i].getSeatsleft()-1;
				f[i].setSeatsleft(slefts);
			}
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception");
				break;
			}
		}
	}
}
