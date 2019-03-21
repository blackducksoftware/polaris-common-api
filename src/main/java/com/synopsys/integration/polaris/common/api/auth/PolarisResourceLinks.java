package com.synopsys.integration.polaris.common.api.auth;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

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
