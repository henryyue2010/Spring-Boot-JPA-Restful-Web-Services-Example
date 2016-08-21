package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.domain.Teacher;
import com.example.springboot.repository.ITeacherRepository;
import com.example.springboot.service.ITeacherService;

@Service
public class TeacherServiceImpl implements ITeacherService {

	@Autowired
	private ITeacherRepository teacherRepository;

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

	public ITeacherRepository getTeacherRepository() {
		return teacherRepository;
	}

	public void setTeacherRepository(ITeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

}
