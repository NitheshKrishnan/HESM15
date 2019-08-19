package edu.jspiders.studentmvcproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jspiders.studentmvcproject.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDAO dao;
}
