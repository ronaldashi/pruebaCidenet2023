package com.pruebacidenet.danielpineros.entidad;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="empleado",schema="root")
public class Empleado implements Serializable{

	  @Id
	  @Column(name="id")
	  @GeneratedValue(strategy=GenerationType.AUTO,generator="sequence")
	  @SequenceGenerator(name="sequence",sequenceName="EMP_SEQ")
	  private Long id;
	  
	  @Column(name="name")
	  private String name;
	  
	  @Column(name="user")
	  private String user;
	  
	  @Column(name="password")
	  private String password;
	  
	  @Column(name="dni")
	  private String dni;
	  
	  @Column(name="email")
	  private String email;
	  
	  public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
	
}
