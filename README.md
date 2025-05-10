# Personnel Management System

## Project Description

This Java-based **Personnel Management System** is designed to manage and interact with employee records. It allows users to perform various operations such as:

- Adding new employees
- Computing paychecks
- Raising wages
- Printing employee records
- Downloading/uploading employee data to/from a file

The system is modular and object-oriented, utilizing multiple classes including:

- `Employee.java` (abstract base class)
- `HourlyEmployee.java`
- `SalariedEmployee.java`
- `Personnel.java` (main driver class)

---

## Program Workflow

### Main Algorithm

- Initializes an `ArrayList<Employee>` to store employee records.
- Uses a `Scanner` to read user input via a continuous loop-driven menu.
- Menu Options:
  - `n`: Add a new employee (either hourly or salaried)
  - `c`: Compute paychecks based on hours worked
  - `r`: Raise wages by a user-specified percentage
  - `p`: Print all employee records
  - `d`: Download employee data to `employee.dat`
  - `u`: Upload employee data from `employee.dat`
  - `q`: Quit the program

### Menu Functionality

- **New Employee (`n`)**  
  Prompts for the employee's name and type (hourly `h` or salaried `s`). A corresponding object (`HourlyEmployee` or `SalariedEmployee`) is created and added to the `ArrayList`.

- **Compute Paychecks (`c`)**  
  Prompts for hours worked and calculates pay using the overridden `computePay()` method based on employee type.

- **Raise Wages (`r`)**  
  Prompts for a percentage increase, then adjusts the pay for each employee accordingly.

- **Print Records (`p`)**  
  Iterates through the list and prints details of each employee.

- **Download Data (`d`)**  
  Serializes and saves the employee list to a binary file `employee.dat`.

- **Upload Data (`u`)**  
  Loads employee data from the `employee.dat` file using deserialization.

- **Quit (`q`)**  
  Exits the application gracefully.

---

## Class Overview

### `Employee` (Abstract Class)

- Common attributes (e.g., `name`)
- Abstract method: `computePay()`
- Base for all employee types

### `HourlyEmployee`

- Extends `Employee`
- Attributes: `hourlyWage`
- Overrides `computePay()`
- Method for raising hourly wages

### `SalariedEmployee`

- Extends `Employee`
- Attributes: `annualSalary`
- Overrides `computePay()`
- Method for raising salary

### `Personnel`

- Main driver class
- Maintains the menu interface
- Handles employee operations and file I/O
- Manages the `ArrayList<Employee>`

---

## Input & Output

### Input

- Employee name
- Type (hourly/salaried)
- Wage/salary
- Hours worked
- Raise percentage

### Output

- Paycheck amounts
- Updated records
- Serialized data file (`employee.dat`)
- Console-based messages and interaction

---

## File Operations

- **Download (`d`)**: Saves employee data in binary format using Java serialization.
- **Upload (`u`)**: Loads and reconstructs the employee list from the `employee.dat` file.

---

## How to Compile and Run

```bash
javac Personnel.java
java Personnel
```

 ## License
 No license has been provided for this project
