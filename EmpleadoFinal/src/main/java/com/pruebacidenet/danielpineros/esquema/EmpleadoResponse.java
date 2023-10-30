
package com.pruebacidenet.danielpineros.esquema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleadoResponse", propOrder = { "statusnewempleado", "empleados" })
public class EmpleadoResponse {

    @XmlElement(required = true)
    protected String statusnewempleado;
    protected List<Empleado> empleados;

    /**
     * Gets the value of the empstatusnewemployee property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusnewemployee() {
        return statusnewempleado;
    }

    /**
     * Sets the value of the empstatusnewemployee property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusnewemployee(String value) {
        this.statusnewempleado = value;
    }

    public List<Empleado> getEmpleados() {
        if (empleados == null) {
            empleados = new ArrayList<Empleado>();
        }
        return this.empleados;
    }

}
