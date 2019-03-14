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
import com.synopsys.integration.polaris.common.api.generated.auth.IterableErrorData;
import com.synopsys.integration.polaris.common.api.generated.auth.JsonPath;
import com.synopsys.integration.polaris.common.api.generated.auth.LinksInformation;
import com.synopsys.integration.polaris.common.api.generated.auth.MetaInformation;
import com.synopsys.integration.polaris.common.api.generated.auth.QueryParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class ErrorResponse extends PolarisComponent {
    @SerializedName("jsonPath")
    private JsonPath jsonPath = null;

    @SerializedName("linksInformation")
    private LinksInformation linksInformation = null;

    @SerializedName("metaInformation")
    private MetaInformation metaInformation = null;

    @SerializedName("queryParams")
    private QueryParams queryParams = null;

    @SerializedName("errors")
    private IterableErrorData errors = null;

    /**
     * Get jsonPath
     * @return jsonPath
     */
    public JsonPath getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(JsonPath jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * Get linksInformation
     * @return linksInformation
     */
    public LinksInformation getLinksInformation() {
        return linksInformation;
    }

    public void setLinksInformation(LinksInformation linksInformation) {
        this.linksInformation = linksInformation;
    }

    /**
     * Get metaInformation
     * @return metaInformation
     */
    public MetaInformation getMetaInformation() {
        return metaInformation;
    }

    public void setMetaInformation(MetaInformation metaInformation) {
        this.metaInformation = metaInformation;
    }

    /**
     * Get queryParams
     * @return queryParams
     */
    public QueryParams getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(QueryParams queryParams) {
        this.queryParams = queryParams;
    }

    /**
     * Get errors
     * @return errors
     */
    public IterableErrorData getErrors() {
        return errors;
    }

    public void setErrors(IterableErrorData errors) {
        this.errors = errors;
    }

}

