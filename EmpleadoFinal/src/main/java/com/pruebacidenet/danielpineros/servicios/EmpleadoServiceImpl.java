package com.pruebacidenet.danielpineros.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pruebacidenet.danielpineros.dao.EmpleadoDao;
import com.pruebacidenet.danielpineros.entidad.Empleado;

@Service("empleadoService")
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{
	
	Logger logger = Logger.getLogger(EmpleadoServiceImpl.class);
	@Autowired
	@Qualifier("empleadoDao")
	EmpleadoDao empleadoDaoImpl;
	
	public List<Empleado> getListEmpleado() {
		
		return empleadoDaoImpl.getListEmpleado();
	}

	public boolean addEmpleado(Empleado empleado) {
		return empleadoDaoImpl.addEmpleado(empleado);
	}

	@Override
	public List<Empleado> getListEmpleadoXname(String name) {
		return empleadoDaoImpl.getListEmpleadoXname(name);
	}

}

