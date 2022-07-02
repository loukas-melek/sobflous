package com.aws.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aws.ams.entity.IReseau;
import com.aws.ams.repository.IReseauRepository;

@Service
public class IReseauServiceImp implements IReseauService {
	
	@Autowired
	IReseauRepository rep;
	
	@Override
	public List<IReseau> List() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public IReseau add(IReseau ireseau) {
		// TODO Auto-generated method stub
		return rep.save(ireseau);
	}

	@Override
	public IReseau update(Long id, IReseau ireseau) {
		// TODO Auto-generated method stub
		IReseau up = rep.getOne(id);
		if(up!= null) {
			up.setClassification(ireseau.getClassification());
			up.setEmplacement(ireseau.getEmplacement());
			up.setEquipement(ireseau.getEquipement());
			up.setMarque(ireseau.getMarque());
			up.setNombre(ireseau.getNombre());
			up.setProprietaire(ireseau.getProprietaire());
			up.setRedandonce(ireseau.getRedandonce());
			
			rep.save(up);
		}
		
		return up;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);;
	}

	@Override
	public IReseau GetIReseauById(Long id) {
		// TODO Auto-generated method stub
		return rep.getById(id);
	}

}
