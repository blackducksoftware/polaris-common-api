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
package com.synopsys.integration.polaris.common.api.auth.model.role.assignments;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisRelationships;

public class RoleAssignmentRelationships extends PolarisRelationships {
    @SerializedName("group")
    private RoleAssignmentRelationship group = null;

    @SerializedName("organization")
    private RoleAssignmentRelationship organization = null;

    @SerializedName("role")
    private RoleAssignmentRelationship role = null;

    @SerializedName("user")
    private RoleAssignmentRelationship user = null;

    /**
     * Get group
     * @return group
     */
    public RoleAssignmentRelationship getGroup() {
        return group;
    }

    public void setGroup(final RoleAssignmentRelationship group) {
        this.group = group;
    }

    /**
     * Get organization
     * @return organization
     */
    public RoleAssignmentRelationship getOrganization() {
        return organization;
    }

    public void setOrganization(final RoleAssignmentRelationship organization) {
        this.organization = organization;
    }

    /**
     * Get role
     * @return role
     */
    public RoleAssignmentRelationship getRole() {
        return role;
    }

    public void setRole(final RoleAssignmentRelationship role) {
        this.role = role;
    }

    /**
     * Get user
     * @return user
     */
    public RoleAssignmentRelationship getUser() {
        return user;
    }

    public void setUser(final RoleAssignmentRelationship user) {
        this.user = user;
    }

}

