package com.synopsys.integration.polaris.common.api.auth;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisComponent;

public class PolarisResourceLink extends PolarisComponent {
    @SerializedName("href")
    private String href;
    @SerializedName("meta")
    private PolarisResourceLinkMeta meta;

    public String getHref() {
        return href;
    }

    public void setHref(final String href) {
        this.href = href;
    }

    public PolarisResourceLinkMeta getMeta() {
        return meta;
    }

    public void setMeta(final PolarisResourceLinkMeta meta) {
        this.meta = meta;
    }

}
