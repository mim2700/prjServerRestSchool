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
 * File Name			:	Constants.java
 * Package Name			:	com.nishayani.school.board.rest.utility
 * Date of creation		:	27-Dec-2014  4:49:17 pm
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
package com.nishayani.school.board.rest.utility;

/**
 * @author bhabesh
 *
 */
public interface Constants
{
	/* ---------- CONSTNTS - SQL - COLUMNS ---------*/
	public final static	String	SQL_COL_GR_NUMBER			=	"GR_NUMBER";
	public final static	String	SQL_COL_STD_FIRST_NAME		=	"STD_FIRST_NAME";
	public final static	String	SQL_COL_STD_MIDDLE_NAME		=	"STD_MIDDLE_NAME";
	public final static	String	SQL_COL_STD_LAST_NAME		=	"STD_LAST_NAME";
	public final static	String	SQL_COL_STD_CLASS			=	"STD_CLASS";

	
	public final static String	SQL_COL_PARENT_FIRST_NAME	=	"PARENT_FIRST_NAME";	
	public final static String	SQL_COL_PARENT_MIDDLE_NAME 	=	"PARENT_MIDDLE_NAME";
	public final static String	SQL_COL_PARENT_LAST_NAME	=	"PARENT_LAST_NAME";
	public final static String	SQL_COL_PARENT_EMAIL_01		=	"PARENT_EMAIL_01";
	public final static String	SQL_COL_PARENT_EMAIL_02		=	"PARENT_EMAIL_02";
	public final static String	SQL_COL_PARENT_PHONE_MOB_01	=	"PARENT_PHONE_MOB_01";
	public final static String	SQL_COL_PARENT_PHONE_MOB_02	=	"PARENT_PHONE_MOB_02";
	public final static String	SQL_COL_PARENT_PHONE_OFF_01	=	"PARENT_PHONE_OFF_01";
	public final static String	SQL_COL_PARENT_PHONE_OFF_02	=	"PARENT_PHONE_OFF_02";
	public final static String	SQL_COL_PARENT_PHONE_HOME_01=	"PARENT_PHONE_HOME_01";
	public final static String	SQL_COL_PARENT_PHONE_HOME_02=	"PARENT_PHONE_HOME_02";
	public final static String	SQL_COL_PARENT_RELATION		=	"PARENT_RELATION";
	public final static String	SQL_COL_PARENT_ADDRESS		=	"PARENT_ADDRESS";

	
	/* ---------- CONSTNTS - SQL - PROPERTIES ---------*/
	public final static	String	SQL_PROP_STUDENT_LIST		=	"student.list";
	public final static	String	SQL_PROP_STUDENT_CLASS_LIST	=	"student.list.class";
	public final static	String	SQL_PROP_STUDENT_GRNO		=	"student.list.grno";
}
