package bootcamp2.lesson4.exercise1.model;

public class Student {

	private String name;
	private String surname;
	private String am;	

	/**
	 * Constructor
	 * 
	 * @param name,
	 *            String
	 * @param surname,
	 *            String
	 * @param am,
	 *            String
	 */
	public Student(String name, String surname, String am) {

		this.name = name;
		this.surname = surname;
		this.am = am;
		
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

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

}
