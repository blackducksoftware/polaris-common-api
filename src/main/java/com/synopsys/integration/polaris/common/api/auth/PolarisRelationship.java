package com.synopsys.integration.polaris.common.api.auth;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

public abstract class PolarisRelationship extends PolarisComponent {
    @SerializedName("links")
    private PolarisRelationshipLink links;

    public PolarisRelationshipLink getLinks() {
        return links;
    }

    public void setLinks(final PolarisRelationshipLink links) {
        this.links = links;
    }

}
