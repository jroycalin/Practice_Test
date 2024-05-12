package EmployeeManagement;

public class Manager extends Employee{
	double foodallow;
	double petrolallow;
	
	
public Manager(int E_id, String E_name, double bsal, double foodallow, double petrolallow) {
		super(E_id, E_name, bsal);
		this.foodallow = foodallow;
		this.petrolallow = petrolallow;
	}



@Override
public String toString() {
	return "Manager [foodallow=" + foodallow + ", petrolallow=" + petrolallow + ", E_id=" + E_id + ", E_name=" + E_name
			+ ", Computed Salary=" + computeSal() + "]";
}

public double computeSal() {
		
		return getBsal()+foodallow+petrolallow;
	}
}
