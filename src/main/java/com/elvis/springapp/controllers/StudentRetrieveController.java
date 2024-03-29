package com.elvis.springapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elvis.springapp.beans.StudentRegistration;
import com.elvis.springapp.beans.Student;
@Controller
public class StudentRetrieveController {

@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
@ResponseBody
public List<Student> getAllStudents(){
	return StudentRegistration.getInstance().getStudentRecords();
}
}
