
public class Flight {

	private static int  noofseats;
	private String Date;
	private String Type;
	private String Origin;
	private String destination;
	private int seatsleft;
	//private Passenger []p;
	Flight()
	{
		noofseats=100;
	}
	Flight(String origin,String Destination,int sleft,String type,String date) 
	{
		Date=date;
		
		Origin=origin;
		destination=Destination;
		
		if(Origin==destination)
		throw new InvalidDestination("Origin and Destination cannot be same");
	
		noofseats=100;
		seatsleft=sleft;
		Type=type;
	}

	public static int getNoofseats() {
		return noofseats;
	}
	public static void setNoofseats(int noofseats) {
		Flight.noofseats = noofseats;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatsleft() {
		return seatsleft;
	}
	public void setSeatsleft(int seatsleft) {
		this.seatsleft = seatsleft;
	}
}
	/*public Passenger[] getP() {
		return p;
	}
	public void setP(Passenger[] p) {
		this.p = p;
	}*/
