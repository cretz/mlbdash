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
public class HomeRunPlayer implements Serializable {

    @Path("@id") int id;
    @Path("@last") String last;
    @Path("@first") String first;
    @Path("@name_display_roster") String nameDisplayRoster;
    @Path("@number") short number;
    @Path("@hr") short homeRuns;
    @Path("@std_hr") short stdHomeRun;
    @Path("@inning") short inning;
    @Path("@runners") short runners;
    @Path("@team_code") String teamCode;

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

    public short getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(short homeRuns) {
        this.homeRuns = homeRuns;
    }

    public short getStdHomeRun() {
        return stdHomeRun;
    }

    public void setStdHomeRun(short stdHomeRun) {
        this.stdHomeRun = stdHomeRun;
    }

    public short getInning() {
        return inning;
    }

    public void setInning(short inning) {
        this.inning = inning;
    }

    public short getRunners() {
        return runners;
    }

    public void setRunners(short runners) {
        this.runners = runners;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }
    
}
