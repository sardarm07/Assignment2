
public class Passenger {

	private String name;
	private String address;
	private int passport;
	private int age;
	private String gender;
	Passenger()
	{
		name="";
	}
	Passenger(String nam,String add,int pass,int age,String gender)
	{
		name=nam;
		address=add;
		passport=pass;
		this.age=age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPassport() {
		return passport;
	}
	public void setPassport(int passport) {
		this.passport = passport;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
