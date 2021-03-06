/*
 * Copyright 2017-2019 EPAM Systems, Inc. (https://www.epam.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.pipeline.entity.firecloud;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A plain object representing a response result of Firecloud.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirecloudMethodConfiguration {
    private String namespace;
    private String name;
    private String snapshotId;
    private String entityType;
    private MethodConfigurationObject payloadObject;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MethodConfigurationObject {
        private String name;
        private MethodRepositoryMethod methodRepoMethod;
        private Long methodConfigVersion;
        private Boolean deleted;
        private String namespace;
        private Map<String, String> outputs;
        private Map<String, String> inputs;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MethodRepositoryMethod {
        private String methodNamespace;
        private String methodName;
        private Long methodVersion;
    }
}
