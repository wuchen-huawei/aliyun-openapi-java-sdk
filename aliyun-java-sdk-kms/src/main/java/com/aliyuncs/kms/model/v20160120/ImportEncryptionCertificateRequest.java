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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportEncryptionCertificateRequest extends RpcAcsRequest<ImportEncryptionCertificateResponse> {
	   

	private String asymmetricAlgorithm;

	private String symmetricAlgorithm;

	private String encryptedPrivateKey;

	private String encryptedSymmetricKey;

	private String certificateId;

	private String certificate;

	private String certificateChain;
	public ImportEncryptionCertificateRequest() {
		super("Kms", "2016-01-20", "ImportEncryptionCertificate", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAsymmetricAlgorithm() {
		return this.asymmetricAlgorithm;
	}

	public void setAsymmetricAlgorithm(String asymmetricAlgorithm) {
		this.asymmetricAlgorithm = asymmetricAlgorithm;
		if(asymmetricAlgorithm != null){
			putQueryParameter("AsymmetricAlgorithm", asymmetricAlgorithm);
		}
	}

	public String getSymmetricAlgorithm() {
		return this.symmetricAlgorithm;
	}

	public void setSymmetricAlgorithm(String symmetricAlgorithm) {
		this.symmetricAlgorithm = symmetricAlgorithm;
		if(symmetricAlgorithm != null){
			putQueryParameter("SymmetricAlgorithm", symmetricAlgorithm);
		}
	}

	public String getEncryptedPrivateKey() {
		return this.encryptedPrivateKey;
	}

	public void setEncryptedPrivateKey(String encryptedPrivateKey) {
		this.encryptedPrivateKey = encryptedPrivateKey;
		if(encryptedPrivateKey != null){
			putQueryParameter("EncryptedPrivateKey", encryptedPrivateKey);
		}
	}

	public String getEncryptedSymmetricKey() {
		return this.encryptedSymmetricKey;
	}

	public void setEncryptedSymmetricKey(String encryptedSymmetricKey) {
		this.encryptedSymmetricKey = encryptedSymmetricKey;
		if(encryptedSymmetricKey != null){
			putQueryParameter("EncryptedSymmetricKey", encryptedSymmetricKey);
		}
	}

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
		if(certificateId != null){
			putQueryParameter("CertificateId", certificateId);
		}
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
		if(certificate != null){
			putQueryParameter("Certificate", certificate);
		}
	}

	public String getCertificateChain() {
		return this.certificateChain;
	}

	public void setCertificateChain(String certificateChain) {
		this.certificateChain = certificateChain;
		if(certificateChain != null){
			putQueryParameter("CertificateChain", certificateChain);
		}
	}

	@Override
	public Class<ImportEncryptionCertificateResponse> getResponseClass() {
		return ImportEncryptionCertificateResponse.class;
	}

}
