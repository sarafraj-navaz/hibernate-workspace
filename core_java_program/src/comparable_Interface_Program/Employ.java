package comparable_Interface_Program;

public class Employ implements Comparable<Employ>{
	int eid;
	String eName;
	String eEmail;
	double eSalary;
	int age;
	
	public Employ() {
	}
	public Employ(int eid,String eName,String eEmail,double eSalary,int age) {
		this.eid=eid;
		this.eName=eName;
		this.eEmail=eEmail;
		this.eSalary=eSalary;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return eid+" "+eName+" "+eEmail+" "+eSalary+" "+age;
	}
	/*
	 * @Override
	 * public int compareTo(Employ e) { return
	 * (int)this.eName.compareTo(e.eName); }
	 */
	/*
	 * @Override 
	 * public int compareTo(Employ e) {
	 * 
	 * return (int)(this.eSalary-e.eSalary); }
	 */
	/*
	 * @Override 
	 * public int compareTo(Employ e) {
	 * 
	 * return this.age-e.age; }
	 */
	@Override
	public int compareTo(Employ e) {
		
		return this.eid-e.eid;
	}
	

}
