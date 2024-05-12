package EmployeeManagement;

public class SalesPerson extends Employee{
	double sales;
	double comisson;
	
	
	SalesPerson(int E_id, String E_name, double bsal, double sales, double comisson) {
		super(E_id, E_name, bsal);
		this.sales=sales;
		this.comisson=comisson;
	}


	@Override
	public String toString() {
		return "SalesPerson [sales=" + sales + ", comisson=" + comisson + ", E_id=" + E_id + ", E_name=" + E_name
				+ ", Computed Salary=" + computeSal() + "]";
	}


	public double computeSal() {
		
		return getBsal()+sales*comisson;
	}
}
