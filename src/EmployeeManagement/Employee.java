package EmployeeManagement;

public class Employee {
	protected int E_id=0;
	protected String E_name=null;
	protected double bsal=0;
	
	public Employee(int E_id, String E_name, double bsal){
		this.E_id=E_id;
		this.E_name=E_name;
		this.bsal=bsal;
	}
	
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", Basic Salary=" + bsal + "]";
	}

	public double getBsal() {
		return bsal;
	}

	public void setBsal(double bsal) {
		this.bsal = bsal;
	}

	
}
