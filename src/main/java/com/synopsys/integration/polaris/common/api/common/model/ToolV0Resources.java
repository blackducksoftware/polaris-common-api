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
package com.synopsys.integration.polaris.common.api.common.model;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisResourcesPagination;

import java.util.ArrayList;
import java.util.List;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class ToolV0Resources extends PolarisComponent {
    @SerializedName("data")
    private List<ToolV0> data = new ArrayList<>();

    @SerializedName("links")
    private LinksPagination links = null;

    @SerializedName("meta")
    private PolarisResourcesPagination meta = null;

    public ToolV0Resources addDataItem(final ToolV0 dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     */
    public List<ToolV0> getData() {
        return data;
    }

    public void setData(final List<ToolV0> data) {
        this.data = data;
    }

    /**
     * Get links
     * @return links
     */
    public LinksPagination getLinks() {
        return links;
    }

    public void setLinks(final LinksPagination links) {
        this.links = links;
    }

    /**
     * Get meta
     * @return meta
     */
    public PolarisResourcesPagination getMeta() {
        return meta;
    }

    public void setMeta(final PolarisResourcesPagination meta) {
        this.meta = meta;
    }

}

