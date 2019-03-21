package com.synopsys.integration.polaris.common.api;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PolarisResources<T extends PolarisResource> extends PolarisComponent {
    @SerializedName("data")
    private List<T> data = null;
    @SerializedName("included")
    private List<PolarisResource> included = null;
    @SerializedName("meta")
    private PolarisResourcesPagination meta = null;

    /**
     * Get data
     * @return data
     */
    public List<T> getData() {
        return data;
    }

    public void setData(final List<T> data) {
        this.data = data;
    }

    public List<PolarisResource> getIncluded() {
        return included;
    }

    public void setIncluded(final List<PolarisResource> included) {
        this.included = included;
    }

    public PolarisResourcesPagination getMeta() {
        return meta;
    }

    public void setMeta(final PolarisResourcesPagination meta) {
        this.meta = meta;
    }

}
