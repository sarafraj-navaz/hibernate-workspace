package interface_inside_Solve_Ambiguity_Problem;

public class DriveC__Ambiguity_Solve_Class {

	public static void main(String[] args) {
		
		/**
		 * we can access this way
		 *by providing Parent Object refrence
		 */
		A_Ambiguity_Solve a =new C_Ambiguity_Solve_Class();
		a.dance();
		
		B_Ambiguity_Solve b=new C_Ambiguity_Solve_Class();
		b.dance();
		
		C_Ambiguity_Solve_Class c =new C_Ambiguity_Solve_Class();
		c.dance();
		
		
		/**
		 * by is down Casting
		 */
		A_Ambiguity_Solve a1 =new C_Ambiguity_Solve_Class();
		a.dance();
		
    
		B_Ambiguity_Solve b1 =(B_Ambiguity_Solve)a1;
		b1.dance();
		
		
		C_Ambiguity_Solve_Class c2 =(C_Ambiguity_Solve_Class)b1;
		b1.dance();
		
	}

}
