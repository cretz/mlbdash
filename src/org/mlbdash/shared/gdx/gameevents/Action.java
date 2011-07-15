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
package org.mlbdash.shared.gdx.gameevents;

import java.io.Serializable;
import java.util.Date;

import name.pehl.piriti.commons.client.Format;
import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Action extends Event implements Serializable {

    @Path("@ttfs")
    int tfs;
    @Path("@ttfs_zulu")
    @Format("yyyy-MM-dd't'hh:mm:ss'Z'")
    Date tfsDate;
    @Path("@batter")
    int player;
    @Path("@pitcher")
    short pitch;

    public int getTfs() {
        return tfs;
    }

    public void setTfs(int tfs) {
        this.tfs = tfs;
    }

    public Date getTfsDate() {
        return tfsDate;
    }

    public void setTfsDate(Date tfsDate) {
        this.tfsDate = tfsDate;
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
