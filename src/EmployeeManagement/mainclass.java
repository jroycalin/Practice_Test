package EmployeeManagement;

public class mainclass {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Jit Roy",1000000);
		Employee e2 = new Employee(101,"Raktim Das",200000);
		Employee e3 = new Employee(102,"Mohit",5000000);
		System.out.print(e1);
		System.out.print("\n"+e2);
		System.out.print("\n"+e3);
		
		SalesPerson sp1 = new SalesPerson(103,"Sales Person1", 200000, 4, 1000);
		SalesPerson sp2 = new SalesPerson(104,"Sales Person1", 400000, 6, 4000);
		System.out.print("\n"+sp1);
		System.out.print("\n"+sp2);
		
		Manager m1 = new Manager(105,"Manager1",100000,1000,6000);
		Manager m2 = new Manager(105,"Manager1",150000,1500,6500);
		System.out.print("\n"+m1);
		System.out.print("\n"+m2);
	}

}
