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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created

public class EntitlementAttributes extends PolarisComponent {
/**
* Gets or Sets allowed
*/
    @JsonAdapter(AllowedEnum.Adapter.class)
public enum AllowedEnum {
        ADMINISTER("ADMINISTER"),
        
        USERS_READ("USERS_READ"),
        
        USERS_READ_PRIVATE("USERS_READ_PRIVATE"),
        
        USERS_WRITE("USERS_WRITE"),
        
        GROUPS_READ("GROUPS_READ"),
        
        GROUPS_WRITE("GROUPS_WRITE"),
        
        PROJECTS_CREATE("PROJECTS_CREATE"),
        
        PROJECTS_READ("PROJECTS_READ"),
        
        PROJECTS_WRITE("PROJECTS_WRITE");

private String value;

AllowedEnum(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return String.valueOf(value);
}

public static AllowedEnum fromValue(String text) {
for (AllowedEnum b : AllowedEnum.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}

    public static class Adapter extends TypeAdapter<AllowedEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AllowedEnum enumeration) throws IOException {
    jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AllowedEnum read(final JsonReader jsonReader) throws IOException {
    String value = jsonReader.nextString();
    return AllowedEnum.fromValue(String.valueOf(value));
    }
    }
}
    @SerializedName("allowed")
     private List<AllowedEnum> allowed = new ArrayList<>();

    public EntitlementAttributes addAllowedItem(AllowedEnum allowedItem) {
        this.allowed.add(allowedItem);
        return this;
    }

    /**
     * Get allowed
     * @return allowed
     */
    public List<AllowedEnum> getAllowed() {
        return allowed;
    }

    public void setAllowed(List<AllowedEnum> allowed) {
        this.allowed = allowed;
    }

}

