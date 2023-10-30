package com.pruebacidenet.danielpineros.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebacidenet.danielpineros.entidad.Empleado;

@Repository("empleadoDao")
@Transactional
public class EmpleadoDaoImpl implements EmpleadoDao{

	Logger logger = Logger.getLogger(EmpleadoDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Empleado> getListEmpleado() {
		return (List<Empleado>)sessionFactory.getCurrentSession().createCriteria(Empleado.class).list();
	}

	public boolean addEmpleado(Empleado empleado) {
		boolean flagComplete=false;
		sessionFactory.getCurrentSession().save(empleado);
		flagComplete=true;
		logger.info("Insert new Empleado : "+flagComplete);
		return flagComplete;
	}

	@Override
	public List<Empleado> getListEmpleadoXname(String name) {
		Criteria criteria =sessionFactory.getCurrentSession().createCriteria(Empleado.class);
		criteria.add(Restrictions.like("name", "%"+name+"%"));
		return criteria.list();
	}

	
}
