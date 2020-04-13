/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetClientTemplateDownloadLinkRequest extends RpcAcsRequest<GetClientTemplateDownloadLinkResponse> {
	   

	private String innerIpAddresses;

	private String privateIpAddresses;

	private String token;
	public GetClientTemplateDownloadLinkRequest() {
		super("hbr", "2017-09-08", "GetClientTemplateDownloadLink", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInnerIpAddresses() {
		return this.innerIpAddresses;
	}

	public void setInnerIpAddresses(String innerIpAddresses) {
		this.innerIpAddresses = innerIpAddresses;
		if(innerIpAddresses != null){
			putQueryParameter("InnerIpAddresses", innerIpAddresses);
		}
	}

	public String getPrivateIpAddresses() {
		return this.privateIpAddresses;
	}

	public void setPrivateIpAddresses(String privateIpAddresses) {
		this.privateIpAddresses = privateIpAddresses;
		if(privateIpAddresses != null){
			putQueryParameter("PrivateIpAddresses", privateIpAddresses);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<GetClientTemplateDownloadLinkResponse> getResponseClass() {
		return GetClientTemplateDownloadLinkResponse.class;
	}

}