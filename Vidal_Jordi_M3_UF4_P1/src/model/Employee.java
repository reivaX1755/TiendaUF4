package model;

public class Employee extends Person{
	
	int employeeID;
	final static int USER = 123;
	final static String PASSWORD = "test";
	
	public Employee(String name, int employeeID) {
		super(name);
		this.employeeID = employeeID;
	}
	public int getUSER() {
		return USER;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	
	public static boolean login(int user, String employeePass) {
		boolean isLogged = false;
		if (user == USER && employeePass.equals(PASSWORD)) {
			System.out.println("Login correcto!");
			isLogged = true;
		} else {
			System.out.println("Error durante el login!");

		}
		return isLogged;
	}
	
}
