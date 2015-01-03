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
 * File Name			:	Student.java
 * Package Name			:	com.nishayani.school.board.rest.bo
 * Date of creation		:	23-Dec-2014  7:12:00 pm
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
package com.nishayani.school.board.rest.bo;

/**
 * @author bhabesh
 *
 */
public class Student
{
	private	String 	grno;
	private String	firstName;
	private	String	middleName;
	private	String	lastName;
	private	String	classAdmission;
	private	Parent	parent;
	
	/**
	 * Getter Method	: getGrno
	 * @return the grno
	 * 
	 * Date				: 23-Dec-2014
	 */
	public String getGrno()
	{
		return grno;
	}
	/**
	 * Setter method : setGrno
	 * @param grno the grno to set
	 * 
	 * Date          : 23-Dec-2014 7:17:44 pm
	 */
	public void setGrno(String grno)
	{
		this.grno = grno;
	}
	/**
	 * Getter Method	: getFirstName
	 * @return the firstName
	 * 
	 * Date				: 23-Dec-2014
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * Setter method : setFirstName
	 * @param firstName the firstName to set
	 * 
	 * Date          : 23-Dec-2014 7:17:44 pm
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * Getter Method	: getMiddleName
	 * @return the middleName
	 * 
	 * Date				: 23-Dec-2014
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	 * Setter method : setMiddleName
	 * @param middleName the middleName to set
	 * 
	 * Date          : 23-Dec-2014 7:17:44 pm
	 */
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	/**
	 * Getter Method	: getLastName
	 * @return the lastName
	 * 
	 * Date				: 23-Dec-2014
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * Setter method : setLastName
	 * @param lastName the lastName to set
	 * 
	 * Date          : 23-Dec-2014 7:17:44 pm
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * Getter Method	: getClassAdmission
	 * @return the classAdmission
	 * 
	 * Date				: 23-Dec-2014
	 */
	public String getClassAdmission()
	{
		return classAdmission;
	}
	/**
	 * Setter method : setClassAdmission
	 * @param classAdmission the classAdmission to set
	 * 
	 * Date          : 23-Dec-2014 7:17:44 pm
	 */
	public void setClassAdmission(String classAdmission)
	{
		this.classAdmission = classAdmission;
	}
	
	/**
	 * Getter Method	: getParent
	 * @return the parent
	 * 
	 * Date				: 02-Jan-2015
	 */
	public Parent getParent()
	{
		return parent;
	}
	/**
	 * Setter method : setParent
	 * @param parent the parent to set
	 * 
	 * Date          : 02-Jan-2015 11:45:32 am
	 */
	public void setParent(Parent parent)
	{
		this.parent = parent;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [grno=" + grno + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", classAdmission=" + classAdmission + ", parent=" + parent
				+ "]";
	}
	
	
}
