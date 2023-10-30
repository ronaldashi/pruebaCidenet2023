
package com.pruebacidenet.danielpineros.cliente.esquema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;




/**
  * Este objeto contiene métodos de fábrica para cada
  * Interfaz de contenido Java e interfaz de elementos Java
  * generado en el paquete com.pe.apps.client.schema.
  * <p>Una ObjectFactory le permite programáticamente
  * construir nuevas instancias de la representación de Java
  * para contenido XML. La representación Java de XML
  * el contenido puede consistir en interfaces derivadas de esquemas
  * y clases que representan el enlace del esquema
  * definiciones de tipo, declaraciones de elementos y modelo
  * grupos. Los métodos de fábrica para cada uno de estos son
  * proporcionado en esta clase.
  *
  */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpleadoRequestElement_QNAME =
        new QName("http://com.pruebacidenet.danielpineros/esquema", "EmpleadoRequestElement");
    private final static QName _EmpleadoResponseElement_QNAME =
        new QName("http://com.pruebacidenet.danielpineros/esquema", "EmpleadoResponseElement");
    private final static QName _EmpleadoExceptionElement_QNAME =
        new QName("http://com.pruebacidenet.danielpineros/esquema", "EmpleadoExceptionElement");

    /**
      * Cree una nueva ObjectFactory que se pueda usar para crear nuevas instancias de clases derivadas de esquemas para el paquete: com.pe.apps.client.schema
      *
      */
    public ObjectFactory() {
    }


    public EmpleadoRequest createEmpleadoRequest() {
        return new EmpleadoRequest();
    }

 
    public EmpleadoResponse createEmpleadoResponse() {
        return new EmpleadoResponse();
    }

 
    public EmpleadoException createEmpleadoException() {
        return new EmpleadoException();
    }

  
    public Empleado createEmpleado() {
        return new Empleado();
    }


    @XmlElementDecl(namespace = "http://com.pruebacidenet.danielpineros/esquema", name = "EmpleadoRequestElement")
    public JAXBElement<EmpleadoRequest> createEmpleadoRequestElement(EmpleadoRequest value) {
        return new JAXBElement<EmpleadoRequest>(_EmpleadoRequestElement_QNAME, EmpleadoRequest.class, null, value);
    }


    @XmlElementDecl(namespace = "http://com.pruebacidenet.danielpineros/esquema", name = "EmpleadoResponseElement")
    public JAXBElement<EmpleadoResponse> createEmpleadoResponseElement(EmpleadoResponse value) {
        return new JAXBElement<EmpleadoResponse>(_EmpleadoResponseElement_QNAME, EmpleadoResponse.class, null, value);
    }

   
    @XmlElementDecl(namespace = "http://com.pruebacidenet.danielpineros/esquema", name = "EmpleadoExceptionElement")
    public JAXBElement<EmpleadoException> createEmpleadoExceptionElement(EmpleadoException value) {
        return new JAXBElement<EmpleadoException>(_EmpleadoExceptionElement_QNAME, EmpleadoException.class, null,
                                                  value);
    }

}
