/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDatabaseLockDiagnosisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseLockDiagnosisResponse extends AcsResponse {

	private String requestId;

	private List<String> deadLockList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getDeadLockList() {
		return this.deadLockList;
	}

	public void setDeadLockList(List<String> deadLockList) {
		this.deadLockList = deadLockList;
	}

	@Override
	public DescribeDatabaseLockDiagnosisResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseLockDiagnosisResponseUnmarshaller.unmarshall(this, context);
	}
}
