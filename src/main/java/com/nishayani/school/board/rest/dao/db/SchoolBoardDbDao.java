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
 * File Name			:	SchoolBoardDbDao.java
 * Package Name			:	com.nishayani.school.board.rest.dao.db
 * Date of creation		:	23-Dec-2014  1:05:12 am
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
package com.nishayani.school.board.rest.dao.db;

import java.util.List;

import com.nishayani.school.board.rest.bo.Student;

/**
 * @author bhabesh
 *
 */
public interface SchoolBoardDbDao
{
	/**
	 * 
	 * method name  : getStudents
	 * @return
	 * SchoolBoardDbDao
	 * return type  : List<Student>
	 * 
	 * purpose		: List of students
	 *
	 * Date    		:	27-Dec-2014 8:43:09 pm
	 */
	public List<Student>	getStudents();
	/**
	 * 
	 * method name  : getStudents
	 * @param classNo
	 * @return
	 * SchoolBoardDbDao
	 * return type  : List<Student>
	 * 
	 * purpose		:
	 *
	 * Date    		:	02-Jan-2015 2:43:48 pm
	 */
	public List<Student> getStudents(String classNo);

	/**
	 * 
	 * method name  : getStudent
	 * @param grNo
	 * @return
	 * SchoolBoardDbDao
	 * return type  : List<Student>
	 * 
	 * purpose		:
	 *
	 * Date    		:	02-Jan-2015 8:41:09 pm
	 */
	public List<Student> getStudent(String grNo);
	
	public String getHello(String param);
}
