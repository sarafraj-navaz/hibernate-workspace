package hotel_Reservation_System_jdbc.dto;

public class Customer {
	private int customerId;
	private String customerFName;
	private String customerLName;
	private String fullName;
	private String customerEmail;
	private String customerPhoneNumber;
	private int  customerAge;
	private int  customerRoomNumber;
	private String customerAddress;
	private int customerByGivenMoney;
	
	
	
	public Customer(){
		
	}
	public Customer(String fullName,String  email,String phone,int age,int rNumber,String cAddress,int cByGivenMoney) {
		this.fullName=fullName;
		this.customerEmail=email;
		this.customerPhoneNumber=phone;
		this.customerAge=age;
		this.customerRoomNumber=rNumber;
		this.customerAddress=cAddress;
		this.customerByGivenMoney=cByGivenMoney;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int cId) {
		this.customerId=cId;
	}
	public String getFName() {
		return customerFName;
	}
	public void setFName(String fName) {
		this.customerFName=fName;
	}
	
	public String getLName() {
		return customerLName;
	}
	public void setLName(String lName) {
		this.customerLName=lName;
	}
	public String getEmail() {
		return customerEmail;
	}
	public void setEmail(String email) {
		this.customerEmail=email;
	}
	public String getPhone() {
		return customerPhoneNumber;
	}
	public void setPhone(String number) {
		this.customerPhoneNumber=number;
	}
	public int getAge() {
		return customerAge;
	}
	public void setAge(int age) {
		this.customerAge=age;
	}
	public int getRoomNumber() {
		return customerRoomNumber;
	}
	public void setRoomNumber(int rNumber) {
		this.customerRoomNumber=rNumber;
	}
	public String getAddress() {
		return customerAddress;
	}
	public int getCByGiverMoney() {
		return customerByGivenMoney;
	}
	public void setByGivenMoney(int money) {
		this.customerByGivenMoney=money;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
}
