package com.pruebacidenet.danielpineros.entidad;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="Empleado",schema="root")
public class Empleado implements Serializable{

	  @Id
	  @Column(name="id")
	  @GeneratedValue(strategy=GenerationType.AUTO,generator="sequence")
	  @SequenceGenerator(name="sequence",sequenceName="seq")
	  private Long empid;
	  
	  @Column(name="name")
	  private String empname;
	  
	  @Column(name="user")
	  private String empuser;
	  
	  @Column(name="password")
	  private String emppassword;
	  
	  @Column(name="dni")
	  private String empdni;
	  
	  @Column(name="email")
	  private String empemail;
	  
	  
	public Long getid() {
		return empid;
	}
	public void setid(Long empid) {
		this.empid = empid;
	}
	public String getname() {
		return empname;
	}
	public void setname(String empname) {
		this.empname = empname;
	}
	public String getuser() {
		return empuser;
	}
	public void setuser(String empuser) {
		this.empuser = empuser;
	}
	public String getpassword() {
		return emppassword;
	}
	public void setpassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getdni() {
		return empdni;
	}
	public void setdni(String empdni) {
		this.empdni = empdni;
	}
	public String getemail() {
		return empemail;
	}
	public void setemail(String empemail) {
		this.empemail = empemail;
	}
	
	
	
}
