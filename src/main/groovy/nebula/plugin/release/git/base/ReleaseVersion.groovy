/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nebula.plugin.release.git.base

import groovy.transform.Immutable

/**
 * Represents an inferred version and any related metadata to be used after the
 * inference.
 */
@Immutable
class ReleaseVersion implements Serializable {
    /**
     * The version that should be used by the project.
     */
    String version
    /**
     * The latest version, as determined by the strategy's logic.
     */
    String previousVersion
    /**
     * Whether or not to create a tag for the release.
     */
    boolean createTag
}
