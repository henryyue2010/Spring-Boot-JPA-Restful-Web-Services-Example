package com.example.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.domain.Student;
import com.example.springboot.dto.StudentDto;
import com.example.springboot.service.IStudentService;
import com.example.springboot.service.ITeacherService;

@RestController
public class StudentController implements JsonResponse {

	@Autowired
	private IStudentService studentService;

	@Autowired
	private ITeacherService teacherService;

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getStudentById(@PathVariable("id") Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Student student = studentService.findById(id);
			if (student != null) {
				map.put("student", student);
				map.put(SUCCESS, true);
			} else {
				map.put(SUCCESS, false);
				map.put(ERROR, NULLVALUE);
			}
		} catch (Exception e) {
			map.put(SUCCESS, false);
			map.put(ERROR, e);
		}
		return map;
	}

	@RequestMapping(value = "/student/create", method = RequestMethod.POST)
	public @ResponseBody Object createStudent(@RequestBody StudentDto studentDto) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (studentDto != null) {
				Student student = new Student();
				student.setName(studentDto.getName());
				student.setSsn(studentDto.getSsn());
				map.put("student", studentService.save(student));
				map.put(SUCCESS, true);
			} else {
				map.put(SUCCESS, false);
				map.put(ERROR, "StudentDto is " + NULLVALUE);
			}
		} catch (Exception e) {
			map.put(SUCCESS, false);
			map.put(ERROR, e);
		}
		return map;
	}
}
