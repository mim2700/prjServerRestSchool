/**
 * Project				:	prjServerRestSchool
 * Organization			:	Sultan Qaboos University | Muscat | Oman
 * Centre				:	Centre for Information System
 * Department			:	Planning & Development
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	SchoolBoardController.java
 * Package Name			:	com.nishayani.school.board.rest.controller
 * Date of creation		:	23-Dec-2014  1:39:03 am
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2014 the original author or authors and Organization.
 *
 * Licensed under the SQU, CIS policy
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package com.nishayani.school.board.rest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.nishayani.school.board.rest.bo.Student;
import com.nishayani.school.board.rest.dao.db.SchoolBoardDbDao;
import com.nishayani.school.board.rest.service.SchoolBoardServiceDao;

/**
 * @author bhabesh
 *
 */
@Path("/schoolBoard")
public class SchoolBoardController
{
	@Autowired
	SchoolBoardServiceDao	schoolBoardServiceDao;

	/*
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String greet()
	  {
		  System.out.println("inside greet method");
		  return schoolBoardServiceDao.getHello("Test !! ");
	  }
	 */ 
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Student> getStudents()
	  {
		  return schoolBoardServiceDao.getStudents();
	  }
	  
	  @GET
	  @Path("/class/{classNo}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Student> getStudents(@PathParam("classNo") String classNo)
	  {
		  return schoolBoardServiceDao.getStudents(classNo);
	  }
	  
	  @GET
	  @Path("/grno/{grno}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<Student> getStudent(@PathParam("grno") String grno)
	  {
		  return schoolBoardServiceDao.getStudent(grno);
	  }
	  
	  
}
