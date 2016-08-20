package com.example.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot.domain.Teacher;
import com.example.springboot.service.TeacherService;

public class TeacherController implements JsonResponse {

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getTeacherById(@PathVariable("id") Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Teacher teacher = teacherService.findById(id);
			if (teacher != null) {
				map.put("teacher", teacher);
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
}
