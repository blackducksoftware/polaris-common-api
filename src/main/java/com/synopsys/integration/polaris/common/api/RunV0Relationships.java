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
package com.synopsys.integration.polaris.common.api;

import com.synopsys.integration.util.Stringable;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.synopsys.integration.polaris.common.api.JsonApiLazyRelationship;
import com.synopsys.integration.polaris.common.api.RunV0PreviousRunToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0ProjectToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0RevisionToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0SubmittingOrganizationToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0SubmittingUserToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0ToolDomainServiceToOneRelationship;
import com.synopsys.integration.polaris.common.api.RunV0ToolToOneRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class RunV0Relationships extends Stringable {
    @SerializedName("previous-run")
    private RunV0PreviousRunToOneRelationship previousRun = null;

    @SerializedName("attributes")
    private JsonApiLazyRelationship attributes = null;

    @SerializedName("revision")
    private RunV0RevisionToOneRelationship revision = null;

    @SerializedName("project")
    private RunV0ProjectToOneRelationship project = null;

    @SerializedName("submitting-organization")
    private RunV0SubmittingOrganizationToOneRelationship submittingOrganization = null;

    @SerializedName("submitting-user")
    private RunV0SubmittingUserToOneRelationship submittingUser = null;

    @SerializedName("tool")
    private RunV0ToolToOneRelationship tool = null;

    @SerializedName("tool-domain-service")
    private RunV0ToolDomainServiceToOneRelationship toolDomainService = null;

    /**
     * Get previousRun
     * @return previousRun
     */
    public RunV0PreviousRunToOneRelationship getPreviousRun() {
        return previousRun;
    }

    public void setPreviousRun(RunV0PreviousRunToOneRelationship previousRun) {
        this.previousRun = previousRun;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public JsonApiLazyRelationship getAttributes() {
        return attributes;
    }

    public void setAttributes(JsonApiLazyRelationship attributes) {
        this.attributes = attributes;
    }

    /**
     * Get revision
     * @return revision
     */
    public RunV0RevisionToOneRelationship getRevision() {
        return revision;
    }

    public void setRevision(RunV0RevisionToOneRelationship revision) {
        this.revision = revision;
    }

    /**
     * Get project
     * @return project
     */
    public RunV0ProjectToOneRelationship getProject() {
        return project;
    }

    public void setProject(RunV0ProjectToOneRelationship project) {
        this.project = project;
    }

    /**
     * Get submittingOrganization
     * @return submittingOrganization
     */
    public RunV0SubmittingOrganizationToOneRelationship getSubmittingOrganization() {
        return submittingOrganization;
    }

    public void setSubmittingOrganization(RunV0SubmittingOrganizationToOneRelationship submittingOrganization) {
        this.submittingOrganization = submittingOrganization;
    }

    /**
     * Get submittingUser
     * @return submittingUser
     */
    public RunV0SubmittingUserToOneRelationship getSubmittingUser() {
        return submittingUser;
    }

    public void setSubmittingUser(RunV0SubmittingUserToOneRelationship submittingUser) {
        this.submittingUser = submittingUser;
    }

    /**
     * Get tool
     * @return tool
     */
    public RunV0ToolToOneRelationship getTool() {
        return tool;
    }

    public void setTool(RunV0ToolToOneRelationship tool) {
        this.tool = tool;
    }

    /**
     * Get toolDomainService
     * @return toolDomainService
     */
    public RunV0ToolDomainServiceToOneRelationship getToolDomainService() {
        return toolDomainService;
    }

    public void setToolDomainService(RunV0ToolDomainServiceToOneRelationship toolDomainService) {
        this.toolDomainService = toolDomainService;
    }

}
