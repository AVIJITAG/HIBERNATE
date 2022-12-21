package maven.employe;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity    // marking this class as Entity

@Table(name="Employee_Details_") // specifies the table name where data of this entity

public class Employee {
	@Id  // marks identifier of class
	 private int empID;
	private String empfirstname,emplastname,empemail,empadd;
	private double empsalary;
	private long empphone;

}
