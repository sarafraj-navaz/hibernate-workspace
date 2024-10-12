package laptop_crud_project_using_jdbc.dto;

public class Laptop {
	private int laptopId;
	private String laptopBrandName;
	private String laptopColor;
	private double laptopPrice;
	private String laptopSellerName;
	
	public Laptop(){
	}
	public Laptop(int id,String name,String color,double price,String sellerName){
		this.laptopId=id;
		this.laptopBrandName=name;
		this.laptopColor=color;
		this.laptopPrice=price;
		this.laptopSellerName=sellerName;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int id) {
		this.laptopId=id;
	}
	public String getLaptopBrandName() {
		return laptopBrandName;
	}
	public void setLaptopBrandName(String name) {
		this.laptopBrandName=name;
	}
	public double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(double price) {
		this.laptopPrice=price;
	}
	public String getSellerName() {
		return laptopSellerName;
	}
	public void setSellerName(String sellerName) {
		this.laptopSellerName=sellerName;
	}
	public String getLaptopColor() {
		return laptopColor;
	}
	public void setLaptopColor(String color) {
		this.laptopColor=color;
	}
}
