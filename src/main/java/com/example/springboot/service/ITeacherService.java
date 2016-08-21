package com.example.springboot.service;

import com.example.springboot.domain.Teacher;

public interface TeacherService {

	Teacher findById(Long id);

	Teacher findByPhone(String phone);

	Teacher save(Teacher teacher);
}
