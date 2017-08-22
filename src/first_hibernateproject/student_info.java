package first_hibernateproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="STUDENT_INFORMATION")
public class student_info {
private int rollno;
private String name;
@Id
public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public void setName(String name) {
	this.name = name;
}



}
