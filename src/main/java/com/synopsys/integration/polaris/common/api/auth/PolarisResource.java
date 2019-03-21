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

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

public class PolarisResource extends PolarisComponent {
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;
    @SerializedName("attributes")
    private PolarisAttributes attributes = null;
    @SerializedName("relationships")
    private PolarisRelationships relationships = null;
    @SerializedName("links")
    private PolarisResourceLinks links;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public PolarisAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(final PolarisAttributes attributes) {
        this.attributes = attributes;
    }

    public PolarisRelationships getRelationships() {
        return relationships;
    }

    public void setRelationships(final PolarisRelationships relationships) {
        this.relationships = relationships;
    }

    public PolarisResourceLinks getLinks() {
        return links;
    }

    public void setLinks(final PolarisResourceLinks links) {
        this.links = links;
    }

}
