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
package com.cottsoft.soa.app.ams.service.impl;

import com.cottsoft.soa.app.ams.service.IRoleService;

/**
 * Class Description: <br> 
 * 
 * @author  Simon.Hoo(simon@cottsoft.com)
 * @date    Oct 4, 2013
 * @version v1.0
 * @since   1.0
 */
public class RoleService implements IRoleService {

	@Override
	public String getRole(String userName) {
		
		//实际业务由DAO从数据库获得
		if(userName.startsWith("a")){
			return "admin";
		}else if(userName.startsWith("u")){
			return "user";
		}else if(userName.startsWith("s")){
			return "system";
		}else if(userName.startsWith("m")){
			return "manager";
		}else{
			return "unkown";
		}
	}

}


