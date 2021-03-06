/*
 * Copyright 2018 ImpactDevelopment
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

package clientapi.util.entity;

import net.minecraft.entity.Entity;

import java.util.function.Predicate;

/**
 * Implementation of {@link EntityCheck}.
 *
 * @see EntityCheck
 * @see CheckType
 *
 * @author Brady
 * @since 2/5/2018
 */
public final class EntityCheckFunction implements EntityCheck {

    /**
     * The type of check
     */
    private final CheckType type;

    /**
     * A function that tests the specified entity
     */
    private final Predicate<Entity> isValid;

    public EntityCheckFunction(CheckType type, Predicate<Entity> isValid) {
        this.type = type;
        this.isValid = isValid;
    }

    @Override
    public final boolean isValid(Entity entity) {
        return this.isValid.test(entity);
    }

    @Override
    public final CheckType getType() {
        return this.type;
    }
}
