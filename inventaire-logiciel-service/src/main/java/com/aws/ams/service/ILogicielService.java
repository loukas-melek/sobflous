package com.aws.ams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aws.ams.entity.ILogiciel;



@Service
public interface ILogicielService {

	List<ILogiciel> List();
	ILogiciel add(ILogiciel ilogiciel);
	ILogiciel update(Long id,ILogiciel ilogiciel);
	void delete(Long id);
	ILogiciel GetILogicielById(Long id);
}
