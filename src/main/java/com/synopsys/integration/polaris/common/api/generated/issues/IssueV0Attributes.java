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
package com.synopsys.integration.polaris.common.api.generated.issues;

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

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class IssueV0Attributes extends PolarisComponent {
    @SerializedName("issue-key")
    private String issueKey;

    @SerializedName("finding-key")
    private String findingKey;

    @SerializedName("sub-tool")
    private String subTool;

    /**
     * &#x60;Automatic&#x60;.  The issue key assigned by the IM for this issue.  Uniquely identifies the issue.
     * @return issueKey
     */
    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    /**
     * &#x60;Automatic&#x60;.  The finding key assigned by the TDS for this issue.  Redeemable from this issue&#39;s TDS.
     * @return findingKey
     */
    public String getFindingKey() {
        return findingKey;
    }

    public void setFindingKey(String findingKey) {
        this.findingKey = findingKey;
    }

    /**
     * Specifies the sub tool used to find the issue
     * @return subTool
     */
    public String getSubTool() {
        return subTool;
    }

    public void setSubTool(String subTool) {
        this.subTool = subTool;
    }

}

