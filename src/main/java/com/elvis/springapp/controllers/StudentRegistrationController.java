package com.elvis.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elvis.springapp.beans.Student;
import com.elvis.springapp.beans.StudentRegistration;
import com.elvis.springapp.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {

@RequestMapping(method = RequestMethod.POST, value="/register/student")
@ResponseBody
public StudentRegistrationReply registerstudent(@RequestBody Student student) {
	StudentRegistrationReply stdregreply = new StudentRegistrationReply();
	StudentRegistration.getInstance().add(student);
	stdregreply.setName(student.getName());
	stdregreply.setAge(student.getAge());
	stdregreply.setRegistrationNumber(student.getRegistrationNumber());
	stdregreply.setRegistrationStatus("Succesfull");
	return stdregreply;
}



}
