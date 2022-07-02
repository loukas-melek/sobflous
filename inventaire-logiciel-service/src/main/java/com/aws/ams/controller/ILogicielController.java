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

import com.aws.ams.entity.ILogiciel;
import com.aws.ams.service.ILogicielService;

@RestController
@RequestMapping({"/logiciel"})
@CrossOrigin
public class ILogicielController {

	@Autowired
	ILogicielService service;
	
	@GetMapping("/list")
	 public List<ILogiciel> list() {
	 return service.List();
	 }
	@GetMapping("{id}")
	 public ILogiciel getOne(@PathVariable Long id) {
	 return service.GetILogicielById(id);
	 }
	
	@PostMapping("/add")
	public ILogiciel add(@RequestBody ILogiciel iLogiciel) {
		return service.add(iLogiciel);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public ILogiciel update(@PathVariable Long id, @RequestBody ILogiciel iLogiciel) {
		return service.update(id, iLogiciel);
	}
}
