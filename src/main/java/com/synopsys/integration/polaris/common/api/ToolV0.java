/*
 * Common Object Service - Navigation
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
import com.synopsys.integration.polaris.common.api.JsonApiSelfLinks;
import com.synopsys.integration.polaris.common.api.MetaWithOrganizationTrash;
import com.synopsys.integration.polaris.common.api.ObjectContainer;
import com.synopsys.integration.polaris.common.api.ToolV0Attributes;
import com.synopsys.integration.polaris.common.api.ToolV0Relationships;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class ToolV0 extends ObjectContainer {
    @SerializedName("attributes")
    private ToolV0Attributes attributes = null;

    @SerializedName("relationships")
    private ToolV0Relationships relationships = null;

    @SerializedName("links")
    private JsonApiSelfLinks links = null;

    @SerializedName("meta")
    private MetaWithOrganizationTrash meta = null;

    /**
     * Get attributes
     * @return attributes
     */
    public ToolV0Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ToolV0Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Get relationships
     * @return relationships
     */
    public ToolV0Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(ToolV0Relationships relationships) {
        this.relationships = relationships;
    }

    /**
     * Get links
     * @return links
     */
    public JsonApiSelfLinks getLinks() {
        return links;
    }

    public void setLinks(JsonApiSelfLinks links) {
        this.links = links;
    }

    /**
     * Get meta
     * @return meta
     */
    public MetaWithOrganizationTrash getMeta() {
        return meta;
    }

    public void setMeta(MetaWithOrganizationTrash meta) {
        this.meta = meta;
    }

}
