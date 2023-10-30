package com.pruebacidenet.danielpineros.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pruebacidenet.danielpineros.entidad.Empleado;
import com.pruebacidenet.danielpineros.esquema.EmpleadoRequest;
import com.pruebacidenet.danielpineros.esquema.EmpleadoResponse;
import com.pruebacidenet.danielpineros.esquema.ObjectFactory;
import com.pruebacidenet.danielpineros.servicio.EmpleadoService;

@WebService(name = "EmpleadoPT", targetNamespace = "http://com.pruebacidenet.danielpineros/ws", serviceName = "EmpleadoServices",
            portName = "EmpleadoPort", wsdlLocation = "/WEB-INF/wsdl/EmpleadoServices.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public class EmpleadoPTImpl extends SpringBeanAutowiringSupport{
	
	Logger logger = Logger.getLogger(EmpleadoPTImpl.class);
	@Autowired
	@Qualifier("EmpleadoService")
	EmpleadoService EmpleadoServiceImpl;
	
    public EmpleadoPTImpl() {
    }

    @WebResult(name = "EmpleadoResponseElement", partName = "EmpleadoResponse",
               targetNamespace = "http://com.pruebacidenet.danielpineros/esquema")
    @WebMethod(action = "http://com.pruebacidenet.danielpineros/ws/Empleado")
    public EmpleadoResponse Empleado(@WebParam(name = "EmpleadoRequestElement", partName = "EmpleadoRequest",
                                               targetNamespace = "http://com.pruebacidenet.danielpineros/esquema")
                                     EmpleadoRequest EmpleadoRequest) throws EmpleadoExceptionMessage {
    	
    	EmpleadoResponse EmpleadoResponse = new EmpleadoResponse();
    	String action = EmpleadoRequest.getAction();
    	if(action.equals("a")){
    		Empleado Empleado = new Empleado();
    		Empleado.setuser(EmpleadoRequest.getuser());
    		Empleado.setdni(EmpleadoRequest.getdni());
    		Empleado.setemail(EmpleadoRequest.getemail());
    		Empleado.setname(EmpleadoRequest.getname());
    		Empleado.setpassword(EmpleadoRequest.getpassword());
    		
    		boolean rsptaAddEmpleado = EmpleadoServiceImpl.addEmpleado(Empleado);
    		
    		String statusAddEmpleado = rsptaAddEmpleado==true?"OKA":"NO";
    		
    		EmpleadoResponse.setEmpstatusnewEmpleado(statusAddEmpleado);
    		
    	}else if(action.equals("l")){
    		
    		List<Empleado> listEmpleado = new ArrayList<Empleado>();
    		listEmpleado = EmpleadoServiceImpl.getListEmpleado();
    		for(Empleado emp : listEmpleado){
    			com.pruebacidenet.danielpineros.esquema.Empleado EmpleadoSchema = new com.pruebacidenet.danielpineros.esquema.Empleado();
    			EmpleadoSchema.setuser(emp.getuser());
    			EmpleadoSchema.setdni(emp.getdni());
    			EmpleadoSchema.setemail(emp.getemail());
    			EmpleadoSchema.setname(emp.getname());
    			EmpleadoSchema.setpassword(emp.getpassword());
    			EmpleadoResponse.getEmpleados().add(EmpleadoSchema);
    			
    		}
    	
    	}
    	
        return EmpleadoResponse;
    }
}
