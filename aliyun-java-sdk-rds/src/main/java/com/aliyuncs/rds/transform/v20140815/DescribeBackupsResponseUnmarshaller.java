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
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupExtractionStatus;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupMethod;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupMode;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupScale;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupStatus;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext context) {
		
		describeBackupsResponse.setRequestId(context.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setTotalRecordCount(context.stringValue("DescribeBackupsResponse.TotalRecordCount"));
		describeBackupsResponse.setPageNumber(context.stringValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageRecordCount(context.stringValue("DescribeBackupsResponse.PageRecordCount"));
		describeBackupsResponse.setTotalBackupSize(context.integerValue("DescribeBackupsResponse.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("DescribeBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(context.stringValue("DescribeBackupsResponse.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(BackupStatus.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStatus")));
			backup.setBackupStartTime(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(BackupType.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupType")));
			backup.setBackupMode(BackupMode.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMode")));
			backup.setBackupMethod(BackupMethod.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMethod")));
			backup.setBackupDownloadURL(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadURL"));
			backup.setBackupIntranetDownloadURL(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupLocation(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(BackupExtractionStatus.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupExtractionStatus")));
			backup.setBackupScale(BackupScale.getEnum(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupScale")));
			backup.setBackupDBNames(context.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(context.longValue("DescribeBackupsResponse.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(context.longValue("DescribeBackupsResponse.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(context.stringValue("DescribeBackupsResponse.Items["+ i +"].HostInstanceID"));

			items.add(backup);
		}
		describeBackupsResponse.setItems(items);
	 
	 	return describeBackupsResponse;
	}
}