package com.example.springboot.service;

import com.example.springboot.domain.Student;

public interface IStudentService {
	Student findById(Long id);

	Student findBySsn(String ssn);

	Student save(Student student);
}
