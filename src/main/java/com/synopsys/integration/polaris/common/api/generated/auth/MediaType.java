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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class MediaType extends PolarisComponent {
    @SerializedName("type")
    private String type;

    @SerializedName("subtype")
    private String subtype;

    @SerializedName("parameters")
     private Map<String, String> parameters = null;

    @SerializedName("wildcardType")
    private Boolean wildcardType;

    @SerializedName("wildcardSubtype")
    private Boolean wildcardSubtype;

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get subtype
     * @return subtype
     */
    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public MediaType putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Get wildcardType
     * @return wildcardType
     */
    public Boolean getWildcardType() {
        return wildcardType;
    }

    public void setWildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
    }

    /**
     * Get wildcardSubtype
     * @return wildcardSubtype
     */
    public Boolean getWildcardSubtype() {
        return wildcardSubtype;
    }

    public void setWildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
    }

}

