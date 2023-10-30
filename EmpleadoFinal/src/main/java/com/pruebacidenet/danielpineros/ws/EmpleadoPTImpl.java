package com.pruebacidenet.danielpineros.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pruebacidenet.danielpineros.esquema.EmpleadoRequest;
import com.pruebacidenet.danielpineros.esquema.EmpleadoResponse;
import com.pruebacidenet.danielpineros.esquema.ObjectFactory;
import com.pruebacidenet.danielpineros.servicios.EmpleadoService;
import com.pruebacidenet.danielpineros.entidad.Empleado;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
@WebService(name = "EmpleadoPT", serviceName = "EmpleadoServices", targetNamespace = "http://com.pruebacidenet.danielpineros/ws",
            portName = "EmpleadoPort")
public class EmpleadoPTImpl extends SpringBeanAutowiringSupport{
    
	@Resource
	WebServiceContext wsctx;
	
	Logger logger = Logger.getLogger(EmpleadoPTImpl.class);
	@Autowired
	@Qualifier("empleadoService")
	EmpleadoService empleadoServiceImpl;
	
	
	
	
	public EmpleadoPTImpl() {
    }

    @WebResult(name = "empleadoResponseElement", partName = "empleadoResponse",
               targetNamespace = "http://com.pruebacidenet.danielpineros")
    @WebMethod(action = "http://com.pruebacidenet.danielpineros/ws/empleado")
    public EmpleadoResponse empleado(@WebParam(name = "empleadoRequestElement", partName = "empleadoRequest",
                                               targetNamespace = "http://com.pruebacidenet.danielpineros")
                                     EmpleadoRequest empleadoRequest) throws EmpleadoExceptionMessage {
    	
    	EmpleadoResponse empleadoResponse = new EmpleadoResponse();
    	
    	String action = empleadoRequest.getAction();
    	
    	if (isAuthentication()){
			    	if (action.equals("a")){
			    		Empleado empleado = new Empleado();
			    		empleado.setUser(empleadoRequest.getUser());
			    		empleado.setDni(empleadoRequest.getDni());
			    		empleado.setEmail(empleadoRequest.getEmail());
			    		empleado.setName(empleadoRequest.getName());
			    		empleado.setPassword(empleadoRequest.getPassword());
			    		
			    		boolean result = empleadoServiceImpl.addEmpleado(empleado);
			    		
			    		String status = result==true?"OKA":"NO";
			    		
			    		empleadoResponse.setStatusnewemployee(action);
			    		
			    	}else if(action.equals("l")){
			    		
			    		List<Empleado> listEmpleado = new ArrayList<Empleado>();
			    		
			    		listEmpleado = empleadoServiceImpl.getListEmpleado();
			    		
			    		for(Empleado emp :listEmpleado){
			    			com.pruebacidenet.danielpineros.esquema.Empleado empleadoSchema = new com.pruebacidenet.danielpineros.esquema.Empleado();
			    			empleadoSchema.setUser(emp.getUser());
			    			empleadoSchema.setDni(emp.getDni());
			    			empleadoSchema.setEmail(emp.getEmail());
			    			empleadoSchema.setName(emp.getName());
			    			empleadoSchema.setPassword(emp.getPassword());
			    			
			    			empleadoResponse.getEmpleados().add(empleadoSchema);
			    			
			    		}
			    		
			    	
			    	}else if(action.equals("b")){
			    		List<Empleado> listEmpleado = new ArrayList<Empleado>();
			    		
			    		listEmpleado = empleadoServiceImpl.getListEmpleadoXname(empleadoRequest.getName());
			    		
			    		for(Empleado emp :listEmpleado){
			    			com.pruebacidenet.danielpineros.esquema.Empleado empleadoSchema = new com.pruebacidenet.danielpineros.esquema.Empleado();
			    			empleadoSchema.setUser(emp.getUser());
			    			empleadoSchema.setDni(emp.getDni());
			    			empleadoSchema.setEmail(emp.getEmail());
			    			empleadoSchema.setName(emp.getName());
			    			empleadoSchema.setPassword(emp.getPassword());
			    			
			    			empleadoResponse.getEmpleados().add(empleadoSchema);
			    			
			    		}
			    	}
    	}
    	
        return empleadoResponse;
    }
    
    public boolean isAuthentication(){
    	MessageContext mctx = wsctx.getMessageContext();
    	Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
    	List userList=(List)http_headers.get("Username");
    	List passList=(List)http_headers.get("Password");
    	
    	String username="";
    	String password="";
    	if(userList!=null){
    		username=userList.get(0).toString();
    	}
    	
    	if(passList!=null){
    		password=passList.get(0).toString();
    	}
    	
    	if(username.equals("daniel")&&password.equals("00000")){
    		return true;
    	}else{
    		return false;
    	}
    	
    	
    }
    
    
  
    
}
