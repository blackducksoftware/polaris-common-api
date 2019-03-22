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
package com.synopsys.integration.polaris.common.api.issues;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import com.google.gson.annotations.SerializedName;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class CountV0 extends PolarisComponent {
    @SerializedName("type")
    private String type = "count";

    @SerializedName("id")
    private String id;

    @SerializedName("attributes")
    private CountV0Attributes attributes = null;

    @SerializedName("relationships")
    private CountV0Relationships relationships = null;

    /**
     * &#x60;Automatic&#x60;, &#x60;Non-null&#x60;. The literal-string &#x60;count&#x60;.
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    /**
     * &#x60;Automatic&#x60;, &#x60;Non-null&#x60;. Transient, non-durable id.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public CountV0Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(final CountV0Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Get relationships
     * @return relationships
     */
    public CountV0Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(final CountV0Relationships relationships) {
        this.relationships = relationships;
    }

}

