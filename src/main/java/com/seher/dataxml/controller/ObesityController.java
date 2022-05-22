package com.seher.dataxml.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seher.dataxml.model.Obesity;
import com.seher.dataxml.service.ObesityService;
import com.seher.dataxml.service.requests.ObesityRequest;

@RestController
@RequestMapping("/api/data")
public class ObesityController {
	
	private ObesityService obesityService;

	public ObesityController(ObesityService obesityService) {
		super();
		this.obesityService = obesityService;
	}
	
	@PostMapping("/add")
	public boolean add(@RequestBody ObesityRequest obesityRequest) {
		return this.obesityService.add(obesityRequest);
	}
	
	@PutMapping("/update")
	public Obesity update(@RequestBody Obesity obesity) {
		return this.obesityService.update(obesity);
	}
	
	@GetMapping("/getAll")
	public List<Obesity> getAll(){
		return this.obesityService.getAll();
	}
	
	@GetMapping("/getById")
	public Obesity getById(@RequestParam int id){
		return this.obesityService.getById(id);
	}
	
	@DeleteMapping("/delete")
	public boolean delete(@RequestParam int id){
		return this.obesityService.delete(id);
	}
	
	
	

}
