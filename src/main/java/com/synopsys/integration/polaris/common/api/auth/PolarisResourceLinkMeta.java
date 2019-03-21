package com.synopsys.integration.polaris.common.api.auth;

import com.synopsys.integration.polaris.common.api.PolarisComponent;

public class PolarisResourceLinkMeta extends PolarisComponent {
    private String durable;

    public String getDurable() {
        return durable;
    }

    public void setDurable(final String durable) {
        this.durable = durable;
    }

}
