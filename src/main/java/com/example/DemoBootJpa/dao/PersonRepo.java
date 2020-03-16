package com.example.DemoBootJpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DemoBootJpa.model.Person;


@Repository
public interface PersonRepo extends CrudRepository<Person, Integer>
{
	//List <Person> findByPerson_Tech(String person_Tech); 
	

}
