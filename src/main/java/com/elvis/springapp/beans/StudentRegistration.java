package com.elvis.springapp.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	 private List<Student> StudentRecords;
	 private static StudentRegistration stdregd = null;
	 
	 private StudentRegistration() {
		 StudentRecords = new ArrayList<Student>();
	 }
	 
	 public static StudentRegistration getInstance() {
		 if(stdregd == null) {
			 stdregd = new StudentRegistration();
			 return stdregd;
		 }else {
			 return stdregd;
		 }
	 }
	 
	 public void add(Student std) {
		 StudentRecords.add(std);
	 }
	 public String updateStudent(Student std) {
		 for(int i = 0; i < StudentRecords.size(); i++) {
			 Student stn = StudentRecords.get(i);
			 if(stn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				 StudentRecords.set(i, std);
				 return "Update Succesfull";
			 }
		 }
		 return "Update unsuccesfull";
	 }
	 public String deleteStudent(String registrationNumber) {
		 for(int i = 0; i < StudentRecords.size(); i++) {
			 Student stn = StudentRecords.get(i);
			 if(stn.getRegistrationNumber().equals(registrationNumber)) {
				 StudentRecords.remove(i);
				 return "Student Deletion was Succesfull";
			 }
		 }
		 return "Student Deletion was unsuccesfull";
	 }
	 public List<Student> getStudentRecords(){
		 return StudentRecords;
	 }
}
