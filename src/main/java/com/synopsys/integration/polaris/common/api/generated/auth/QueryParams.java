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
import com.synopsys.integration.polaris.common.api.generated.auth.TypedParamsFilterParams;
import com.synopsys.integration.polaris.common.api.generated.auth.TypedParamsGroupingParams;
import com.synopsys.integration.polaris.common.api.generated.auth.TypedParamsIncludedFieldsParams;
import com.synopsys.integration.polaris.common.api.generated.auth.TypedParamsIncludedRelationsParams;
import com.synopsys.integration.polaris.common.api.generated.auth.TypedParamsSortingParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class QueryParams extends PolarisComponent {
    @SerializedName("filters")
    private TypedParamsFilterParams filters = null;

    @SerializedName("sorting")
    private TypedParamsSortingParams sorting = null;

    @SerializedName("grouping")
    private TypedParamsGroupingParams grouping = null;

    @SerializedName("includedFields")
    private TypedParamsIncludedFieldsParams includedFields = null;

    @SerializedName("includedRelations")
    private TypedParamsIncludedRelationsParams includedRelations = null;

    @SerializedName("pagination")
     private Map<String, Integer> pagination = null;

    /**
     * Get filters
     * @return filters
     */
    public TypedParamsFilterParams getFilters() {
        return filters;
    }

    public void setFilters(TypedParamsFilterParams filters) {
        this.filters = filters;
    }

    /**
     * Get sorting
     * @return sorting
     */
    public TypedParamsSortingParams getSorting() {
        return sorting;
    }

    public void setSorting(TypedParamsSortingParams sorting) {
        this.sorting = sorting;
    }

    /**
     * Get grouping
     * @return grouping
     */
    public TypedParamsGroupingParams getGrouping() {
        return grouping;
    }

    public void setGrouping(TypedParamsGroupingParams grouping) {
        this.grouping = grouping;
    }

    /**
     * Get includedFields
     * @return includedFields
     */
    public TypedParamsIncludedFieldsParams getIncludedFields() {
        return includedFields;
    }

    public void setIncludedFields(TypedParamsIncludedFieldsParams includedFields) {
        this.includedFields = includedFields;
    }

    /**
     * Get includedRelations
     * @return includedRelations
     */
    public TypedParamsIncludedRelationsParams getIncludedRelations() {
        return includedRelations;
    }

    public void setIncludedRelations(TypedParamsIncludedRelationsParams includedRelations) {
        this.includedRelations = includedRelations;
    }

    public QueryParams putPaginationItem(String key, Integer paginationItem) {
        if (this.pagination == null) {
            this.pagination = new HashMap<>();
        }
        this.pagination.put(key, paginationItem);
        return this;
    }

    /**
     * Get pagination
     * @return pagination
     */
    public Map<String, Integer> getPagination() {
        return pagination;
    }

    public void setPagination(Map<String, Integer> pagination) {
        this.pagination = pagination;
    }

}

