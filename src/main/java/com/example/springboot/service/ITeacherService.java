package com.example.springboot.service;

import com.example.springboot.domain.Teacher;

public interface ITeacherService {

	Teacher findById(Long id);

	Teacher findByPhone(String phone);

	Teacher save(Teacher teacher);
}
