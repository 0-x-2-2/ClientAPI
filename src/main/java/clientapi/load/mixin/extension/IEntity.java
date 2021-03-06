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

package clientapi.load.mixin.extension;

import clientapi.util.math.Vec2;
import clientapi.util.math.Vec3;

/**
 * @author Brady
 * @since 2/25/2017
 */
public interface IEntity {

    /**
     * Sets the entity position
     *
     * @param pos New position
     */
    void setPos(Vec3 pos);

    /**
     * Sets the previous entity position
     *
     * @param pos New position
     */
    void setPrevPos(Vec3 pos);

    /**
     * Sets the last tick entity position
     *
     * @param pos New position
     */
    void setLastTickPos(Vec3 pos);

    /**
     * Sets the entity rotations
     *
     * @param rotations New position
     */
    void setRotations(Vec2 rotations);

    /**
     * Sets the previous entity rotations
     *
     * @param rotations New position
     */
    void setPrevRotations(Vec2 rotations);

    /**
     * Sets the entity motion
     *
     * @param motion New motion
     */
    void setMotion(Vec3 motion);

    /**
     * Converts the entity position to a {@link Vec3}
     *
     * @return Position as a {@link Vec3}
     */
    Vec3 getPos();

    /**
     * Converts the previous entity position to a {@link Vec3}
     *
     * @return Previous position as a {@link Vec3}
     */
    Vec3 getPrevPos();

    /**
     * Converts the last tick entity position to a {@link Vec3}
     *
     * @return Last tick position as a {@link Vec3}
     */
    Vec3 getLastTickPos();

    /**
     * Returns a {@link Vec3} with the world position of this entity's head
     *
     * @return This entity's head position
     */
    Vec3 getHeadPos();

    /**
     * Converts the entity rotation angles to a {@link Vec2}
     *
     * @return Rotations as a {@link Vec2}
     */
    Vec2 getRotations();

    /**
     * Converts the previous entity rotation angles to a {@link Vec2}
     *
     * @return Previous rotations as a {@link Vec2}
     */
    Vec2 getPrevRotations();

    /**
     * Converts the entity motion to a {@link Vec3}
     *
     * @return Motion as a {@link Vec3}
     */
    Vec3 getMotion();

    /**
     * Calculates the predicted position that an entity will
     * be in the specified amount of ticks
     *
     * @param ticks Time in ticks predicted
     * @return The predicted position
     */
    Vec3 interpolate(float ticks);

    /**
     * Sets all forms of position and rotation in
     * this entity to the specified position and rotation
     *
     * @param pos The position
     * @param angles The rotation
     */
    default void setAll(Vec3 pos, Vec2 angles) {
        this.setAll(pos, pos, pos, angles, angles);
    }

    /**
     * Sets all forms of position of rotation to
     * their specified vectors
     *
     * @param pos The position
     * @param prev The previous position
     * @param lastTick The last tick position
     * @param angles The angles
     * @param prevAngles The previous angles
     */
    default void setAll(Vec3 pos, Vec3 prev, Vec3 lastTick, Vec2 angles, Vec2 prevAngles) {
        this.setPos(pos);
        this.setPrevPos(prev);
        this.setLastTickPos(lastTick);
        this.setRotations(angles);
        this.setPrevRotations(prevAngles);
    }
}
