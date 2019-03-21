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
package com.synopsys.integration.polaris.common.api.auth;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import com.google.gson.annotations.SerializedName;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class UserRelationships extends PolarisComponent {
    @SerializedName("email-details")
    private ToOneRelationship emailDetails = null;

    @SerializedName("entitlements")
    private ToOneRelationship entitlements = null;

    @SerializedName("githublogins")
    private ToManyRelationship githublogins = null;

    @SerializedName("groups")
    private ToManyRelationship groups = null;

    @SerializedName("microsoftlogins")
    private ToManyRelationship microsoftlogins = null;

    @SerializedName("organization")
    private ToOneRelationship organization = null;

    /**
     * Get emailDetails
     * @return emailDetails
     */
    public ToOneRelationship getEmailDetails() {
        return emailDetails;
    }

    public void setEmailDetails(final ToOneRelationship emailDetails) {
        this.emailDetails = emailDetails;
    }

    /**
     * Get entitlements
     * @return entitlements
     */
    public ToOneRelationship getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(final ToOneRelationship entitlements) {
        this.entitlements = entitlements;
    }

    /**
     * Get githublogins
     * @return githublogins
     */
    public ToManyRelationship getGithublogins() {
        return githublogins;
    }

    public void setGithublogins(final ToManyRelationship githublogins) {
        this.githublogins = githublogins;
    }

    /**
     * Get groups
     * @return groups
     */
    public ToManyRelationship getGroups() {
        return groups;
    }

    public void setGroups(final ToManyRelationship groups) {
        this.groups = groups;
    }

    /**
     * Get microsoftlogins
     * @return microsoftlogins
     */
    public ToManyRelationship getMicrosoftlogins() {
        return microsoftlogins;
    }

    public void setMicrosoftlogins(final ToManyRelationship microsoftlogins) {
        this.microsoftlogins = microsoftlogins;
    }

    /**
     * Get organization
     * @return organization
     */
    public ToOneRelationship getOrganization() {
        return organization;
    }

    public void setOrganization(final ToOneRelationship organization) {
        this.organization = organization;
    }

}

