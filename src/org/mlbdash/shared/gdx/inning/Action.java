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

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Action implements Serializable {

    @Path("@b") short balls;
    @Path("@s") short strikes;
    @Path("@o") short outs;
    @Path("@des") String description;
    @Path("@event") String event;
    @Path("@tfs") int tfs;
    @Path("@player") int player;
    @Path("@pitch") short pitch;

    public short getBalls() {
        return balls;
    }

    public void setBalls(short balls) {
        this.balls = balls;
    }

    public short getStrikes() {
        return strikes;
    }

    public void setStrikes(short strikes) {
        this.strikes = strikes;
    }

    public short getOuts() {
        return outs;
    }

    public void setOuts(short outs) {
        this.outs = outs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getTfs() {
        return tfs;
    }

    public void setTfs(int tfs) {
        this.tfs = tfs;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public short getPitch() {
        return pitch;
    }

    public void setPitch(short pitch) {
        this.pitch = pitch;
    }
    
}
