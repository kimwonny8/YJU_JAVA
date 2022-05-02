package Main;

class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public String toString() {
		return name +", "+address +", "+RRN+", "+salary;
	}
	
	public void printRRN() {
		System.out.println(RRN);
	}
}

class Manager extends Employee{
	private int bonus;
	
	public void printSalary() {
		System.out.println(name+"("+address+"):"+(salary+bonus));
	}
}

public class ManagerTest {

	public static void main(String[] args) {
		Manager m =new Manager();
		m.printRRN();
		System.out.println(m.toString());
	}

}
