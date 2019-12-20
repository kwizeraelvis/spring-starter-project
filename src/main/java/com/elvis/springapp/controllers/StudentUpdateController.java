package com.elvis.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elvis.springapp.beans.Student;
import com.elvis.springapp.beans.StudentRegistration;

@Controller
public class StudentUpdateController {

@RequestMapping(method = RequestMethod.PUT, value="/update/student")
@ResponseBody
public String updateStudentRecord(@RequestBody Student student) {
	return StudentRegistration.getInstance().updateStudent(student);
}
	
}
