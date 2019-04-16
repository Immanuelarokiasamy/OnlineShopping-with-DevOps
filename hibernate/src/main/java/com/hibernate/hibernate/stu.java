package com.hibernate.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class stu {
	@Id
private int studid;
private String studname;
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}

}
