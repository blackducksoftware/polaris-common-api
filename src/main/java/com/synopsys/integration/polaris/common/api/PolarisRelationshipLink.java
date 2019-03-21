package com.synopsys.integration.polaris.common.api;

import com.google.gson.annotations.SerializedName;

public class PolarisRelationshipLink extends PolarisComponent {
    @SerializedName("self")
    private String self;
    @SerializedName("related")
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(final String self) {
        this.self = self;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(final String related) {
        this.related = related;
    }

}
