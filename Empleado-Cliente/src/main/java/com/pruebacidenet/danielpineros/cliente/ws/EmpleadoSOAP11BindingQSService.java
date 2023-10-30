
package com.pruebacidenet.danielpineros.cliente.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
  * Servicio OSB
  *
  * Esta clase fue generada por JAX-WS RI.
  * JAX-WS RI 2.2.11-b150616.1732
  * Versión fuente generada: 2.2
  *
  */
@WebServiceClient(name = "EmpleadoSOAP11BindingQSService", targetNamespace = "http://com.pruebacidenet.danielpineros/ws",
                  wsdlLocation =
                  "http://192.168.0.145:7101/SBProjectJdevWSEmpleado/proxys/PipelineWSEmpleadoProxyService?wsdl")
public class EmpleadoSOAP11BindingQSService extends Service {

    private final static URL EmpleadoSOAP11BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException EmpleadoSOAP11BINDINGQSSERVICE_EXCEPTION;
    private final static QName EmpleadoSOAP11BINDINGQSSERVICE_QNAME =
        new QName("http://com.pruebacidenet.danielpineros/ws", "EmpleadoSOAP11BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.0.145:7101/SBProjectJdevWSEmpleado/proxys/PipelineWSEmpleadoProxyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EmpleadoSOAP11BINDINGQSSERVICE_WSDL_LOCATION = url;
        EmpleadoSOAP11BINDINGQSSERVICE_EXCEPTION = e;
    }

    public EmpleadoSOAP11BindingQSService() {
        super(__getWsdlLocation(), EmpleadoSOAP11BINDINGQSSERVICE_QNAME);
    }

    public EmpleadoSOAP11BindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EmpleadoSOAP11BINDINGQSSERVICE_QNAME, features);
    }

    public EmpleadoSOAP11BindingQSService(URL wsdlLocation) {
        super(wsdlLocation, EmpleadoSOAP11BINDINGQSSERVICE_QNAME);
    }

    public EmpleadoSOAP11BindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EmpleadoSOAP11BINDINGQSSERVICE_QNAME, features);
    }

    public EmpleadoSOAP11BindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpleadoSOAP11BindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EmpleadoPT
     */
    @WebEndpoint(name = "EmpleadoSOAP11BindingQSPort")
    public EmpleadoPT getEmpleadoSOAP11BindingQSPort() {
        return super.getPort(new QName("http://com.pruebacidenet.danielpineros/ws", "EmpleadoSOAP11BindingQSPort"), EmpleadoPT.class);
    }

    /**
      *
      * Características de @param
      * Una lista de {@link javax.xml.ws.WebServiceFeature} para configurar en el proxy. Las funciones admitidas que no están en el parámetro <code>features</code> tendrán sus valores predeterminados.
      * @devolver
      * devuelve EmpleadoPT
      */
    @WebEndpoint(name = "EmpleadoSOAP11BindingQSPort")
    public EmpleadoPT getEmpleadoSOAP11BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com.pruebacidenet.danielpineros/ws", "EmpleadoSOAP11BindingQSPort"), EmpleadoPT.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (EmpleadoSOAP11BINDINGQSSERVICE_EXCEPTION != null) {
            throw EmpleadoSOAP11BINDINGQSSERVICE_EXCEPTION;
        }
        return EmpleadoSOAP11BINDINGQSSERVICE_WSDL_LOCATION;
    }

}
