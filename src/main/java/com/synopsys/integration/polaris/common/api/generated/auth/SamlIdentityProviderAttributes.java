/**
 * polaris-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.polaris.common.api.generated.auth;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class SamlIdentityProviderAttributes extends PolarisComponent {
    @SerializedName("entity-id")
    private String entityId;

    @SerializedName("saml-email-domains")
     private List<Object> samlEmailDomains = null;

    @SerializedName("signature-algorithm")
    private String signatureAlgorithm;

    @SerializedName("slo-url")
    private String sloUrl;

    @SerializedName("sso-url")
    private String ssoUrl;

    @SerializedName("x509-cert-base64")
    private String x509CertBase64;

    /**
     * Get entityId
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public SamlIdentityProviderAttributes addSamlEmailDomainsItem(Object samlEmailDomainsItem) {
        if (this.samlEmailDomains == null) {
            this.samlEmailDomains = new ArrayList<>();
        }
        this.samlEmailDomains.add(samlEmailDomainsItem);
        return this;
    }

    /**
     * Get samlEmailDomains
     * @return samlEmailDomains
     */
    public List<Object> getSamlEmailDomains() {
        return samlEmailDomains;
    }

    public void setSamlEmailDomains(List<Object> samlEmailDomains) {
        this.samlEmailDomains = samlEmailDomains;
    }

    /**
     * Get signatureAlgorithm
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * Get sloUrl
     * @return sloUrl
     */
    public String getSloUrl() {
        return sloUrl;
    }

    public void setSloUrl(String sloUrl) {
        this.sloUrl = sloUrl;
    }

    /**
     * Get ssoUrl
     * @return ssoUrl
     */
    public String getSsoUrl() {
        return ssoUrl;
    }

    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl;
    }

    /**
     * Get x509CertBase64
     * @return x509CertBase64
     */
    public String getX509CertBase64() {
        return x509CertBase64;
    }

    public void setX509CertBase64(String x509CertBase64) {
        this.x509CertBase64 = x509CertBase64;
    }

}

