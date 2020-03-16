package com.example.DemoBootJpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.DemoBootJpa.dao.PersonRepo;
import com.example.DemoBootJpa.model.Person;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping(value={"/addPerson"}, method = RequestMethod.GET)
	public String addPerson(@Valid Person person) {
		System.err.println("person="+person.getPerson_Name());
		repo.save(person);
		return "home.jsp";
	}
	
	@RequestMapping(value={"/getPerson"}, method = RequestMethod.GET)
	public ModelAndView getPerson(@ RequestParam int Person_Id) {
		ModelAndView mv =new ModelAndView("showData.jsp");
		Person person =repo.findById(Person_Id).orElse(new Person());
		
		//System.out.println(repo.findByPerson_Tech("java");
		//System.out.println(repo.findByPerson_IdGreaterThan(102));
		
		mv.addObject(person);		
		return mv;
		
		
	}
	
	
	@RequestMapping(value={"/deletePerson"}, method = RequestMethod.GET)
	public String deletePerson(@Valid Person personId) {
		System.out.println("");
	repo.deleteById(personId.getPerson_Id());
		return "delete.jsp";
	}
	
	@RequestMapping(value={"/updatePerson"}, method = RequestMethod.GET)
	public String updatePerson(@Valid Person person) {
		System.out.println("");
	repo.save(person);
		return "update.jsp";
	}

}
 	