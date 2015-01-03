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
 * File Name			:	SchoolRestApplication.java
 * Package Name			:	com.nishayani.school.board.rest.application
 * Date of creation		:	23-Dec-2014  4:15:36 pm
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
package com.nishayani.school.board.rest.application;

import org.glassfish.jersey.server.ResourceConfig;

import com.nishayani.school.board.rest.controller.SchoolBoardController;
import com.nishayani.school.board.rest.service.SchoolBoardServiceImpl;

/**
 * @author bhabesh
 *
 */
public class SchoolRestApplication extends ResourceConfig
{
	public SchoolRestApplication()
	{
		register(SchoolBoardController.class);
		register(SchoolBoardServiceImpl.class);
	}
	
}
