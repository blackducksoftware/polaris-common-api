/*
 * Issue Query
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

package com.synopsys.integration.polaris.common.api.generated.issues;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.synopsys.integration.polaris.common.api.generated.issues.IssueV0;
import com.synopsys.integration.polaris.common.api.generated.issues.JsonApiIncludedResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class IssueV0Resource extends PolarisComponent {
    @SerializedName("data")
    private IssueV0 data = null;

    @SerializedName("included")
     private List<JsonApiIncludedResource> included = null;

    /**
     * Get data
     * @return data
     */
    public IssueV0 getData() {
        return data;
    }

    public void setData(IssueV0 data) {
        this.data = data;
    }

    public IssueV0Resource addIncludedItem(JsonApiIncludedResource includedItem) {
        if (this.included == null) {
            this.included = new ArrayList<>();
        }
        this.included.add(includedItem);
        return this;
    }

    /**
     * Get included
     * @return included
     */
    public List<JsonApiIncludedResource> getIncluded() {
        return included;
    }

    public void setIncluded(List<JsonApiIncludedResource> included) {
        this.included = included;
    }

}

