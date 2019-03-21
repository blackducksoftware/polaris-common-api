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
