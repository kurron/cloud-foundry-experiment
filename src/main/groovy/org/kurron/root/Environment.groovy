/*
 * Copyright (c) 2013 Ronald D. Kurr kurr@kurron.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kurron.root

import groovy.transform.TupleConstructor
import org.springframework.hateoas.Identifiable

/**
 * Model of the runtime environment.
 */
@TupleConstructor
class Environment implements Identifiable<Long> {

    /**
     * Still haven't figured out if this is useful or not.s
     */
    Long id

    /**
     * True if we're running inside a Cloud Foundry environment.
     */
    boolean cloudfoundry
}
