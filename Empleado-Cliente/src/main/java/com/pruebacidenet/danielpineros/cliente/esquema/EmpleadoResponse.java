
package com.pruebacidenet.danielpineros.cliente.esquema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpleadoResponse", propOrder = { "empstatusnewEmpleado", "Empleados" })
public class EmpleadoResponse {

    @XmlElement(required = true)
    protected String empstatusnewEmpleado;
    protected List<Empleado> Empleados;


    public String getEmpstatusnewEmpleado() {
        return empstatusnewEmpleado;
    }


    public void setEmpstatusnewEmpleado(String value) {
        this.empstatusnewEmpleado = value;
    }


    public List<Empleado> getEmpleados() {
        if (Empleados == null) {
            Empleados = new ArrayList<Empleado>();
        }
        return this.Empleados;
    }

}
