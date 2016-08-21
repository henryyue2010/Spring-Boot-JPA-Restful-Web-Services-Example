package com.example.springboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.domain.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

	Teacher findById(Long id);

	@Query("select t from Teacher t where t.phone = ?1")
	Teacher findByPhone(String phone);

	Page<Teacher> findAll(Pageable pageable);
}