package com.example.task2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empController {
	
	@Autowired
	private empRepository EmpRepository;
	
	@RequestMapping("/employees")
	public List<empDetails> getAllEmployees(){
		return (List<empDetails>) EmpRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody empDetails EmpDetails) {
		EmpRepository.save(EmpDetails);
		
	}
//	@GetMapping("/employee/{id}")
//    public List<ArrayList> findByName(@PathVariable final int id){
//        return EmpRepository.findById(id);
//    }
	
	@RequestMapping("/employee/{salary}")
	public List<empDetails> getQuery(@PathVariable int salary){
		return (List<empDetails>) EmpRepository.findBySalaryGreater(salary);
	}

}
