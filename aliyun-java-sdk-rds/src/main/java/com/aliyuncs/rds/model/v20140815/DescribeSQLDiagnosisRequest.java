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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLDiagnosisRequest extends RpcAcsRequest<DescribeSQLDiagnosisResponse> {
	
	public DescribeSQLDiagnosisRequest() {
		super("Rds", "2014-08-15", "DescribeSQLDiagnosis", "rds");
	}

	private String dBInstanceId;

	private String sQLDiagId;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public String getSQLDiagId() {
		return this.sQLDiagId;
	}

	public void setSQLDiagId(String sQLDiagId) {
		this.sQLDiagId = sQLDiagId;
		putQueryParameter("SQLDiagId", sQLDiagId);
	}

	@Override
	public Class<DescribeSQLDiagnosisResponse> getResponseClass() {
		return DescribeSQLDiagnosisResponse.class;
	}

}
