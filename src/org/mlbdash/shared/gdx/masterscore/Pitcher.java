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
package org.mlbdash.shared.gdx.masterscore;

import java.io.Serializable;

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Pitcher implements Serializable {

    @Path("@id") int id;
    @Path("@last") String last;
    @Path("@first") String first;
    @Path("@name_display_roster") String nameDisplayRoster;
    @Path("@number") short number;
    @Path("@era") float era;
    @Path("@wins") short wins;
    @Path("@losses") short losses;
    @Path("@saves") Short saves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public float getEra() {
        return era;
    }

    public void setEra(float era) {
        this.era = era;
    }

    public short getWins() {
        return wins;
    }

    public void setWins(short wins) {
        this.wins = wins;
    }

    public short getLosses() {
        return losses;
    }

    public void setLosses(short losses) {
        this.losses = losses;
    }

    public Short getSaves() {
        return saves;
    }

    public void setSaves(Short saves) {
        this.saves = saves;
    }

}
