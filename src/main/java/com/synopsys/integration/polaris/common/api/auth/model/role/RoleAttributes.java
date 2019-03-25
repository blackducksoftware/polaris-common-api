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
package com.synopsys.integration.polaris.common.api.auth.model.role;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.synopsys.integration.polaris.common.api.PolarisAttributes;

public class RoleAttributes extends PolarisAttributes {
    public static final String ROLE_ADMINISTRATOR = "Administrator";
    public static final String ROLE_CONTRIBUTOR = "Contributor";

    @SerializedName("permissions")
    private Map<String, RolePermissions> permissions = new HashMap<>();

    @SerializedName("rolename")
    private String rolename;

    public RoleAttributes putPermissionsItem(final String key, final RolePermissions permissionsItem) {
        this.permissions.put(key, permissionsItem);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    public Map<String, RolePermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(final Map<String, RolePermissions> permissions) {
        this.permissions = permissions;
    }

    /**
     * Get rolename
     * @return rolename
     */
    public String getRolename() {
        return rolename;
    }

    public void setRolename(final String rolename) {
        this.rolename = rolename;
    }

}

