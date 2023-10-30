
package com.pruebacidenet.danielpineros.esquema;

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

    /**
     * Gets the value of the empstatusnewEmpleado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmpstatusnewEmpleado() {
        return empstatusnewEmpleado;
    }

    /**
     * Sets the value of the empstatusnewEmpleado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmpstatusnewEmpleado(String value) {
        this.empstatusnewEmpleado = value;
    }

  /**
      * Obtiene el valor de la propiedad de los empleados.
      *
      *
      * Este método de acceso devuelve una referencia a la lista en vivo,
      * no es una instantánea. Por lo tanto, cualquier modificación que realice en el
      * la lista devuelta estará presente dentro del objeto JAXB.
      * Es por eso que no hay un método <CODE>set</CODE> para la propiedad de los empleados.
      *
      *
      * Por ejemplo, para agregar un nuevo elemento, haga lo siguiente:
      * <antes>
      * getEmpleados().add(newItem);
      * </pre>
      *
      *
      *
      * Los objetos de los siguientes tipos están permitidos en la lista
      * {@link Empleado }
      *
      *
      */
    public List<Empleado> getEmpleados() {
        if (Empleados == null) {
            Empleados = new ArrayList<Empleado>();
        }
        return this.Empleados;
    }

}
