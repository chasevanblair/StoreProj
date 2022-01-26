/**
 * @author chase - Chase Van Blair
 * CIS175 - Fall 2021
 * Jan 26, 2022
 */
package model;

/**
 * @author chase
 *
 */
public class Store {
	private String name;
	private int storeID;
	private int employeeAmount;
	//store is considered "mega" store if more than 200 employees
	//default to false for default constructor
	private boolean isMega = false;
	
	public boolean isMega() {
		return isMega;
	}
	public void setMega(boolean isMega) {
		this.isMega = isMega;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public int getEmployeeAmount() {
		return employeeAmount;
	}
	public void setEmployeeAmount(int employeeAmount) {
		this.employeeAmount = employeeAmount;
		if(employeeAmount > 200)
			isMega = true;
	}
	
	public void hire(int empAmt) {
		employeeAmount += empAmt;
		if(employeeAmount > 200)
			isMega = true;
	}
	
	public Store() {
		
	}
	public Store(String name, int storeID, int employeeAmount) {
		this.name = name;
		this.storeID = storeID;
		this.employeeAmount = employeeAmount;
		if(employeeAmount > 200)
			isMega = true;
	}
	
}
