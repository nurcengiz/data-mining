package com.seher.dataxml.service.impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.seher.dataxml.model.Obesity;
import com.seher.dataxml.repository.ObesityRepository;
import com.seher.dataxml.service.ObesityService;
import com.seher.dataxml.service.requests.ObesityRequest;

@Service
public class ObesityServiceImpls implements ObesityService {

	private ObesityRepository obesityRepo;

	public ObesityServiceImpls(ObesityRepository obesityRepo) {
		super();
		this.obesityRepo = obesityRepo;
	}

	@Override
	public boolean add(ObesityRequest obesityRequest) {

		Obesity obesity = new Obesity();

		obesity.setAge(obesityRequest.getAge());
		obesity.setHeigth(obesityRequest.getHeigth());
		obesity.setWeigth(obesityRequest.getWeigth());

		this.obesityRepo.save(obesity);

		return true;
	}

	@Override
	public Obesity getById(int id) {

		Obesity obesity = this.obesityRepo.findById(id).get();

		return obesity;
	}

	@Override
	public List<Obesity> getAll() {
		return this.obesityRepo.findAll();
	}

	@Override
	public boolean delete(int id) {

		this.obesityRepo.deleteById(id);

		return true;
	}

	@Override
	public Obesity update(Obesity obesity) {

		return this.obesityRepo.save(obesity);
	}

}
