package com.uca.capas.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.uca.capas.dao.EstudianteDao;
@Repository
public class EstudianteDaoImpl implements EstudianteDao{
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Estudiante> findAll(){
		StringBuffer sb =new StringBuffer();
		sb.append("select * from public.estudiante");
		Query query = entityManager.createNativeQuery(sb.toString(),Estudiante.class);
		List<Estudiante> resultset =query.getResultList();
		return resultset;
		
		
	}
	@Override
	public Estudiante findOne(Integer code){
		Estudiante estudiante = entityManager.find(Estudiante.class,code);
		
		return estudiante;
		
		
	}
	@Override
	public void insert(Estudiante estdiante){
		entityManager.persist(estdiante);
		
		
		
	}
	

}
