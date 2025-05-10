import java.io.*;

class SalariedEmployee extends Employee implements Serializable {
	private double annualSalary;

	public SalariedEmployee(String name, double annualSalary) { // constructor 
		super(name, annualSalary / (40 * 52));
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() { // getter method 
		return annualSalary; 
	}

	public void setAnnualSalary(double annualSalary) { // setter method 
		this.annualSalary = annualSalary;
		setHourlyWage(annualSalary / (40 * 52)); // converts to hourly wage
	}

	public double computePay(int hoursWorked) {
		return (annualSalary / 52);
	}

	public String toString() {
		String formattedName = String.format("%-30s", getName());
		String formattedSalary = String.format("$%.2f/year", getAnnualSalary());
		return formattedName + formattedSalary;
	}
}
