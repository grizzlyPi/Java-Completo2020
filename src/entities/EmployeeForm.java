package entities;

public class EmployeeForm {
	
	/********************************************************************************
	 * Wrapper class:																*
	 * A Wrapper class is a class whose object wraps or contains a 					*
	 * primitive data types. When we create an object to a wrapper class, 			*
	 * it contains a field and in this field, we can store a primitive data types. 	*
	 * In other words, we can wrap a primitive value into a wrapper class object.	*
	 ********************************************************************************/
	private Integer id;
	private String name;
	private Double salary;
	
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R - - - - - - - - - -    
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public EmployeeForm(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public void setId(Integer id) {
		this.id = id;
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public void addSalary(Double percent) {
		salary = salary * (1 + percent/100) ; 
	}
	
	
	public String toString() {
		return (getId()
				+ ", "
				+ getName()
				+ ", "
				+ String.format("%.2f", getSalary()));
		
	}
}
