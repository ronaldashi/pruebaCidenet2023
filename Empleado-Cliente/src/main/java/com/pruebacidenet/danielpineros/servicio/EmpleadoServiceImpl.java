package com.pruebacidenet.danielpineros.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pruebacidenet.danielpineros.dao.EmpleadoDao;
import com.pruebacidenet.danielpineros.entidad.Empleado;

@Service("EmpleadoService")
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

	Logger logger = Logger.getLogger(EmpleadoServiceImpl.class);
	
	@Autowired
	@Qualifier("EmpleadoDao")
	EmpleadoDao EmpleadoDaoImpl;
	
	public List<Empleado> getListEmpleado() {
		return EmpleadoDaoImpl.getListEmpleado();
	}

	public boolean addEmpleado(Empleado Empleado) {
		return EmpleadoDaoImpl.addEmpleado(Empleado);
	}

}
