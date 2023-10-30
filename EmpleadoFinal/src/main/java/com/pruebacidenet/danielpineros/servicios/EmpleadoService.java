package com.pruebacidenet.danielpineros.servicios;

import java.util.List;

import com.pruebacidenet.danielpineros.entidad.Empleado;

public interface EmpleadoService {
	public List<Empleado> getListEmpleado();
	public boolean addEmpleado(Empleado empleado);
	public List<Empleado> getListEmpleadoXname(String name);
}
