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
import com.synopsys.integration.polaris.common.api.generated.auth.JsonPath;
import com.synopsys.integration.polaris.common.api.generated.auth.PathIds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class JsonPath extends PolarisComponent {
    @SerializedName("elementName")
    private String elementName;

    @SerializedName("ids")
    private PathIds ids = null;

    @SerializedName("parentResource")
    private JsonPath parentResource = null;

    @SerializedName("childResource")
    private JsonPath childResource = null;

    @SerializedName("collection")
    private Boolean collection;

    @SerializedName("resourceName")
    private String resourceName;

    /**
     * Get elementName
     * @return elementName
     */
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    /**
     * Get ids
     * @return ids
     */
    public PathIds getIds() {
        return ids;
    }

    public void setIds(PathIds ids) {
        this.ids = ids;
    }

    /**
     * Get parentResource
     * @return parentResource
     */
    public JsonPath getParentResource() {
        return parentResource;
    }

    public void setParentResource(JsonPath parentResource) {
        this.parentResource = parentResource;
    }

    /**
     * Get childResource
     * @return childResource
     */
    public JsonPath getChildResource() {
        return childResource;
    }

    public void setChildResource(JsonPath childResource) {
        this.childResource = childResource;
    }

    /**
     * Get collection
     * @return collection
     */
    public Boolean getCollection() {
        return collection;
    }

    public void setCollection(Boolean collection) {
        this.collection = collection;
    }

    /**
     * Get resourceName
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

}

