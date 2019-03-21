package com.synopsys.integration.polaris.common.api;

import com.google.gson.annotations.SerializedName;

public abstract class PolarisResourceLinks extends PolarisComponent {
    @SerializedName("self")
    private PolarisResourceLink self;

    public PolarisResourceLink getSelf() {
        return self;
    }

    public void setSelf(final PolarisResourceLink self) {
        this.self = self;
    }

}
