package com.pruebacidenet.danielpineros.dao;

import java.util.List;

import com.pruebacidenet.danielpineros.entidad.*;

public interface EmpleadoDao {
	
	public List<Empleado> getListEmpleado();
	public boolean addEmpleado(Empleado employee);
	public List<Empleado> getListEmpleadoXname(String name);

}
