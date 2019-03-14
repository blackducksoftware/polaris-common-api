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
import com.synopsys.integration.polaris.common.api.generated.auth.EntityTag;
import com.synopsys.integration.polaris.common.api.generated.auth.Link;
import com.synopsys.integration.polaris.common.api.generated.auth.Locale;
import com.synopsys.integration.polaris.common.api.generated.auth.MediaType;
import com.synopsys.integration.polaris.common.api.generated.auth.NewCookie;
import com.synopsys.integration.polaris.common.api.generated.auth.StatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class Response extends PolarisComponent {
    @SerializedName("mediaType")
    private MediaType mediaType = null;

    @SerializedName("allowedMethods")
     private List<String> allowedMethods = null;

    @SerializedName("entityTag")
    private EntityTag entityTag = null;

    @SerializedName("stringHeaders")
     private Map<String, List<String>> stringHeaders = null;

    @SerializedName("statusInfo")
    private StatusType statusInfo = null;

    @SerializedName("metadata")
     private Map<String, List<Object>> metadata = null;

    @SerializedName("entity")
    private Object entity = null;

    @SerializedName("links")
     private List<Link> links = null;

    @SerializedName("cookies")
     private Map<String, NewCookie> cookies = null;

    @SerializedName("lastModified")
    private OffsetDateTime lastModified;

    @SerializedName("date")
    private OffsetDateTime date;

    @SerializedName("headers")
     private Map<String, List<Object>> headers = null;

    @SerializedName("status")
    private Integer status;

    @SerializedName("length")
    private Integer length;

    @SerializedName("language")
    private Locale language = null;

    @SerializedName("location")
    private String location;

    /**
     * Get mediaType
     * @return mediaType
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Response addAllowedMethodsItem(String allowedMethodsItem) {
        if (this.allowedMethods == null) {
            this.allowedMethods = new ArrayList<>();
        }
        this.allowedMethods.add(allowedMethodsItem);
        return this;
    }

    /**
     * Get allowedMethods
     * @return allowedMethods
     */
    public List<String> getAllowedMethods() {
        return allowedMethods;
    }

    public void setAllowedMethods(List<String> allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    /**
     * Get entityTag
     * @return entityTag
     */
    public EntityTag getEntityTag() {
        return entityTag;
    }

    public void setEntityTag(EntityTag entityTag) {
        this.entityTag = entityTag;
    }

    public Response putStringHeadersItem(String key, List<String> stringHeadersItem) {
        if (this.stringHeaders == null) {
            this.stringHeaders = new HashMap<>();
        }
        this.stringHeaders.put(key, stringHeadersItem);
        return this;
    }

    /**
     * Get stringHeaders
     * @return stringHeaders
     */
    public Map<String, List<String>> getStringHeaders() {
        return stringHeaders;
    }

    public void setStringHeaders(Map<String, List<String>> stringHeaders) {
        this.stringHeaders = stringHeaders;
    }

    /**
     * Get statusInfo
     * @return statusInfo
     */
    public StatusType getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(StatusType statusInfo) {
        this.statusInfo = statusInfo;
    }

    public Response putMetadataItem(String key, List<Object> metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Map<String, List<Object>> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, List<Object>> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get entity
     * @return entity
     */
    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public Response addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Response putCookiesItem(String key, NewCookie cookiesItem) {
        if (this.cookies == null) {
            this.cookies = new HashMap<>();
        }
        this.cookies.put(key, cookiesItem);
        return this;
    }

    /**
     * Get cookies
     * @return cookies
     */
    public Map<String, NewCookie> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, NewCookie> cookies) {
        this.cookies = cookies;
    }

    /**
     * Get lastModified
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Get date
     * @return date
     */
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Response putHeadersItem(String key, List<Object> headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    /**
     * Get headers
     * @return headers
     */
    public Map<String, List<Object>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<Object>> headers) {
        this.headers = headers;
    }

    /**
     * Get status
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Get length
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Get language
     * @return language
     */
    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    /**
     * Get location
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

