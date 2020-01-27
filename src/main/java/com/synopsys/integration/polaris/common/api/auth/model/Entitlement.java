/**
 * polaris-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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

public class Entitlement extends PolarisComponent {
    @SerializedName("attributes")
    private EntitlementAttributes attributes = null;

    @SerializedName("id")
    private String id;

    @SerializedName("relationships")
    private EntitlementRelationships relationships = null;

    @SerializedName("type")
    private String type;

    /**
     * Get attributes
     * @return attributes
     */
    public EntitlementAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(final EntitlementAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Get relationships
     * @return relationships
     */
    public EntitlementRelationships getRelationships() {
        return relationships;
    }

    public void setRelationships(final EntitlementRelationships relationships) {
        this.relationships = relationships;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

}

