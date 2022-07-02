package com.aws.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.aws.ams.entity.ILogiciel;
import com.aws.ams.repository.ILogicielRepository;

@Service
public class ILogicielServiceImp implements ILogicielService{
	@Autowired 
	ILogicielRepository rep;

	@Override
	public List<ILogiciel> List() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public ILogiciel add(ILogiciel ilogiciel) {
		// TODO Auto-generated method stub
		return rep.save(ilogiciel);
	}

	@Override
	public ILogiciel update(Long id, ILogiciel ilogiciel) {
		// TODO Auto-generated method stub
		ILogiciel up = rep.getById(id);
		if(up!=null) {
			up.setClassification(ilogiciel.getClassification());
			up.setDescription(ilogiciel.getDescription());
			up.setEditeur(ilogiciel.getEditeur());
			up.setEmplacement(ilogiciel.getEmplacement());
			up.setProprietaire(ilogiciel.getProprietaire());
			up.setType(ilogiciel.getType());
			
			rep.save(up);
		}
		return up;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
	}

	@Override
	public ILogiciel GetILogicielById(Long id) {
		// TODO Auto-generated method stub
		return rep.getById(id);
	}
	
	
}
