/*
 * Copyright 2005-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Project website:
 *      http://www.cottsoft.com
 */
package com.cottsoft.soa.app.hr.service.impl;

import com.cottsoft.soa.app.hr.service.IRoleService;

/**
 * Class Description: <br> 
 * 
 * @author  Simon.Hoo(simon@cottsoft.com)
 * @date    2013年10月15日
 * @version v1.0
 * @since   1.0
 */
public class RoleService implements IRoleService {

	@Override
	public String getRole(String userId) {
		String returnStr = "";
		try{
//			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//			factory.setServiceClass(LoginWebService.class);
//			//factory.setAddress("http://localhost:8080/com.cottsoft.soa.app.ams/ws/RoleWebService");
//			factory.setAddress("http://localhost:6001/roleWebService");
//			RoleWebService service = (RoleWebService) factory.create();
//			System.out.println("#############Client getRole##############");
//			
//			returnStr = service.getRole(userId);

			returnStr = "admin";
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return returnStr;
	}

}


