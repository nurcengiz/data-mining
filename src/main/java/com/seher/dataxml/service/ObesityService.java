package com.seher.dataxml.service;

import java.util.List;

import com.seher.dataxml.model.Obesity;
import com.seher.dataxml.service.requests.ObesityRequest;

public interface ObesityService {
	
	
	boolean add(ObesityRequest obesityRequest);//post 
	
	Obesity getById(int id);//get
	
	List<Obesity> getAll();//get
	
	boolean delete(int id);//delete
	
	Obesity update(Obesity obesity);//put
	
}
