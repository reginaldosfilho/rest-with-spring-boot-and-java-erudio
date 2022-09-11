package br.com.reginaldo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reginaldo.data.vo.v1.PersonVO;
import br.com.reginaldo.data.vo.v2.PersonVOV2;
import br.com.reginaldo.exceptions.ResourceNotFoundException;
import br.com.reginaldo.mapper.DozerMapper;
import br.com.reginaldo.mapper.custom.PersonMapper;
import br.com.reginaldo.model.Person;
import br.com.reginaldo.repositories.PersonRepository;

@Service
public class PersonServices {

	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private PersonMapper mapper;

	public List<PersonVO> findAll() {
		logger.info("Finding all people!");
		
		return DozerMapper.parseListObjects(repository.findAll(), PersonVO.class);
	}

	public PersonVO findById(Long id) {

		logger.info("Finding one PersonVO!");

		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
		
		return DozerMapper.parseObject(entity, PersonVO.class);
	}

	public PersonVO create(PersonVO person) {

		logger.info("Creating one PersonVO!");
		
		var entity = DozerMapper.parseObject(person, Person.class);
		
		var vo = DozerMapper.parseObject(repository.save(entity), PersonVO.class);
		
		return vo;
	}
	
	public PersonVOV2 createV2(PersonVOV2 person) {

		logger.info("Creating one Person with V2!");
		
		var entity = mapper.convertVoToEntity(person);
		
		var vo = mapper.convertEntityToVo(repository.save(entity));
		
		return vo;
	}

	public PersonVO update(PersonVO person) {

		logger.info("Updating one PersonVO!");
		
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		var vo = DozerMapper.parseObject(repository.save(entity), PersonVO.class);
		
		return vo;
	}

	public void delete(Long id) {

		logger.info("Deleting one PersonVO!");
		
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
		
		repository.delete(entity);
	}

}
