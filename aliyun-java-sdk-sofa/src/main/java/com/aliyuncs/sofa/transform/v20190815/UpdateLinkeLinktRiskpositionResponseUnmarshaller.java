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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskpositionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktRiskpositionResponseUnmarshaller {

	public static UpdateLinkeLinktRiskpositionResponse unmarshall(UpdateLinkeLinktRiskpositionResponse updateLinkeLinktRiskpositionResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktRiskpositionResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktRiskpositionResponse.RequestId"));
		updateLinkeLinktRiskpositionResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktRiskpositionResponse.ResultCode"));
		updateLinkeLinktRiskpositionResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktRiskpositionResponse.ResultMessage"));
		updateLinkeLinktRiskpositionResponse.setData(_ctx.booleanValue("UpdateLinkeLinktRiskpositionResponse.Data"));
		updateLinkeLinktRiskpositionResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktRiskpositionResponse.ErrorCode"));
		updateLinkeLinktRiskpositionResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktRiskpositionResponse.ErrorMessage"));
		updateLinkeLinktRiskpositionResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktRiskpositionResponse.ResponseStatusCode"));
		updateLinkeLinktRiskpositionResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktRiskpositionResponse.Success"));
	 
	 	return updateLinkeLinktRiskpositionResponse;
	}
}