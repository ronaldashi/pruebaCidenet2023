
package com.pruebacidenet.danielpineros.ws;

import javax.xml.ws.WebFault;

import com.pruebacidenet.danielpineros.esquema.EmpleadoException;


/**
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebFault(name = "empleadoExceptionElement", targetNamespace = "http://com.pruebacidenet.danielpineros")
public class EmpleadoExceptionMessage extends Exception {

    /**
      * Tipo de Java que va como soapenv: elemento de detalle de falla.
      *
    */
    private EmpleadoException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public EmpleadoExceptionMessage(String message, EmpleadoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EmpleadoExceptionMessage(String message, EmpleadoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.pe.apps.schema.EmpleadoException
     */
    public EmpleadoException getFaultInfo() {
        return faultInfo;
    }

}
