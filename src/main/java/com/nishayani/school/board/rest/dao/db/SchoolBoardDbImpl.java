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
 * File Name			:	SchoolBoardDbImpl.java
 * Package Name			:	com.nishayani.school.board.rest.dao.db
 * Date of creation		:	23-Dec-2014  1:04:18 am
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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nishayani.school.board.rest.bo.Parent;
import com.nishayani.school.board.rest.bo.Student;
import com.nishayani.school.board.rest.utility.Constants;

/**
 * @author bhabesh
 *
 */
public class SchoolBoardDbImpl implements SchoolBoardDbDao
{
	
	private	NamedParameterJdbcTemplate	namedParameterJdbcTemplate;
	private	Properties					properties;
	private	DataSource					dataSource;
	
	public SchoolBoardDbImpl(){}
	
	public SchoolBoardDbImpl(DataSource dataSource, Properties properties)
	{
		
		this.properties					=	properties;
		System.out.println("constructor with param");
	}

	
	
	/**
	 * Setter method : setProperties
	 * @param properties the properties to set
	 * 
	 * Date          : 27-Dec-2014 8:55:57 pm
	 */
	public void setProperties(Properties properties)
	{
		this.properties = properties;
			
	}

	/**
	 * Setter method : setDataSource
	 * @param dataSource the dataSource to set
	 * 
	 * Date          : 27-Dec-2014 8:55:57 pm
	 */
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
		this.namedParameterJdbcTemplate	=	new NamedParameterJdbcTemplate(dataSource);
	}

	/**
	 * 
	 * method name  : getStudents
	 * @return
	 * SchoolBoardDbImpl
	 * return type  : List<Student>
	 * 
	 * purpose		: Get Students list
	 *
	 * Date    		:	27-Dec-2014 8:34:52 pm
	 */
	public List<Student>	getStudents()
	{
		String	SQL_PROP_STUDENT_LIST	=	properties.getProperty(Constants.SQL_PROP_STUDENT_LIST);
		RowMapper<Student> mapper	= new RowMapper<Student>()
		{

			@Override
			public Student mapRow(ResultSet rs, int rowMapper) throws SQLException
			{
				
				return getStudent(rs);
			}
			
		};
		
		Map<String, String> map	=	new HashMap<>();

		return namedParameterJdbcTemplate.query(SQL_PROP_STUDENT_LIST,map,mapper);
	}
	
	/**
	 * 
	 * method name  : getStudents
	 * @param classNo
	 * @return
	 * SchoolBoardDbImpl
	 * return type  : List<Student>
	 * 
	 * purpose		:
	 *
	 * Date    		:	02-Jan-2015 2:43:14 pm
	 */
	public List<Student> getStudents(String classNo)
	{
		String	SQL_PROP_STUDENT_CLASS_LIST	=	properties.getProperty(Constants.SQL_PROP_STUDENT_CLASS_LIST);
		RowMapper<Student> mapper	=	new RowMapper<Student>()
		{
			
			@Override
			public Student mapRow(ResultSet rs, int arg1) throws SQLException
			{
				
				return getStudent(rs);
			}
		};
		
		Map<String, String> 	paramMap	=	new HashMap<String,String>();
		paramMap.put("paramClass", classNo);
		
		
		
		return namedParameterJdbcTemplate.query(SQL_PROP_STUDENT_CLASS_LIST, paramMap, mapper);
		
	}

	/**
	 * 
	 */
	public List<Student> getStudent(String grNo)
	{
		String	SQL_PROP_STUDENT_GRNO	=	properties.getProperty(Constants.SQL_PROP_STUDENT_GRNO);
		RowMapper<Student> mapper	=	new RowMapper<Student>()
		{
			
			@Override
			public Student mapRow(ResultSet rs, int arg1) throws SQLException
			{
				
				return getStudent(rs);
			}
		};
		
		Map<String, String> 	paramMap	=	new HashMap<String,String>();
		paramMap.put("paramGrNo", grNo);
		
		
		
		return namedParameterJdbcTemplate.query(SQL_PROP_STUDENT_GRNO, paramMap, mapper);
		
	}
	
	/**
	 * 
	 * method name  : getStudent
	 * @param rs
	 * @return
	 * @throws SQLException
	 * SchoolBoardDbImpl
	 * return type  : Student
	 * 
	 * purpose		:
	 *
	 * Date    		:	02-Jan-2015 2:43:05 pm
	 */
	private Student getStudent(ResultSet rs) throws SQLException
	{
		Student	student	=	new Student();
		Parent	parent	=	new Parent();
		student.setGrno(rs.getString(Constants.SQL_COL_GR_NUMBER));
		student.setFirstName(rs.getString(Constants.SQL_COL_STD_FIRST_NAME));
		student.setMiddleName(rs.getString(Constants.SQL_COL_STD_MIDDLE_NAME));
		student.setLastName(rs.getString(Constants.SQL_COL_STD_LAST_NAME));
		student.setClassAdmission(rs.getString(Constants.SQL_COL_STD_CLASS));
		
		parent.setName(rs.getString(Constants.SQL_COL_PARENT_FIRST_NAME));
		parent.setPhoneMobile01(rs.getString(Constants.SQL_COL_PARENT_PHONE_MOB_01));
		parent.setEmail01(rs.getString(Constants.SQL_COL_PARENT_EMAIL_01));
		parent.setRelation(rs.getString(Constants.SQL_COL_PARENT_RELATION));
		
		student.setParent(parent);
		return student;
		
	}
	
	public String getHello(String param)
	{
		return "Hello : "+param;
	}
	
	
	
}
