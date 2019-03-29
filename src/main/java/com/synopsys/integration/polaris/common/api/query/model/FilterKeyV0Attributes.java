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
package com.synopsys.integration.polaris.common.api.query.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class FilterKeyV0Attributes extends PolarisComponent {
    @SerializedName("name")
    private String name;

    @SerializedName("key")
    private String key;

    @SerializedName("value-type")
    private String valueType;

    @SerializedName("apis")
    private List<String> apis = null;

    /**
     * The localized name of this filter key
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * The text key to use in query parameters
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Describes the type of filter key values, and how to obtain them. The types List &amp; Dynamic indicate that these values can be fetched using &#39;/&lt;keyid&gt;/values&#39; endpoint while the types String, Date, DateTime, and Number indicate that the filter value takes a free-form text input of that type.
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(final String valueType) {
        this.valueType = valueType;
    }

    public FilterKeyV0Attributes addApisItem(final String apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    /**
     * Get apis
     * @return apis
     */
    public List<String> getApis() {
        return apis;
    }

    public void setApis(final List<String> apis) {
        this.apis = apis;
    }

}

