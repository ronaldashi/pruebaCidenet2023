package com.pruebacidenet.danielpineros.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebacidenet.danielpineros.entidad.Empleado;

@Repository("EmpleadoDao")
@Transactional
public class EmpleadoDaoImpl implements EmpleadoDao{

	Logger logger = Logger.getLogger(EmpleadoDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Empleado> getListEmpleado() {
		return (List<Empleado>)sessionFactory.getCurrentSession().createCriteria(Empleado.class).list();
	}

	public boolean addEmpleado(Empleado Empleado) {
		boolean flagcomplete=false;
		sessionFactory.getCurrentSession().save(Empleado);
		flagcomplete=true;
		logger.info("Insert new Empleado : "+flagcomplete);
		return flagcomplete;
	}

}
