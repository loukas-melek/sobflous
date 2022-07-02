package com.aws.ams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aws.ams.entity.IReseau;

@Service
public interface IReseauService {
	List<IReseau> List();
	IReseau add(IReseau ireseau);
	IReseau update(Long id,IReseau ireseau);
	void delete(Long id);
	IReseau GetIReseauById(Long id);
}
