package com.aws.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.ams.entity.IReseau;
import com.aws.ams.service.IReseauService;


@RestController
@RequestMapping({"/reseau"})
@CrossOrigin
public class IReseauController {

	@Autowired
	IReseauService service;
	
	@GetMapping("/list")
	 public List<IReseau> list() {
	 return service.List();
	 }
	@GetMapping("{id}")
	 public IReseau getOne(@PathVariable Long id) {
	 return service.GetIReseauById(id);
	 }
	
	@PostMapping("/add")
	public IReseau add(@RequestBody IReseau reseau) {
		return service.add(reseau);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public IReseau update(@PathVariable Long id, @RequestBody IReseau reseau) {
		return service.update(id, reseau);
	}
}
