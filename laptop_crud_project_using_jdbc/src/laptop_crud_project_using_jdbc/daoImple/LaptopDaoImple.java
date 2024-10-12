package laptop_crud_project_using_jdbc.daoImple;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import laptop_crud_project_using_jdbc.connection.LaptopConnection;
import laptop_crud_project_using_jdbc.dao.LaptopDao;
import laptop_crud_project_using_jdbc.dto.Laptop;

public class LaptopDaoImple implements LaptopDao{
	
	Connection con=LaptopConnection.getLaptopConnection();
//	Laptop laptop =new Laptop();
	/*
	 * save or insert method or sign up method
	 */	
	public Laptop saveLaptopDao(Laptop laptop) {

		
		try {
			Statement state=con.createStatement();
			
			String insertQuery="insert into laptop values("+laptop.getLaptopId()+",'"+laptop.getLaptopBrandName()+"','"+laptop.getLaptopColor()+"',"+laptop.getLaptopPrice()+",'"+laptop.getSellerName()+"')";
			
			state.execute(insertQuery);
			
		return laptop;	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/*
	 * getByLaptopId
	 */
    public Laptop getByLaptopidDao(int id) {
    	try {
			Statement state=con.createStatement();
			
			String display="select * from laptop where laptopid="+id;
			  ResultSet rs= state.executeQuery(display);
			  
			  while(rs.next()) {
				  
				  Laptop laptop =new Laptop();
				  int id1=rs.getInt("laptopid");
				  String brandName=rs.getString("laptopbrandname");
				  String color=rs.getString("laptopcolor");
				  double price =rs.getDouble("laptopprice");
				  String sellerName=rs.getString("laptopsellerName");
				  
				  laptop.setLaptopId(id1);
				  laptop.setLaptopBrandName(brandName);
				  laptop.setLaptopColor(color);
				  laptop.setLaptopPrice(price);
				  laptop.setSellerName(sellerName);
				  
				  
				  return laptop;
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    return null;	
    }
    /*
     * display all
     */
    
    public List<Laptop> getDisplayAllDao(){
    	try {
			Statement state =con.createStatement();
			
			String display ="Select * from laptop";
			ResultSet rs =state.executeQuery(display);
			
			List<Laptop> laptops =new ArrayList<Laptop>();
			while(rs.next()) {
				Laptop laptop =new Laptop();
				
				laptop.setLaptopId(rs.getInt(1));
				laptop.setLaptopBrandName(rs.getString(2));
				laptop.setLaptopColor(rs.getString(3));
				laptop.setLaptopPrice(rs.getDouble(4));
				laptop.setSellerName(rs.getString(5));
				
				laptops.add(laptop);
				
	       
			}
			
			return laptops;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    return null;	
    }
    /*
     * delete method by Laptopid
     * 
     */
    public int deleteByLaptopIdDao(int id) {
    	
    	try {
			Statement state=con.createStatement();
			
			String deleteQuery="delete from laptop where laptopid="+id;
			return state.executeUpdate(deleteQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    return 0;	
    }
    /*
     * getbyLaptopID to check
     */
    public int getbyLaptopIdDaoTOCheck(int id) {	
    	try {
			Statement state=con.createStatement();
			
			String query="select laptopid from laptop where laptopid="+id;
			ResultSet rs  =state.executeQuery(query);
			if(rs.next()) {
				int id1=rs.getInt("laptopid");
				return id1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return 0;
    }
    
    /*
     * 
     * update method  by getByLaptopId;
     */
    public int updateAllByLaptopIdDao(Laptop laptop,int id) {
    	try {
			Statement state=con.createStatement();
			
			String updateQuery="update laptop set laptopid="+laptop.getLaptopId()+", laptopbrandname='"+laptop.getLaptopBrandName()+"',laptopcolor='"+laptop.getLaptopColor()+"',laptopprice="+laptop.getLaptopPrice()+",laptopsellerName='"+laptop.getSellerName()+"' where laptopid="+id;
			int id1= state.executeUpdate(updateQuery);
			
			return id1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    return 0;	
    }
    
}
