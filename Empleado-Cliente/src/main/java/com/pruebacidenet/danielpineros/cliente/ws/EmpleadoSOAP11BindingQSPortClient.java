package com.pruebacidenet.danielpineros.cliente.ws;

import com.pruebacidenet.danielpineros.cliente.esquema.*;

// Este archivo fuente es generado por las herramientas de Oracle.
// Los contenidos pueden estar sujetos a cambios.
// Para reportar problemas, use lo siguiente:
// Generado por Oracle JDeveloper 12c Development Build 12.2.1.1.0.2047
public class EmpleadoSOAP11BindingQSPortClient {
    public static void main(String[] args) {
    	try {
    		 
        EmpleadoSOAP11BindingQSService EmpleadoSOAP11BindingQSService = new EmpleadoSOAP11BindingQSService();
        EmpleadoPT EmpleadoPT = EmpleadoSOAP11BindingQSService.getEmpleadoSOAP11BindingQSPort();
       
        EmpleadoRequest EmpleadoRequest = new EmpleadoRequest();
        
        EmpleadoRequest.setAction("a"); 
        EmpleadoRequest.setuser("teddyone");
        EmpleadoRequest.setdni("33333");
        EmpleadoRequest.setemail("tedy@tat.com");
        EmpleadoRequest.setname("Tedy trejos");
        EmpleadoRequest.setpassword("12345");
        
       
		EmpleadoResponse empResponse = EmpleadoPT.Empleado(EmpleadoRequest);
		String rptaInsertEmpleado = empResponse.getEmpstatusnewEmpleado();
		System.out.println("Insert Empleado : "+rptaInsertEmpleado);
		
	
		
		EmpleadoRequest.setAction("l");
		
		empResponse = EmpleadoPT.Empleado(EmpleadoRequest);
		
		for(com.pruebacidenet.danielpineros.cliente.esquema.Empleado emp : empResponse.getEmpleados()){
			System.out.println("name : "+emp.getname()+" alias : "+emp.getuser() +" doc identity : "+emp.getdni());
		}
		
		} catch (EmpleadoExceptionMessage e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
        
        


    }
}
