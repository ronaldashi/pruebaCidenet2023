
package com.pruebacidenet.danielpineros.cliente.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.pruebacidenet.danielpineros.cliente.esquema.*;


/**
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebService(name = "EmpleadoPT", targetNamespace = "http://com.pruebacidenet.danielpineros/ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface EmpleadoPT {


    /**
     *
     * @param EmpleadoRequest
     * @return
     *     returns com.pe.apps.client.schema.EmpleadoResponse
     * @throws EmpleadoExceptionMessage
     */
    @WebMethod(action = "http://com.pruebacidenet.danielpineros/ws/Empleado")
    @WebResult(name = "EmpleadoResponseElement", targetNamespace = "http://com.pruebacidenet.danielpineros/esquema",
               partName = "EmpleadoResponse")
    public EmpleadoResponse Empleado(@WebParam(name = "EmpleadoRequestElement",
                                               targetNamespace = "http://com.pruebacidenet.danielpineros/esquema",
                                               partName = "EmpleadoRequest")
                                     EmpleadoRequest EmpleadoRequest) throws EmpleadoExceptionMessage;

}
