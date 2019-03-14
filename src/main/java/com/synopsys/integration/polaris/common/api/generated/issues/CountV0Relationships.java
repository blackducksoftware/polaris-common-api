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
import com.synopsys.integration.polaris.common.api.generated.issues.IssueTypeResourceId;
import com.synopsys.integration.polaris.common.api.generated.issues.PathV0;
import com.synopsys.integration.polaris.common.api.generated.issues.TaxonV0;
import com.synopsys.integration.polaris.common.api.generated.issues.ToolDomainServiceV0;
import com.synopsys.integration.polaris.common.api.generated.issues.ToolV0;
import com.synopsys.integration.polaris.common.api.generated.issues.TriageOwnerV0;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class CountV0Relationships extends PolarisComponent {
    @SerializedName("path")
    private PathV0 path = null;

    @SerializedName("parent")
    private PathV0 parent = null;

    @SerializedName("taxon")
    private TaxonV0 taxon = null;

    @SerializedName("issue-type")
    private IssueTypeResourceId issueType = null;

    @SerializedName("tool-domain-service")
    private ToolDomainServiceV0 toolDomainService = null;

    @SerializedName("tool")
    private ToolV0 tool = null;

    @SerializedName("triage-owner")
    private TriageOwnerV0 triageOwner = null;

    /**
     * Get path
     * @return path
     */
    public PathV0 getPath() {
        return path;
    }

    public void setPath(PathV0 path) {
        this.path = path;
    }

    /**
     * Get parent
     * @return parent
     */
    public PathV0 getParent() {
        return parent;
    }

    public void setParent(PathV0 parent) {
        this.parent = parent;
    }

    /**
     * Get taxon
     * @return taxon
     */
    public TaxonV0 getTaxon() {
        return taxon;
    }

    public void setTaxon(TaxonV0 taxon) {
        this.taxon = taxon;
    }

    /**
     * Get issueType
     * @return issueType
     */
    public IssueTypeResourceId getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueTypeResourceId issueType) {
        this.issueType = issueType;
    }

    /**
     * Get toolDomainService
     * @return toolDomainService
     */
    public ToolDomainServiceV0 getToolDomainService() {
        return toolDomainService;
    }

    public void setToolDomainService(ToolDomainServiceV0 toolDomainService) {
        this.toolDomainService = toolDomainService;
    }

    /**
     * Get tool
     * @return tool
     */
    public ToolV0 getTool() {
        return tool;
    }

    public void setTool(ToolV0 tool) {
        this.tool = tool;
    }

    /**
     * Get triageOwner
     * @return triageOwner
     */
    public TriageOwnerV0 getTriageOwner() {
        return triageOwner;
    }

    public void setTriageOwner(TriageOwnerV0 triageOwner) {
        this.triageOwner = triageOwner;
    }

}

