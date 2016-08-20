package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.domain.Teacher;
import com.example.springboot.repository.TeacherRepository;
import com.example.springboot.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher findById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id);
	}

	@Override
	public Teacher findByPhone(String phone) {
		// TODO Auto-generated method stub
		return teacherRepository.findByPhone(phone);
	}

	@Override
	public Teacher save(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	public TeacherRepository getTeacherRepository() {
		return teacherRepository;
	}

	public void setTeacherRepository(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

}
