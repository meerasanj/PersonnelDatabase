import java.io.*;

class HourlyEmployee extends Employee implements Serializable {
	public HourlyEmployee(String name, double hourlyWage) { // constructor 
		super(name, hourlyWage); // calls Employee constructor 
	}

	public double computePay(int hoursWorked) {
		if(hoursWorked <= 40) {
			return getHourlyWage() * hoursWorked;
		} else {
			return (40 * getHourlyWage()) + ((hoursWorked - 40) * (getHourlyWage() * 1.5));
		}
	}

	public String toString() {
		String formattedName = String.format("%-30s", getName());
		String formattedWage = String.format("$%.2f/hour", getHourlyWage());
		return formattedName + formattedWage;
	}
}
