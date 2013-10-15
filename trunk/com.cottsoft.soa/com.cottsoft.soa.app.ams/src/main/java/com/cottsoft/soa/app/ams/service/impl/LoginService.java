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

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.cottsoft.soa.app.ams.service.ILoginService;
import com.cottsoft.soa.app.sso.ws.LoginWebService;

/**
 * Class Description: <br>
 * 
 * @author Simon.Hoo(simon@cottsoft.com)
 * @date 2013年10月15日
 * @version v1.0
 * @since 1.0
 */
public class LoginService implements ILoginService {

	@Override
	public boolean doLogin(String userId, String password) {
		boolean returnBol = false;
		try{
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(LoginWebService.class);
			//factory.setAddress("http://localhost:8080/com.cottsoft.soa.app.sso/ws/LoginWebService");
			factory.setAddress("http://localhost:6001/ssoLogin");
			LoginWebService service = (LoginWebService) factory.create();
			System.out.println("#############Client ssoLogin##############");
			
			returnBol = service.ssoLogin(userId, password);

		}catch(Exception e){
			e.printStackTrace();
		}
		
		return returnBol;
	}

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(LoginWebService.class);
		factory.setAddress("http://localhost:6001/ssoLogin");
		LoginWebService service = (LoginWebService) factory.create();
		System.out.println("#############Client ssoLogin##############");
		boolean b = service.ssoLogin("aaa", "aaaaa.123");
		System.out.println(b);

	}
}
