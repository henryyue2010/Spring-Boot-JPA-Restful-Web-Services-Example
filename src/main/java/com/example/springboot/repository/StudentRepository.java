package com.example.springboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	Student findById(Long id);
	
	@Query("select s from Student s where s.ssn = ?1")
	Student findBySsn(String ssn);
	
	Page<Student> findAll(Pageable pageable);
}