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
import com.synopsys.integration.polaris.common.api.generated.auth.ToOneRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class RoleAssignmentRelationships extends PolarisComponent {
    @SerializedName("group")
    private ToOneRelationship group = null;

    @SerializedName("organization")
    private ToOneRelationship organization = null;

    @SerializedName("role")
    private ToOneRelationship role = null;

    @SerializedName("user")
    private ToOneRelationship user = null;

    /**
     * Get group
     * @return group
     */
    public ToOneRelationship getGroup() {
        return group;
    }

    public void setGroup(ToOneRelationship group) {
        this.group = group;
    }

    /**
     * Get organization
     * @return organization
     */
    public ToOneRelationship getOrganization() {
        return organization;
    }

    public void setOrganization(ToOneRelationship organization) {
        this.organization = organization;
    }

    /**
     * Get role
     * @return role
     */
    public ToOneRelationship getRole() {
        return role;
    }

    public void setRole(ToOneRelationship role) {
        this.role = role;
    }

    /**
     * Get user
     * @return user
     */
    public ToOneRelationship getUser() {
        return user;
    }

    public void setUser(ToOneRelationship user) {
        this.user = user;
    }

}

