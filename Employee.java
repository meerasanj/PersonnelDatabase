import java.io.*;

abstract class Employee implements Serializable {
	private String name;
	private double hourlyWage;

	public Employee(String name, double hourlyWage) { // constructor 
		this.name = name;
		this.hourlyWage = hourlyWage;
	}

	public String getName() { // getter method 
		return name;
	} 

	public void setName(String name) { // setter method 
		this.name = name;
	}

	public double getHourlyWage() { // getter method 
		return hourlyWage;
	}
	
	public void setHourlyWage(double hourlyWage) { // setter method 
		this.hourlyWage = hourlyWage;
	}

	public void increaseHourlyWage(double percentage) {
		hourlyWage *= 1 + percentage / 100; // increases hourlyWage by given percentage 
	}

	public abstract double computePay(int hoursWorked); // abstract method 
}
