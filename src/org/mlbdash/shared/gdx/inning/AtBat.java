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
import java.util.List;

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class AtBat extends Event implements Serializable {

    @Path("@num") short number;
    @Path("@start_tfs") int startTfs;
    @Path("@batter") int batter;
    @Path("@stand") char stand;
    @Path("@height") String height;
    @Path("@pitcher") int pitcher;
    @Path("@p_throws") char pitcherThrows;
    @Path("pitch") List<Pitch> pitches;

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public int getStartTfs() {
        return startTfs;
    }

    public void setStartTfs(int startTfs) {
        this.startTfs = startTfs;
    }

    public int getBatter() {
        return batter;
    }

    public void setBatter(int batter) {
        this.batter = batter;
    }

    public char getStand() {
        return stand;
    }

    public void setStand(char stand) {
        this.stand = stand;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getPitcher() {
        return pitcher;
    }

    public void setPitcher(int pitcher) {
        this.pitcher = pitcher;
    }

    public char getPitcherThrows() {
        return pitcherThrows;
    }

    public void setPitcherThrows(char pitcherThrows) {
        this.pitcherThrows = pitcherThrows;
    }

    public List<Pitch> getPitches() {
        return pitches;
    }

    public void setPitches(List<Pitch> pitches) {
        this.pitches = pitches;
    }

}
