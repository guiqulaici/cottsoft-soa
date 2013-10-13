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
package com.cottsoft.soa.app.sso.ws;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.cottsoft.soa.app.sso.service.ISSOLoginService;
import com.cottsoft.soa.app.sso.service.impl.SSOLoginService;
import com.cottsoft.soa.app.sso.ws.api.ILoginWebService;

/**
 * Class Description: <br> 
 * SSO登录WS API访问实现类
 * @author  Simon.Hoo(simon@cottsoft.com)
 * @date    Oct 4, 2013
 * @version v1.0
 * @since   1.0
 */
@WebService(endpointInterface = "com.cottsoft.soa.app.sso.ws.api.ILoginWebService", serviceName = "LoginWebService")
@Component("loginWebService")
public class LoginWebService implements ILoginWebService {

	@Override
	public boolean ssoLogin(String userId, String password, String checkCode) {
		ISSOLoginService ssoLoginService = new SSOLoginService();
		
		return ssoLoginService.ssoLogin(userId, password, checkCode);
	}

}


