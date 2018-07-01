package net.antra.deptemp4.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id", columnDefinition="int")
	private Integer id;
	
	@Column(name="dept_name")
	private String name;
	
	@Column(name="dept_email")
	private String email;
	
	@Column(name="descb")
	private String desc;
	
	@Column(name="statusId", columnDefinition="int")
	private Integer statusID;
	
	@Column(name="contact")
	private String contact;
	
	@OneToMany(mappedBy="department")
	private Set<Employee> employees;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getStatusID() {
		return statusID;
	}

	public void setStatusID(Integer statusID) {
		this.statusID = statusID;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", email=" + email + ", desc=" + desc + ", statusID="
				+ statusID + ", contact=" + contact + "]";
	}	

}
