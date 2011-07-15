/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.mlbdash.shared.gdx.inning;

import java.io.Serializable;
import java.util.Date;

import name.pehl.piriti.commons.client.Format;
import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Pitch implements Serializable {

    @Path("@des") String description;
    @Path("@id") int id;
    @Path("@type") char type;
    @Path("@x") float x;
    @Path("@y") float y;
    @Path("@sv_id") @Format("@yyMMdd_hhmmss") Date time;
    @Path("@start_speed") float startSpeed;
    @Path("@end_speed") float endSpeed;
    @Path("@sz_top") float batterZoneTop;
    @Path("@sz_bot") float batterZoneBottom;
    @Path("@pfx_x") float movementX;
    @Path("@pfx_z") float movementZ;
    @Path("@px") float distanceCrossedPlateX;
    @Path("@pz") float distanceCrossedPlateZ;
    @Path("@x0") float distanceInitialX;
    @Path("@y0") float distanceInitialY;
    @Path("@z0") float distanceInitialZ;
    @Path("@vx0") float velocityX;
    @Path("@vy0") float velocityY;
    @Path("@vz0") float velocityZ;
    @Path("@ax") float accelerationX;
    @Path("@ay") float accelerationY;
    @Path("@az") float accelerationZ;
    @Path("@break_y") float breakY;
    @Path("@break_angle") float breakAngle;
    @Path("@break_length") float breakLength;
    @Path("@pitch_type") PitchType pitchType;
    @Path("@type_confidence") float typeConfidence;
    @Path("@zone") short zone;
    @Path("@nasty") short nasty;
    @Path("@spin_dir") float spinDirection;
    @Path("@spin_rate") float spinRate;
    @Path("@cc") String comment;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getStartSpeed() {
        return startSpeed;
    }

    public void setStartSpeed(float startSpeed) {
        this.startSpeed = startSpeed;
    }

    public float getEndSpeed() {
        return endSpeed;
    }

    public void setEndSpeed(float endSpeed) {
        this.endSpeed = endSpeed;
    }

    public float getBatterZoneTop() {
        return batterZoneTop;
    }

    public void setBatterZoneTop(float batterZoneTop) {
        this.batterZoneTop = batterZoneTop;
    }

    public float getBatterZoneBottom() {
        return batterZoneBottom;
    }

    public void setBatterZoneBottom(float batterZoneBottom) {
        this.batterZoneBottom = batterZoneBottom;
    }

    public float getMovementX() {
        return movementX;
    }

    public void setMovementX(float movementX) {
        this.movementX = movementX;
    }

    public float getMovementZ() {
        return movementZ;
    }

    public void setMovementZ(float movementZ) {
        this.movementZ = movementZ;
    }

    public float getDistanceCrossedPlateX() {
        return distanceCrossedPlateX;
    }

    public void setDistanceCrossedPlateX(float distanceCrossedPlateX) {
        this.distanceCrossedPlateX = distanceCrossedPlateX;
    }

    public float getDistanceCrossedPlateZ() {
        return distanceCrossedPlateZ;
    }

    public void setDistanceCrossedPlateZ(float distanceCrossedPlateZ) {
        this.distanceCrossedPlateZ = distanceCrossedPlateZ;
    }

    public float getDistanceInitialX() {
        return distanceInitialX;
    }

    public void setDistanceInitialX(float distanceInitialX) {
        this.distanceInitialX = distanceInitialX;
    }

    public float getDistanceInitialY() {
        return distanceInitialY;
    }

    public void setDistanceInitialY(float distanceInitialY) {
        this.distanceInitialY = distanceInitialY;
    }

    public float getDistanceInitialZ() {
        return distanceInitialZ;
    }

    public void setDistanceInitialZ(float distanceInitialZ) {
        this.distanceInitialZ = distanceInitialZ;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public float getVelocityZ() {
        return velocityZ;
    }

    public void setVelocityZ(float velocityZ) {
        this.velocityZ = velocityZ;
    }

    public float getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(float accelerationX) {
        this.accelerationX = accelerationX;
    }

    public float getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(float accelerationY) {
        this.accelerationY = accelerationY;
    }

    public float getAccelerationZ() {
        return accelerationZ;
    }

    public void setAccelerationZ(float accelerationZ) {
        this.accelerationZ = accelerationZ;
    }

    public float getBreakY() {
        return breakY;
    }

    public void setBreakY(float breakY) {
        this.breakY = breakY;
    }

    public float getBreakAngle() {
        return breakAngle;
    }

    public void setBreakAngle(float breakAngle) {
        this.breakAngle = breakAngle;
    }

    public float getBreakLength() {
        return breakLength;
    }

    public void setBreakLength(float breakLength) {
        this.breakLength = breakLength;
    }

    public PitchType getPitchType() {
        return pitchType;
    }

    public void setPitchType(PitchType pitchType) {
        this.pitchType = pitchType;
    }

    public float getTypeConfidence() {
        return typeConfidence;
    }

    public void setTypeConfidence(float typeConfidence) {
        this.typeConfidence = typeConfidence;
    }

    public short getZone() {
        return zone;
    }

    public void setZone(short zone) {
        this.zone = zone;
    }

    public short getNasty() {
        return nasty;
    }

    public void setNasty(short nasty) {
        this.nasty = nasty;
    }

    public float getSpinDirection() {
        return spinDirection;
    }

    public void setSpinDirection(float spinDirection) {
        this.spinDirection = spinDirection;
    }

    public float getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(float spinRate) {
        this.spinRate = spinRate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
