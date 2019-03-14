/*
 * Issue Query
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

package com.synopsys.integration.polaris.common.api.generated.issues;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.synopsys.integration.polaris.common.api.generated.issues.IssueTypeResourceId;
import com.synopsys.integration.polaris.common.api.generated.issues.PathV0;
import com.synopsys.integration.polaris.common.api.generated.issues.RunV0;
import com.synopsys.integration.polaris.common.api.generated.issues.TaxonV0;
import com.synopsys.integration.polaris.common.api.generated.issues.ToolDomainServiceV0;
import com.synopsys.integration.polaris.common.api.generated.issues.ToolV0;
import com.synopsys.integration.polaris.common.api.generated.issues.TransitionV0;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class IssueV0Relationships extends PolarisComponent {
    @SerializedName("issue-type")
    private IssueTypeResourceId issueType = null;

    @SerializedName("tool-domain-service")
    private ToolDomainServiceV0 toolDomainService = null;

    @SerializedName("tool")
    private ToolV0 tool = null;

    @SerializedName("path")
    private PathV0 path = null;

    @SerializedName("latest-observed-on-run")
    private RunV0 latestObservedOnRun = null;

    @SerializedName("transitions")
     private List<TransitionV0> transitions = null;

    @SerializedName("related-taxa")
     private List<TaxonV0> relatedTaxa = null;

    @SerializedName("related-indicators")
     private List<TaxonV0> relatedIndicators = null;

    /**
     * Get issueType
     * @return issueType
     */
    public IssueTypeResourceId getIssueType() {
        return issueType;
    }

    public void setIssueType(IssueTypeResourceId issueType) {
        this.issueType = issueType;
    }

    /**
     * Get toolDomainService
     * @return toolDomainService
     */
    public ToolDomainServiceV0 getToolDomainService() {
        return toolDomainService;
    }

    public void setToolDomainService(ToolDomainServiceV0 toolDomainService) {
        this.toolDomainService = toolDomainService;
    }

    /**
     * Get tool
     * @return tool
     */
    public ToolV0 getTool() {
        return tool;
    }

    public void setTool(ToolV0 tool) {
        this.tool = tool;
    }

    /**
     * Get path
     * @return path
     */
    public PathV0 getPath() {
        return path;
    }

    public void setPath(PathV0 path) {
        this.path = path;
    }

    /**
     * Get latestObservedOnRun
     * @return latestObservedOnRun
     */
    public RunV0 getLatestObservedOnRun() {
        return latestObservedOnRun;
    }

    public void setLatestObservedOnRun(RunV0 latestObservedOnRun) {
        this.latestObservedOnRun = latestObservedOnRun;
    }

    public IssueV0Relationships addTransitionsItem(TransitionV0 transitionsItem) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.add(transitionsItem);
        return this;
    }

    /**
     * Get transitions
     * @return transitions
     */
    public List<TransitionV0> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<TransitionV0> transitions) {
        this.transitions = transitions;
    }

    public IssueV0Relationships addRelatedTaxaItem(TaxonV0 relatedTaxaItem) {
        if (this.relatedTaxa == null) {
            this.relatedTaxa = new ArrayList<>();
        }
        this.relatedTaxa.add(relatedTaxaItem);
        return this;
    }

    /**
     * Get relatedTaxa
     * @return relatedTaxa
     */
    public List<TaxonV0> getRelatedTaxa() {
        return relatedTaxa;
    }

    public void setRelatedTaxa(List<TaxonV0> relatedTaxa) {
        this.relatedTaxa = relatedTaxa;
    }

    public IssueV0Relationships addRelatedIndicatorsItem(TaxonV0 relatedIndicatorsItem) {
        if (this.relatedIndicators == null) {
            this.relatedIndicators = new ArrayList<>();
        }
        this.relatedIndicators.add(relatedIndicatorsItem);
        return this;
    }

    /**
     * Get relatedIndicators
     * @return relatedIndicators
     */
    public List<TaxonV0> getRelatedIndicators() {
        return relatedIndicators;
    }

    public void setRelatedIndicators(List<TaxonV0> relatedIndicators) {
        this.relatedIndicators = relatedIndicators;
    }

}

