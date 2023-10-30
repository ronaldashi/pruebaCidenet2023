package com.pruebacidenet.danielpineros.servicio;

import java.util.List;

import com.pruebacidenet.danielpineros.entidad.Empleado;

public interface EmpleadoService {
	public List<Empleado> getListEmpleado();
	public boolean addEmpleado(Empleado Empleado);

}
