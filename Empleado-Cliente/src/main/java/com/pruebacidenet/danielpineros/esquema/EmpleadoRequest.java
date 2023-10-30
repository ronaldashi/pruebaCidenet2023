
package com.pruebacidenet.danielpineros.esquema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpleadoRequest", propOrder = { "action", "name", "user", "password", "dni", "email" })
public class EmpleadoRequest {

    @XmlElement(required = true)
    protected String action;
    protected String name;
    protected String user;
    protected String password;
    protected String dni;
    protected String email;

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getname() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setname(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getuser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setuser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getpassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setpassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the dni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getdni() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setdni(String value) {
        this.dni = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getemail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setemail(String value) {
        this.email = value;
    }

}
