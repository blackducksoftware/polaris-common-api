/**
 * polaris-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
package com.synopsys.integration.polaris.common.api.query.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class PathIncludedV0Attributes extends PolarisComponent {
    @SerializedName("path")
    private List<String> path = null;

    @SerializedName("path-type")
    private String pathType;

    @SerializedName("is-leaf")
    private Boolean isLeaf;

    public PathIncludedV0Attributes addPathItem(final String pathItem) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.add(pathItem);
        return this;
    }

    /**
     * The path as an array of string path elements.
     * @return path
     */
    public List<String> getPath() {
        return path;
    }

    public void setPath(final List<String> path) {
        this.path = path;
    }

    /**
     * The path type (ex. directory, packaged, etc...)
     * @return pathType
     */
    public String getPathType() {
        return pathType;
    }

    public void setPathType(final String pathType) {
        this.pathType = pathType;
    }

    /**
     * Will be set to true if this path is a leaf
     * @return isLeaf
     */
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(final Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

}

