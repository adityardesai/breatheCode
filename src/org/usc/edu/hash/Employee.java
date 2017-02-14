package org.usc.edu.hash;

public class Employee {
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object obj) {
		Boolean equivalentResult = Boolean.FALSE;
		if (obj == null) {
			equivalentResult = Boolean.FALSE;
		}
		if (getClass() != obj.getClass()) {
			equivalentResult=Boolean.FALSE;
		}
		if (obj == this) {
			equivalentResult=Boolean.TRUE;
		}
		Employee e = (Employee) obj;
		if(this.getId() == e.getId()){
			equivalentResult=Boolean.TRUE;
		}
		return equivalentResult;
	}
	
	@Override
	public int hashCode() { 
		final int PRIME = 32;
	    int result = 1;
	    result = PRIME * result + getId();
	    return result;
	}

}
