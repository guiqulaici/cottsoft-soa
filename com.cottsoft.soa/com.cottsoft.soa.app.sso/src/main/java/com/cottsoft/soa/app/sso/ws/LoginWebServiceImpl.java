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

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cottsoft.soa.app.sso.service.ISSOLoginService;
import com.cottsoft.soa.app.sso.service.impl.SSOLoginService;

/**
 * Class Description: <br> 
 * 
 * @author  Simon.Hoo(simon@cottsoft.com)
 * @date    2013年10月14日
 * @version v1.0
 * @since   1.0
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class LoginWebServiceImpl implements LoginWebService {

	@Override
	public boolean ssoLogin(@WebParam(name = "userId") String userId,@WebParam(name = "password") String password) {
		ISSOLoginService ssoLoginService = new SSOLoginService();
		
		return ssoLoginService.ssoLogin(userId, password);
	}

}


