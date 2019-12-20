package com.elvis.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elvis.springapp.beans.StudentRegistration;

@Controller
public class StudentDeleteController {
	
@RequestMapping(method = RequestMethod.DELETE, value = "/delete/student/{regdNum}")
@ResponseBody
public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
	return StudentRegistration.getInstance().deleteStudent(regdNum);
}
	
}
