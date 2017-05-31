package bootcamp2.lesson4.exercise1.model;

public class Employee {

	private String afm;
	private String name;
	private String surname;

	/**
	 * Constructor 
	 * 
	 * @param afm, Employee Tax Registration Number
	 * @param name, Employee firstname
	 * @param surname, Employee surname
	 */
	public Employee(String afm, String name, String surname) {
		super();
		this.afm = afm;
		this.name = name;
		this.surname = surname;
	}

	/* Getters and Setters */
		
	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Employee [afm=" + afm + ", name=" + name + ", surname=" + surname + "]";
	}	

}
