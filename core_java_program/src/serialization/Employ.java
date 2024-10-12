package serialization;

import java.io.Serializable;

public class Employ  implements Serializable {
	int eid;
	String eName;
	String ePassword;
	int age;
	
	public Employ() {
	}
	public Employ(int eid,String eName,String ePassword,int age) {
		this.eid=eid;
		this.eName=eName;
		this.ePassword=ePassword;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", eName=" + eName + ", ePassword=" + ePassword + ", age=" + age + "]";
	}
	
}
