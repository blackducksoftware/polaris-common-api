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
import com.synopsys.integration.polaris.common.api.generated.auth.GitHubAuthentication;
import com.synopsys.integration.polaris.common.api.generated.auth.MicrosoftAuthentication;
import com.synopsys.integration.polaris.common.api.generated.auth.PasswordAuthentication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class OrganizationAttributes extends PolarisComponent {
    @SerializedName("date-created")
    private OffsetDateTime dateCreated;

    @SerializedName("description")
    private String description;

    @SerializedName("github-authentication")
    private GitHubAuthentication githubAuthentication = null;

    @SerializedName("microsoft-authentication")
    private MicrosoftAuthentication microsoftAuthentication = null;

    @SerializedName("organizationname")
    private String organizationname;

    @SerializedName("password-authentication")
    private PasswordAuthentication passwordAuthentication = null;

    /**
     * Get dateCreated
     * @return dateCreated
     */
    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get githubAuthentication
     * @return githubAuthentication
     */
    public GitHubAuthentication getGithubAuthentication() {
        return githubAuthentication;
    }

    public void setGithubAuthentication(GitHubAuthentication githubAuthentication) {
        this.githubAuthentication = githubAuthentication;
    }

    /**
     * Get microsoftAuthentication
     * @return microsoftAuthentication
     */
    public MicrosoftAuthentication getMicrosoftAuthentication() {
        return microsoftAuthentication;
    }

    public void setMicrosoftAuthentication(MicrosoftAuthentication microsoftAuthentication) {
        this.microsoftAuthentication = microsoftAuthentication;
    }

    /**
     * Get organizationname
     * @return organizationname
     */
    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }

    /**
     * Get passwordAuthentication
     * @return passwordAuthentication
     */
    public PasswordAuthentication getPasswordAuthentication() {
        return passwordAuthentication;
    }

    public void setPasswordAuthentication(PasswordAuthentication passwordAuthentication) {
        this.passwordAuthentication = passwordAuthentication;
    }

}

