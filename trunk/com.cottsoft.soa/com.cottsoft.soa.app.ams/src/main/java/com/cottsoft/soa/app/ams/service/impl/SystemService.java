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

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleContext;
import org.mule.api.MuleMessage;
import org.mule.api.client.LocalMuleClient;
import org.mule.api.context.MuleContextFactory;
import org.mule.context.DefaultMuleContextFactory;

import com.cottsoft.soa.app.ams.service.ISystemService;

/**
 * Class Description: <br> 
 * 
 * @author  Simon.Hoo(simon@cottsoft.com)
 * @date    2013年10月14日
 * @version v1.0
 * @since   1.0
 */
public class SystemService implements ISystemService {

	@Override
	public String getSystemDate() {
		String returnStr = "";
		try {
			MuleContextFactory muleContextFactory = new DefaultMuleContextFactory();  
			
			MuleContext context = muleContextFactory.createMuleContext();
			context.start();   
			   
			LocalMuleClient client = context.getClient();   
			MuleMessage reply  = client.send("http://localhost:6003/system", new DefaultMuleMessage("DATETIME",context));

			returnStr = reply.getPayloadAsString();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return returnStr;
	}

}


