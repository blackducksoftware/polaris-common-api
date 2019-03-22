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
package com.synopsys.integration.polaris.common.api.auth.model;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import com.google.gson.annotations.SerializedName;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class GroupRelationships extends PolarisComponent {
    @SerializedName("ancestors")
    private ToManyRelationship ancestors = null;

    @SerializedName("children")
    private ToManyRelationship children = null;

    @SerializedName("organization")
    private ToOneRelationship organization = null;

    @SerializedName("parent")
    private ToOneRelationship parent = null;

    /**
     * Get ancestors
     * @return ancestors
     */
    public ToManyRelationship getAncestors() {
        return ancestors;
    }

    public void setAncestors(final ToManyRelationship ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * Get children
     * @return children
     */
    public ToManyRelationship getChildren() {
        return children;
    }

    public void setChildren(final ToManyRelationship children) {
        this.children = children;
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

    /**
     * Get parent
     * @return parent
     */
    public ToOneRelationship getParent() {
        return parent;
    }

    public void setParent(final ToOneRelationship parent) {
        this.parent = parent;
    }

}
