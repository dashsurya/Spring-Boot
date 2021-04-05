package com.example.task2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface empRepository extends JpaRepository<empDetails, Integer> {

	//List<empDetails> findBySalaryGreaterThan(int salary);
	
//	@Query("Select e from empDetails e where e.salary>?1")
//	List<empDetails> findBySalary(int salary);
	
	List<empDetails> findBySalaryGreater(int salary);


	
}
